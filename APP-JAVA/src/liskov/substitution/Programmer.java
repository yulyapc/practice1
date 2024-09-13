package liskov.substitution;

public class Programmer extends Employee {
    String language;

    public Programmer(String name, int payment, String language) {
        super(name, payment);
        this.language = language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public int calculatePayment() {
        return (int) (this.payment + this.payment * 0.10);
    }
}
