package dinterfaceThree;

public class ElectricCar extends Car{

        double batteryCapacity;

        public ElectricCar(String make, String model, int year, double batteryCapacity) {
            super(make, model, year);
            this.batteryCapacity = batteryCapacity;
        }
        @Override
        public boolean equals(Object obj) {
            if(obj == null)
                return false;
            if(!(obj instanceof ElectricCar))
                return false;
            ElectricCar e = (ElectricCar) obj;

            return batteryCapacity == e.batteryCapacity;
        }
    }


