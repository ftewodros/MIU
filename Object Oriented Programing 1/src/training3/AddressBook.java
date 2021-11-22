package training3;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
  private List<Contact> personalContact;
  private List<Contact> businessContact;


    public AddressBook() {
        this.personalContact = new ArrayList<>();
        this.businessContact = new ArrayList<>();
    }

    public List<Contact> getPersonalContact() {
        return personalContact;
    }

    public List<Contact> getBusinessContact() {
        return businessContact;
    }

    public void AddPersonalContact(Contact con ){
         personalContact.add(con);
    }
    public void AddBusinessContact(Contact input ){
        personalContact.add(input);
    }
    public void deletePersonalContact(Contact con ){
        personalContact.remove(con);
    }
    public void deleteBusinessContact(Contact input ){
        personalContact.remove(input);
    }

}
