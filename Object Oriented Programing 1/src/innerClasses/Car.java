package innerClasses;

public class Car {

        double horsePower = 150;

        public double topSpeed() {
            class CalculateTopSpeed{
                public double myTopSpeed() {
                    return horsePower * 1.5;
                }
            }

            CalculateTopSpeed c = new CalculateTopSpeed();

            return c.myTopSpeed();
        }

        static class Wheel{
		/*class Hub{
			private int myInt() {
				return 0;
			}
		}*/
        }
    }


