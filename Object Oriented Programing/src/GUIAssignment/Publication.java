package GUIAssignment;

public class Publication {
	
	private String name;
	private double price;
	private double OverdueCharge;
	private double MaxCharge;
	public Publication(String name, double price, double overdueCharge, double maxCharge) {
		super();
		this.name = name;
		this.price = price;
		OverdueCharge = overdueCharge;
		MaxCharge = maxCharge;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public double getOverdueCharge() {
		return OverdueCharge;
	}
	public double getMaxCharge() {
		return MaxCharge;
	}
	@Override
	public String toString() {
		return "Publication [name=" + name + ", price=" + price + ", OverdueCharge=" + OverdueCharge + ", MaxCharge="
				+ MaxCharge + "]";
	}
	
	
}
