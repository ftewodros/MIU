package dinterfaceThree;

public class EqualTest {

        public static void main(String[] args) {
            Car c1 = new ElectricCar("Ford", "F150", 1998, 720);
            Car c2 = new ElectricCar("Ford", "F150", 1997, 720);

            String s = new String();

            System.out.println(c1.equals(c2));
        }

    }


