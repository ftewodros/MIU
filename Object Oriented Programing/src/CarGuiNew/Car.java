package CarGuiNew;

public class Car {
	
		private String make;
		private String model;
		private int year;
		
		
		public Car(String make, String model, int year) {
			super();
			this.make = make;
			this.model = model;
			this.year = year;
		}


		@Override
		public String toString() {
			return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
		}
		
		

	}



