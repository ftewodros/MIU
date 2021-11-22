package FinalProject;

public class Gas extends Car {

	double thankSize;
	String fuelType; 
	public Gas(String make, String model, int year, double weight, String color,double thankSize, 	String fuelType) {
		super(make, model,color, year, weight);
		this.fuelType= fuelType;
		this.thankSize= thankSize;
			}
	
	
	@Override
	public String toString() {
		return "Gas [thankSize=" + thankSize + ", fuelType=" + fuelType + "]";
	}
	
	
	

}
