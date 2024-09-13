import dependency.inversion.Database;
import dependency.inversion.MongoDB;
import dependency.inversion.MySql;
import interfaces.segregation.CheapCamera;
import interfaces.segregation.SmartCamera;
import liskov.substitution.Employee;
import liskov.substitution.Programmer;
import liskov.substitution.Tester;
import open.close.Drum;
import open.close.Guitar;
import open.close.Piano;
import open.close.adapters.GuitarAdapter;
import open.close.adapters.PianoAdapter;
import open.close.adapters.DrumAdapter;
import open.close.interfaces.Instrument;
import single.responsibility.User;
import single.responsibility.Email;
import single.responsibility.Password;
import single.responsibility.Address;
import utils.Utils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void showMenu() {
        System.out.println("*** SOLID ***");
        System.out.println("1. Single responsibility");
        System.out.println("2. Open close");
        System.out.println("3. Liskov substitution");
        System.out.println("4. Interface segregation");
        System.out.println("5. Dependency inversion");
        System.out.println("6. Exit");
    }

    public static void updateUser() {
        // Crear usuario
        User user = new User("John", "Doe", "jhon.doe", "jhon.doe@mail.com");

        // Actualizar dirección
        Address address = new Address();
        address.updateAddress("USA", "Pasadena", "5th avenue", 20);

        // Crear contraseña
        Password password = new Password("123");

        Email email = new Email();

        password.setPassword("123");

        System.out.println("Update address for Jhon Doe");
        System.out.println("Country: ");
        String country = Utils.readString();
        System.out.println("City: ");
        String city = Utils.readString();
        System.out.println("Av.: ");
        String avenue = Utils.readString();
        System.out.println("No.: ");
        int no = Utils.readInt();
        System.out.println("Enter Jhon passoword to continue:");
        String passwordN = Utils.readString();
        if (password.authenticate(user.getUser(), passwordN)) {
            address.updateAddress(country, city, avenue, no);
            System.out.println(user);
        } else {
            System.out.println("Wrong password");
        }

    }

    public static void playSymphony() {

        List<Instrument> instruments = new ArrayList<>();
        instruments.add(new GuitarAdapter(new Guitar()));
        instruments.add(new PianoAdapter(new Piano()));
        instruments.add(new DrumAdapter(new Drum()));

        int[] notes = new int[]{2, 3, 4};

        for (int note : notes) {
            for (Instrument instrument : instruments) {
                instrument.playNotes(note);
            }
        }
    }

    public static void calculatePayments() {
        Tester[] testers = new Tester[]{
            new Tester("Joan", 1000),
            new Tester("Carment", 1000)};
        Programmer[] programmers = new Programmer[]{
                new Programmer("Aida", 1000, "C#"),
                new Programmer("Julia", 1000, "Java")};

        // Calcular el pago total de todos los empleados
        List<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(testers));
        employees.addAll(Arrays.asList(programmers));

        int totalPayment = 0;
        for (Employee emp : employees) {
            totalPayment += emp.calculatePayment();
        }

        // Mostramos el pago total
        System.out.println("Total payment employees: " + totalPayment);
    }

    public static void testDatabase() {
        // Usar MySql
        Database dbMySql = new Database(new MySql());
        dbMySql.executeQuery("SELECT * FROM users");
        dbMySql.poll();
        dbMySql.dump();

        // Usar MongoDB
        Database dbMongo = new Database(new MongoDB());
        dbMongo.executeQuery("SELECT * FROM users");
        dbMongo.poll();
        dbMongo.dump();
    }

    public static void cameraFunction() throws Exception {
        SmartCamera camera = new SmartCamera();
        camera.detectMovement();
        camera.faceRecognition();
        camera.recorVideo();
        camera.zoomIn();
        
        CheapCamera cheapCam = new CheapCamera();
        cheapCam.takePhoto();
        cheapCam.recorVideo();

    }

    public static void handleMenu() throws Exception {
        int option = 0;

        while (option != 6) {
            showMenu();
            System.out.println("Choose option: ");
            option = Utils.readInt();
            switch (option) {
                case 1:
                    updateUser();
                    break;
                case 2:
                    playSymphony();
                    break;
                case 3:
                    calculatePayments();
                    break;
                case 4:
                    cameraFunction();
                    break;
                case 5:
                    testDatabase();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Wrong option");
                    break;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        handleMenu();
        Utils.close();
    }
}
