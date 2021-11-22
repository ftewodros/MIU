package lab3;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;
    private List<Address> addresses;
    private  String notes;

    public Contact() {
        this.firstName = "Frankie";
        this.lastName ="Lesnake";
        this.phoneNumbers= new ArrayList<PhoneNumber>();
        this.emailAddresses= new ArrayList<EmailAddress>();
        this.addresses= new ArrayList<Address>();
        this.notes= "No Notes.";
    }

    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumbers = new ArrayList<PhoneNumber>();
        this.emailAddresses= new ArrayList<EmailAddress>();
        this.addresses = new ArrayList<Address>();
        this.notes = "No Notes";
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

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
