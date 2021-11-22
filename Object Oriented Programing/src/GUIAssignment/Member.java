package GUIAssignment;

import java.util.*;

public class Member {
	private String name;
	private int id;
	private int limit;
	private int duration;
	private List<Loan> loans= new ArrayList<Loan>();
	
	
	
	public Member(String name, int id,int limit, int duration) {
		super();
		this.name = name;
		this.id = id;
		this.limit= limit;
		this.duration= duration;

	}


	public List<Loan> getPub() {
		return loans;
	}


	public int getDuration() {
		return duration;
	}


	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Member name=" + name + ", id=" + id ;
	}
	
	public String publicationStatus() {
		String s = "";
		Date d= new Date();
		
		for(Loan value: loans) {
			int numberOfDays= d.getDay() - value.getBorrowDate().getDay();
			if(numberOfDays>(duration))
			s+=value+ ", Overdue Charges"+ d;
		}
		return s;
	}
	
	
	
	

}
