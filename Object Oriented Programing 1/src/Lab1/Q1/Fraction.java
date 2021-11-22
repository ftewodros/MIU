package Lab1.Q1;

public class Fraction {

        private int numerator;
        private int denominator;
        double decimal;

        public Fraction(int num, int denom) {
            numerator = num;
            if (denom == 0) {
                System.out.println("Fatal Error");
                System.exit(1);
            }else
                denominator = denom;
            if (denom != 0)
                decimal = num / denom;
        }

        public int compare(Fraction f1) {

            if (f1.decimal > this.decimal)
                return 1;

            else if (f1.decimal < this.decimal)
                return -1;
            else
                return 0;

        }

        public static void main(String[] args) {

            Fraction f1 = new Fraction(15, 5);
            Fraction f2 = new Fraction(10, 5);
            System.out.println(f1.compare(f2));

        }
    }



