package dinterfaceThree;

public class Car {
        String make;
        String model;
        int year;
        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == null)
                return false;
            if(!(obj instanceof Car))
                return false;
            Car c = (Car) obj;
            return (make.equals(c.make) && model.equals(c.model) && year == c.year);
        }

    }


