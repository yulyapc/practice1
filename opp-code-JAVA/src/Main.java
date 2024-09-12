public class Main {

    public static void main(String[] args) {
        IOHandler ioHandler = new IOHandler();

        int option;
        System.out.println("----------Calculate area of shapes-----------");
        do {
            ioHandler.showMenu();
            option = ioHandler.selectOption();
            if (option != 7) {
                handleShapeCalculations(option, ioHandler);
            } else {
                System.out.println("Exiting...");
            }
        } while (option != 7);
    }

    private static void handleShapeCalculations(int option, IOHandler ioHandler) {
        Shape shape = null;
        switch (option) {
            case 1:
                double rectWidth = ioHandler.getValue("Insert width: ");
                double rectHeight = ioHandler.getValue("Insert height: ");
                shape = ShapeFactory.createShape(option, rectWidth, rectHeight);
                break;
            case 2, 5:
                double radius = ioHandler.getValue("Insert radius: ");
                shape = ShapeFactory.createShape(option, radius);
                break;
            case 3:
                double triBase = ioHandler.getValue("Insert base: ");
                double triHeight = ioHandler.getValue("Insert height: ");
                shape = ShapeFactory.createShape(option, triBase, triHeight);
                break;
            case 4, 6:
                double side = ioHandler.getValue("Insert side: ");
                shape = ShapeFactory.createShape(option, side);
                break;
            default:
                System.out.println("Invalid option.");
        }
        if (shape != null) {
            double area = shape.calculateArea();
            double perimeter = shape.calculatePerimeter();
            ioHandler.showResult(area, perimeter);
        }
    }

}



