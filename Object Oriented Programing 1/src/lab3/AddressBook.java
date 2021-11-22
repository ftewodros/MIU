package lab3;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
        private List<Contact> personalContacts;
        private List<Contact> businessContacts;

        public List<Contact> getPersonalContacts() {
            return personalContacts;
        }
        public List<Contact> getBusinessContacts() {
            return businessContacts;
        }

        void AddPersonalContact(Contact in) {
            personalContacts.add(in);
        }
        void AddBusinessContact(Contact in) {
            businessContacts.add(in);
        }

        void deletePersonalContact(Contact in) {
            personalContacts.remove(in);
        }
        void deleteBusinessContact(Contact in) {
            businessContacts.remove(in);
        }

        public AddressBook() {
            personalContacts = new ArrayList<Contact>();
            businessContacts = new ArrayList<Contact>();
        }
    }


