
public class Book implements Comparable<Book>{

	 private String name;
     private double cost;

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Book(String name, double cost) {
		
		this.name = name;
		this.cost = cost;
	}

	public int compareTo(Book other)
	{
	    return this.name.compareTo(other.name);
	}
	 
	public void display()
	{
	System.out.println("Book name : "+name+"     Book cost : "+cost);
	
    	}  
}
