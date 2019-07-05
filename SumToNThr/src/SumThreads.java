import java.util.*;
public class SumThreads {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	int n,d,fsum=0;
	System.out.print("Enter till which number you want the sum : ");
	n=sc.nextInt();
	System.out.print("Enter number of Threads : ");
	d=sc.nextInt();
	int inr=n/d;
	int i=1;
	int flag=0;
	while(flag<d)
	{
		Runnable r1= new SumToNThr(i,i+inr);
		Thread t1= new Thread(r1);
		try {
			t1.start();
			t1.join();
			}catch (InterruptedException e ) { System.out.println("Error generated");}
		SumToNThr s1= (SumToNThr)r1;
		fsum+=s1.getSum();
		flag++;
		i+=inr;
	
	}
	System.out.println("The final sum is : "+fsum);
}
}
