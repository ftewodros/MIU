package cInheritanceTwo;

public class Retirement extends Account{

        double intrest;

        public Retirement() {
            super();
            intrest = 1;
        }
        public Retirement(double startingBalance, double extra) {
            super(startingBalance);
            intrest = extra;
        }

        @Override
        public void Deposite(double money) {
            super.Deposite(money * (1+(intrest/100)));
        }
        @Override
        public String toString() {
            return "Retirement Account, with balance of: " + super.balance + " an interest of: " + intrest+"%";
        }
    }


