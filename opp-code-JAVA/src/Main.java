import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;
        System.out.println("----------Calculate area of shapes-----------");
        while (option != 7) {
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Sphere");
            System.out.println("6. Sube");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch(option){
                case 1: {
                    int a = 0,b = 0;

                    System.out.print("Insert side a: ");
                    a = Integer.parseInt(sc.nextLine());
                    System.out.print("Insert side b: ");
                    b = Integer.parseInt(sc.nextLine());
                    int area = a * b;
                    int per = 2 * a * b;
                    System.out.println("Area: " + area);
                    System.out.println("Perimeter: " + per);
                    }
                    break;
                case 2: {
                    System.out.println("Insert radius:");
                    int r = 0;
                    r = Integer.parseInt(sc.nextLine());
                    int area = (int) (4 * Math.PI * Math.pow(r, 2));
                    System.out.println("Area: " + area);
                    int p = (int) (2 * Math.PI * r);
                    System.out.println("Perimeter: " + p);
                    }
                    break;
                case 3: {
                    System.out.println("Insert height");
                    int h = 0, b = 0;
                    h = Integer.parseInt(sc.nextLine());
                    System.out.print("Insert base");
                    b = Integer.parseInt(sc.nextLine());
                    int area = (int) (0.5 * (Math.sqrt((h * h) - (b * b) / 4 )* b));
                    System.out.println("Area:" + area);
                    int p = 2 * (h + b);
                    System.out.println("Perimeter:" + p);
                    }
                    break;
                case 4:{
                    System.out.println("Insert side");
                    int s = 0;
                    s = Integer.parseInt(sc.nextLine());
                    int area = s * s;
                    System.out.println("Area: " + area);
                    int p = s + s +s + s;
                    System.out.println("Perimieter: " + p);
                    }
                    break;
                case 5:{
                    System.out.print("Insert radius: ");
                    int r = 0;
                    r = Integer.parseInt(sc.nextLine());
                    int area = (int)(4 *  Math.PI * r * r);
                    System.out.println("Area: " + area);
                    int p = (int)(2 * Math.PI * r);
                    System.out.println("Perimeter: " + p);
                    }
                    break;
                case 6:{
                    System.out.println("Insert side ");
                    int s = 0;
                    s = Integer.parseInt(sc.nextLine());
                    int area = s * s + s * s + s * s + s * s + s * s + s * s;
                    int p = s + s + s + s;
                    System.out.println("Area: " + area);
                    System.out.println("Perimeter: " + p);
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
