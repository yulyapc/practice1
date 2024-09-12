package single.responsibility;

import javax.security.auth.Subject;

public class User {
    private String firstName;
    private String lastName;
    private String Country;
    private String City;
    private String street;
    private int no;
    private String user;
    private String password;
    private String email;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean authenticate(String user, String password) {
        return this.user.equals(user) && this.password.equals(password);
    }

    public void updateAddress(String country, String city, String street, int no) {
        this.setCountry(country);
        this.setCity(city);
        this.setStreet(street);
        this.setNo(no);
    }

    public void sendEmail(String subject, String message, String email) {
        System.out.println("From: " + this.email);
        System.out.println("To: " + email);
        System.out.println("Subject" + subject);
        System.out.println(message);
        System.out.println("Regards");
        System.out.println(this.user);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Country='" + Country + '\'' +
                ", City='" + City + '\'' +
                ", street='" + street + '\'' +
                ", no=" + no +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
