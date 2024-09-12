package liskov.substitution;

public class Employee {
    public final String name;
    public final int payment;

    public Employee(String name, int payment) {
        this.name = name;
        this.payment = payment;
    }

    public int calculatePayment() {
        return this.payment;
    }
}
