import java.util.*;
public class AckermansFxn {

	
	 public static int A(int m,int n) {
		if(m==0)
			return n+1;
		else if(n==0)
			return A(m-1,1);
		else 
			return A(m-1,A(m,n-1));
	}
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.print("Enter m : ");
		int m= s.nextInt();
		
		System.out.print("Enter n : ");
		int n= s.nextInt();
		
		System.out.println("Ackermann's fxn value : "+A(m,n));

	}

}
