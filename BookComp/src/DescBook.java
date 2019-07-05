import java.util.*;

public class DescBook implements Comparator<Book> {
	public int compare(Book b1,Book b2)
	{
	    if(b1.getCost()==b2.getCost())
	    		return 0;
	    else if(b1.getCost()>b2.getCost())
	    		return -1;
	    else
	    		return 1;
}
}