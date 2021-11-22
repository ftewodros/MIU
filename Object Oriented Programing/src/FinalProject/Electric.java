package FinalProject;

public class Electric extends Car {
  
	double battereySize;
	String BattryType;
	
	
	public Electric(String make, String model, int year, double weight,	String color,double battereySize, String BattryType) {
		super(make, model,color, year, weight);
		this.battereySize= battereySize;
		this.BattryType= BattryType;
		
			}


	@Override
	public String toString() {
		return "Electric [battereySize=" + battereySize + ", BattryType=" + BattryType + "]";
	}
	
	

}
