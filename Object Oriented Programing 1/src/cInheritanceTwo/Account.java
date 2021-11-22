package cInheritanceTwo;

public class Account {

        double balance;

        public Account() {
            balance = 0;
        }
        public Account(double startingBalance) {
            balance = startingBalance;
        }

        public void Deposite(double money) {
            balance += money;
        }

    }


