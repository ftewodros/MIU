package HelloWorldPackage;

public class Car {
	String make="ford";
	String model="Escape";
	int plate= 5463;
	int speed= 155;
	double boost= 1.3;

	
	public double calculateTopSpeed(double boost){
		double topSpeed= speed*calculateBoost(boost);
		return topSpeed;
	}
	double calculateBoost(double b) {
		return b+0.1;
	}
}
