package fInheritanceAndInterface;

public class Checking extends ParentBank{
        double balance;

        @Override
        public void makeDeposit(double in) {
            balance += in;

        }

        @Override
        public double getAccountBalance() {
            return balance;
        }

        @Override
        public void makeWithdrawl(double out) {
            balance -= out;

        }
        @Override
        public String name() {
            // TODO Auto-generated method stub
            return "checking";
        }

        @Override
        public String myName() {
            // TODO Auto-generated method stub
            return super.myName() + " and it's Mr.checking sandwhich";
        }

    }


