
public class GeneralizedSearch {
	public static boolean search(Book[] arrr,String n) {
		int flag=0;
		for(Book b: arrr)
		{		 if (b.getName().equals(n))
			{	
					flag=1;
					break;
			}
	}
	
		if (flag==1)
			return true;
		else 
			return false;
		
		
		
	
	}
}
