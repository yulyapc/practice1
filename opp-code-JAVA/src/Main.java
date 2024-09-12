import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int optionSelected;
        System.out.println("----------Calculate area of shapes-----------");
        do {
            optionsMenu();
            optionSelected = selectOption();
            executeOption(optionSelected);
        } while (optionSelected != 7);
    }


    public static void optionsMenu(){
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Sphere");
            System.out.println("6. Sube");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
    }

    private static int selectOption() {
        while (true) {
            try {
                int option = Integer.parseInt(scanner.nextLine());
                if (option >= 1 && option <= 7) {
                    return option;
                } else {
                    System.out.println("Invalid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, option is a number.");
            }
        }
    }

    private static void executeOption(int option) {
        switch (option) {
            case 1 -> rectangle();
            case 2 -> circle();
            case 3 -> triangle();
            case 4 -> square();
            case 5 -> sphere();
            case 6 -> cube();
            case 7 -> System.out.println("Exiting...");
            default -> System.out.println("No valid option, please select a number between 1-7.");
        }
    }

    private static void rectangle() {
        double width = getValueFromUser("Insert side 1: ");
        double height = getValueFromUser("Insert side 2: ");
        double area = width * height;
        double perimeter = 2 * (width + height);
        showInfoToUser(area, perimeter);
    }

    private static void circle() {
        double radius = getValueFromUser("Insert radius: ");
        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;
        showInfoToUser(area, perimeter);
    }

    private static void triangle() {
        double base = getValueFromUser("Insert base: ");
        double height = getValueFromUser("Insert height: ");
        double area = 0.5 * base * height;
        double perimeter = base + 2 * height; 
        showInfoToUser(area, perimeter);
    }

    private static void square() {
        double side = getValueFromUser("Insert side: ");
        double area = side * side;
        double perimeter = 4 * side;
        showInfoToUser(area, perimeter);
    }

    private static void sphere() {
        double radius = getValueFromUser("Insert radius: ");
        double area = 4 * Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;  
        showInfoToUser(area, perimeter);
    }

    private static void cube() {
        double side = getValueFromUser("Insert side: ");
        double area = 6 * Math.pow(side, 2);
        double perimeter = 12 * side;  
        showInfoToUser(area, perimeter);
    }

    // function to get info from user
    private static double getValueFromUser(String info) {
        double valueFromUser;
        while (true) {
            try {
                // get infro from user and validate that value is a double
                System.out.print(info);
                valueFromUser = Double.parseDouble(scanner.nextLine());
                if (valueFromUser > 0) {
                    return valueFromUser;
                } else { // return error when value isn't greater than zero
                    System.out.println("Value must be greater than zero.");
                }
            } catch (NumberFormatException e) {  // return error when value isn't a number
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    // function to show the calculated value
    private static void showInfoToUser(double area, double perimeter) {
        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
    }

}



