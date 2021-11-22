package lab3;

public class AddressBookTester {

        public static void main(String[] args) {
            AddressBook book = new AddressBook();
            Contact p2 = new Contact("Willam", "Messi");
            PhoneNumber messisPhone = new PhoneNumber();
            p2.getPhoneNumbers().add(messisPhone);
            EmailAddress messisEmail = new EmailAddress(0, "wmessi@liverpool.com");
            p2.getEmailAddresses().add(messisEmail);
            Address messisAddress = new Address(0, "Messi's St", "Messidonia", "Messiopolis", 3564);
            p2.getAddresses().add(messisAddress);

            PhoneNumber grumpsPhone = new PhoneNumber(1, 846512565);
            PhoneNumber grumpPersonal = new PhoneNumber(0, 666666666);
            EmailAddress grumpsEmail = new EmailAddress(1, "rgrump@grumpTower.cash");
            Address grumpsAddress = new Address(1, "Money St", "Richville", "BigApple", 47284);
            Contact b1 = new Contact("Ronald", null);
            b1.getPhoneNumbers().add(grumpsPhone);
            b1.getPhoneNumbers().add(grumpPersonal);
            b1.getEmailAddresses().add(grumpsEmail);
            b1.getAddresses().add(grumpsAddress);
        }
    }
