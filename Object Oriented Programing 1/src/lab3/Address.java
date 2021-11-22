package lab3;

public class Address {
    int type;
    String street;
    String city;
    String state;
    int zip;

    public Address() {
        this.type =0;
        this.street = "1630";
        this.city = "Aurora";
        this.state = "Colorado";
        this.zip = 80017;
    }


    public Address(int type, String street, String city, String state, int zip) {
        this.type = type;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
}
