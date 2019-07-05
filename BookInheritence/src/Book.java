
public class Book extends Info {

	int categorycode;
	
public Book(String name, String author, int year,int categorycode) {
		super(name, author, year);
		this.categorycode=categorycode;
	}

public String cctype() {
	
	switch(categorycode) {
	
	case 1:
		return "Philosophy";

	
	case 2:
		return "Novel-Fiction";
		
	
	case 3:
		return "Autobiography";
		
	
	default:
		return "Anonymous";
		
	
	}
}
public void display() {
	
	System.out.println("Book name : "+name);
	System.out.println("Author : "+author);
	System.out.println("Year : "+year);
	System.out.println("Category : "+this.cctype());
	System.out.println();
}

}


