package fInheritanceAndInterface;

public abstract class ParentBank implements depositInterface, withdrawlInterface, printName{



        @Override
        public void makeWithdrawl(double out) {

        }

        @Override
        public void makeDeposit(double in) {

        }

        @Override
        public double getAccountBalance() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public String name() {
            // TODO Auto-generated method stub
            return null;
        }



    }


