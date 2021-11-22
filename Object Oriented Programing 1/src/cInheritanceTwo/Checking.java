package cInheritanceTwo;

public class Checking extends Account{

        public Checking() {
            super();
        }
        public Checking(double startingBalance) {
            super(startingBalance);
        }

        @Override
        public String toString() {
            return "Checking Account, with balance of: " + super.balance;
        }
    }


