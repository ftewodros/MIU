package innerClasses;

public class CarTest {
        public static void main(String[] args) {
            Car c = new Car();
            System.out.println(c.topSpeed());
            Car.Wheel w = new Car.Wheel();

            //Car.Wheel.Hub h = w.new Hub();
        }
    }

