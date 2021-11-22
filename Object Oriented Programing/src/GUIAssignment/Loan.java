package GUIAssignment;

import java.util.Date;

public class Loan {
	private Publication pub;
	private Date borrowDate;
	
	
	
	public Loan(Publication pub, Date borrowDate) {

		this.pub = pub;
		this.borrowDate = borrowDate;
	}



	public Publication getPub() {
		return pub;
	}



	public Date getBorrowDate() {
		return borrowDate;
	}



	@Override
	public String toString() {
		return "pub=" + pub + ", borrowDate=" + borrowDate ;
	}
	
	

}
