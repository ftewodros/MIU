package io;

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
        public String toString() {
            return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
        }

    }


