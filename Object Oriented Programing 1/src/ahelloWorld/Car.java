package ahelloWorld;

public class Car {

        String make = "Ford";
        String model = "Escape";
        int plate = 5463;
        int speed = 155;


        public double calculateTopSpeed(double boost) {
            if(boost <= 0)
                return 100;
            double topSpeed = speed * calculateBoost(boost);
            return topSpeed;
        }

        double calculateBoost(double b) {
            return b + 0.1;
        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public int getPlate() {
            return plate;
        }

        public int getSpeed() {
            return speed;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setPlate(int plate) {
            this.plate = plate;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public Car(String make, String model, int plate, int speed) {
            super();
            this.make = make;
            this.model = model;
            this.plate = plate;
            this.speed = speed;
        }

        public Car() {

        }

    }

