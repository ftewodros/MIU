package fInheritanceAndInterface;

public class Saving extends ParentBank implements thebonusInterface{

        double amount;

        @Override
        public void makeDeposit(double in) {
            amount += in-5;

        }
        @Override
        public double getAccountBalance() {
            return amount;
        }

        @Override
        public void makeWithdrawl(double out) {
            amount -= out+2;

        }
        @Override
        public String name() {
            // TODO Auto-generated method stub
            return "savings";
        }
        @Override
        public boolean isBonus() {
            return false;
        }
    }


