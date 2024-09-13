package single.responsibility;

public class Address {
    private String country;
    private String city;
    private String street;
    private int no;

    public void updateAddress(String country, String city, String street, int no) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.no = no;
        System.out.println("Address updated to: " + toString());
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", no=" + no +
                '}';
    }
}
