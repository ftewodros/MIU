package ioPractice;

public class Car {

        public String make;
        public String model;
        public int year;
        public  Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }
    public Car() {
        this.make = "volks";
        this.model = "passat";
        this.year = 2015;
    }
        @Override
        public String toString() {
            return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
        }

    }




