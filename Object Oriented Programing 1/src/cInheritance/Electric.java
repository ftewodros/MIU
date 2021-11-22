package cInheritance;

public class Electric extends Car{

        double batteryCapacity;

        public Electric() {
            super("Dodge", "Dakota", 2012);
            this.batteryCapacity = 13.5;
        }

        public Electric(String make, String model, int year, double batteryCapacity) {
            super(make, model, year);
            this.batteryCapacity = batteryCapacity;
        }

        @Override
        public String toString() {
            return super.toString() + " Battery Capacity: " + batteryCapacity;
        }

        @Override
        public double fillCost(double pricePerGallon) {
            return (pricePerGallon * batteryCapacity) /4;
        }

        public void someMethod() {}

    }


