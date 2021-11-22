package training3;

public class Address {
    private int type;
    private String city;
    private String state;
    private int zip;

    public Address() {
        this.type = 0;
        this.city = "Aurora";
        this.state = "Colorado";
        this.zip = 80017;
    }
    public Address(int type, String emailAddress, String city, String state, int zip) {
        this.type = type;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public int getType() {
        return type;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }
}

