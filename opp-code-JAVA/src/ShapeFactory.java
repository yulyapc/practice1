public class ShapeFactory {
    public static Shape createShape(int option, double... parameters) {
        return switch (option) {
            case 1 -> new Rectangle(parameters[0], parameters[1]);
            case 2 -> new Circle(parameters[0]);
            case 3 -> new Triangle(parameters[0], parameters[1]);
            case 4 -> new Square(parameters[0]);
            case 5 -> new Sphere(parameters[0]);
            case 6 -> new Cube(parameters[0]);
            default -> throw new IllegalArgumentException("Invalid shape option");
        };
    }
}
