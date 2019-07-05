import java.util.*;
public class BookCompTest{

	public static void main(String[] args) {
		Book arr[] = new Book[4];
		
		Scanner sc = new Scanner(System.in);
		arr[0]=new Book("Ignited Minds",1500);
		arr[1]=new Book("The Alchemist",670);
		arr[2]=new Book("Thinking in Java",1250);
		arr[3]=new Book("Algorithm Design",850);
		Arrays.sort(arr);
		 System.out.println("Sorted by Ascending order of name : ");
		for(int i=0;i<=3;i++)
			arr[i].display();
		Arrays.sort(arr,new DescBook()); 
		System.out.println();
		System.out.println("Sorted by Descending order of cost : ");
		for(int i=0;i<=3;i++)
			arr[i].display();
		System.out.println();
		System.out.print("Enter which book to search : ");
		String s=sc.nextLine();
		
		if(GeneralizedSearch.search(arr,s))
			System.out.println("Item is present ");
		else
			System.out.println("Item not present ");
			
	}

	

	
	}

