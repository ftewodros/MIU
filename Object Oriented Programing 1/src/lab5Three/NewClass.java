package lab5Three;

public class NewClass {

        static double x = 2;
        static double y = 4;

        public static void main(String[] args) {
            System.out.println(multiply(3));

            System.out.println(multiply(6, 3));

            System.out.println(multiply(15));
        }


        static double multiply() {
            return x * y;
        }

        static double multiply(double d1, double d2) {
            return d1 * d2;
        }

        static double multiply(double d1) {
            return d1 * x;
        }
    }


