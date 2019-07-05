 class SumToNThr implements Runnable {

	int start,end,sum;
	

	public SumToNThr(int s, int e) {
		
		start = s;
		end = e;
	}


	public void run() {
		
		int a=0;
		for(int i=start;i<end;i++)
		{ a+=i;}
		sum=a;
		System.out.println("Sum from "+start+" to "+(end-1)+" is "+sum);
		

	}
public int getSum() { return sum;}
}

