package single.responsibility;

public class Password {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public boolean authenticate(String user, String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
