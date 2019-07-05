
public class Info {

	String name,author;
	int year;
	
	public Info(String name, String author, int year) {
		
		this.name = name;
		this.author = author;
		this.year = year;
	}
	
	public void display() {
		System.out.println("Book name : "+name);
		System.out.println("Author : "+author);
		System.out.println("Year : "+year);
	}

}
