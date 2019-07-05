import java.util.*;
public class SearcherThrTest {
	public static void main(String[] args) {
		  int[] data = {10,3,3,4,6,12,3,-45,61,9,-4,12,4};
		  int element;
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter element to be searched : ");
		  element=sc.nextInt();
		  int n= data.length;
		  SearcherThr s1 = new SearcherThr( data, element, 0, n/2);
		  SearcherThr s2 = new SearcherThr( data, element, (n/2)+1, n-1);
		  Thread t1= new Thread(s1);
		  Thread t2= new Thread(s2);
		  
		  try {
				t1.start();
				t1.join();
				}catch (InterruptedException e ) { System.out.println("Error generated");}
		 
		  try {
				t2.start();
				t2.join();
				}catch (InterruptedException e ) { System.out.println("Error generated");}
		  System.out.println();
		  SearcherThr.display();
		  
		  
	}
	}
