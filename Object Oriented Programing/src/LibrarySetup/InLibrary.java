package LibrarySetup;

public class InLibrary {
	public int books;
	public int megazines;
	public int cd;
	
	
	public InLibrary(int books, int megazines, int cd) {
		
		this.books = books;
		this.megazines = megazines;
		this.cd = cd;
	}


	@Override
	public String toString() {
		return "InLibrary [books=" + books + ", megazines=" + megazines + ", cd=" + cd + "]";
	}
	
	
	

}
