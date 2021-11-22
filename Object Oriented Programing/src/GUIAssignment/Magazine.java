package GUIAssignment;

public class Magazine extends Publication {

	private static int issuesPerYear;
	
	public Magazine(String name, double price, int issuesPerYearn) {
		super(name, price, 0.10, price/issuesPerYear);
		this.issuesPerYear = issuesPerYear;
		
	
	}

	public int getIssuesPerYear() {
		return issuesPerYear;
	}

	@Override
	public String toString() {
		return super.toString()+ "issuesPerYear=" + issuesPerYear ;
	}

}
