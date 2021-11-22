package Lab1.Q1;

public class MealCard {

        private int balance_points;
        private static final int INITIAL_BALANCE_POINTS = 100;
        public MealCard(){
            balance_points = INITIAL_BALANCE_POINTS;
        }
        public MealCard(int balance_points) {
            this.balance_points = balance_points;
        }
        public int getBalance() {
            return
                    balance_points;
        }
        public void makePurchase(int itemPrice ){
            if(balance_points >= itemPrice) {
                balance_points = balance_points - itemPrice;
            } else
                System.out.println("\n Balance is negative so purchase of amount "+ itemPrice + " $ is unsuccessful");

        }

        public void buyPoints(int amount) {

            balance_points = balance_points + amount;
        }
    }

