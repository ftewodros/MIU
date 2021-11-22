package training3;

import lab3.AddressBook;

public class AddressBookTester {
    public static void main(String[] args) {
        AddressBook contactList= new AddressBook();
        Contact p= new Contact("Teddy","Tess");
        PhoneNumber pPhoneNumber= new PhoneNumber(0,1234567890);
        p.getPhoneNumbers().add(pPhoneNumber);
        EmailAddress pEmail= new EmailAddress( 0, "mitgashe@gmail.com" );
        p.getEmailAddresses().add(pEmail);
        Address location= new Address(0, "7thCir", "Aurora", "Colorado",80011);
        p.getAddresses().add(location);


        Contact b= new Contact("john", null);
        PhoneNumber myp= new PhoneNumber(1,1237485990);
        b.getPhoneNumbers().add(myp);
        EmailAddress mye= new EmailAddress(1, "nasa@nasa.gov");
        b.getEmailAddresses().add(mye);
        Address worklocation = new Address();
        b.getAddresses().add(worklocation);

    }
}
