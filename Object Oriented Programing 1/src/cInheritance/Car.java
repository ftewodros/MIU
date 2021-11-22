package cInheritance;

public class Car {

        String make;
        String model;
        int year;

        Car(){
            make = "Ford";
            model = "Edge";
            year = 2010;
        }

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Make: " + make + " Model: " + model + " Year: " + year;
        }

        public double fillCost(double pricePerGallon) {
            return pricePerGallon * 0;
        }
    }


