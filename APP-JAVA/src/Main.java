import dependency.inversion.DataBase;
import interfaces.segregation.CheapCamera;
import interfaces.segregation.SmartCamera;
import liskov.substitution.Employee;
import liskov.substitution.Programmer;
import liskov.substitution.Tester;
import open.close.Drum;
import open.close.Guitar;
import open.close.Piano;
import single.responsibility.User;
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
        User user = new User();
        user.setFirstName("Jhon");
        user.setLastName("Doe");
        user.setEmail("jhon.doe@mail.com");
        user.setUser("jhon.doe");
        user.setPassword("123");

        user.setCountry("USA");
        user.setCity("Pasadena");
        user.setStreet("5th avenue");
        user.setNo(20);

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
        String password = Utils.readString();
        if (user.authenticate(user.getUser(), password)) {
            user.updateAddress(country, city, avenue, no);
            System.out.println(user);
        } else {
            System.out.println("Wrong password");
        }

    }

    public static void playSymphony() {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Drum drum = new Drum();
        int[] notes = new int[]{2,3,4};
        for (int i = 0; i < notes.length; i++) {
            // Reemplazar este segmento con open close
            // Se debe lograr que cada instrumento toque las notas
            // pero sin modificar el cuerpo de las clases
            for (int a = 0; a < notes[i]; a++) {
                guitar.play();
                piano.play();
                drum.play();
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
        // El resultado no es el esperado puesto que esta devolviendo el payment de empleados.
        System.out.println("Total payment employees: " + totalPayment);
    }

    public static void testDatabase() {
        DataBase controller = new DataBase();
        controller.executeQuery("SELECT * FROM PRODUCTS;");
        // Se pide migrar el controlador de MySQL a MongoDB
        // y ejecutar las funciones de dump y poll disponibles.
        controller.dump();
        controller.poll();
    }

    public static void cameraFunction() throws Exception {
        SmartCamera camera = new SmartCamera();
        camera.detectMovement();
        camera.faceRecognition();
        camera.recorVideo();
        camera.zoomIn();
        // Modificar esta seccion para evitar el acceso a funciones no disponibles.
        CheapCamera cheapCam = new CheapCamera();
        cheapCam.detectMovement();
        cheapCam.faceRecognition();
        camera.recorVideo();
        camera.zoomIn();
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
                    testDatabase();
                    break;
                case 5:
                    cameraFunction();
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