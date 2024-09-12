public class Cube implements Shape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 12 * side;
    }
}
