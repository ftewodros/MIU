package cInheritance;

public class GasCar extends Car{



        double tankCapacity;

        public GasCar() {
            super("Dodge", "Dakota", 2012);
            this.tankCapacity = 13.5;
        }

        public GasCar(String make, String model, int year, double tankCapacity) {
            super(make, model, year);
            this.tankCapacity = tankCapacity;
        }

        @Override
        public String toString() {
            return super.toString() + " Tank Capacity: " + tankCapacity;
        }

        @Override
        public double fillCost(double pricePerGallon) {
            return pricePerGallon * tankCapacity;
        }


    }


