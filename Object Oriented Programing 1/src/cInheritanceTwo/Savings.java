package cInheritanceTwo;

public class Savings extends Account{

        double depositFees;

        public Savings() {
            super();
            depositFees = 5;
        }
        public Savings(double startingBalance, double fees) {
            super(startingBalance);
            depositFees = fees;
        }



        @Override
        public void Deposite(double money) {
            super.Deposite(money - depositFees);
        }
        @Override
        public String toString() {
            return "Savings Account, with balance of: " + super.balance + " and deposite fees of: " + depositFees;
        }
    }


