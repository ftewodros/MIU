package FinalProject;

public class Car {


	       String make;
	       String model;
           String color;
	       int year;
           double weight;
           
           
           
           
	        public Car(String make, String model,String color, int year,double weight) {
	            this.make = make;
	            this.model = model;
	            this.year = year;
	            this.weight=weight;
	            this.color= color;

	            
	        }
	        
	        

	    


			@Override
	        public String toString() {
	            return "make=" + make + ", model=" + model + ", year=" + year+" weight "+ weight;
	        }


	    }




