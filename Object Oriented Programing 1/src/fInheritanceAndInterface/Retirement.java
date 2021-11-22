package fInheritanceAndInterface;

public class Retirement extends ParentBank implements thebonusInterface{
        double funds;

        @Override
        public void makeDeposit(double in) {
            funds += in*1.1;

        }
        @Override
        public double getAccountBalance() {
            return funds;
        }

        @Override
        public void makeWithdrawl(double out) {
            funds -= out+16;

        }

        @Override
        public String name() {
            // TODO Auto-generated method stub
            return "retirement";
        }
        @Override
        public boolean isBonus() {
            return true;
        }


    }


