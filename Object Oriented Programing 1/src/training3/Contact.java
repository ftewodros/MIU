package training3;

import java.util.*;

public class Contact {
    private String firstName;
    private String lastName;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;
    private List<Address> addresses;
    public String notes;

    public Contact() {
        this.firstName = "feven";
        this.lastName = "Teddy";
        this.phoneNumbers= new ArrayList<PhoneNumber>();
        this.emailAddresses= new ArrayList<EmailAddress>();
        this.addresses= new ArrayList<Address>();
        this.notes = "No Note";
    }

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumbers= new ArrayList<PhoneNumber>();
        this.emailAddresses= new ArrayList<EmailAddress>();
        this.addresses= new ArrayList<Address>();
        this.notes = "No Note";

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public String getNotes() {
        return notes;
    }
}
