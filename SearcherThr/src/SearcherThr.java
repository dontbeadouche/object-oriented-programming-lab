import java.util.*;


public class SearcherThr implements Runnable {
int el,start,end, arr [];
public static int flag=0;

static ArrayList<Integer> al=new ArrayList<Integer>();
public SearcherThr(int a[],int ele,int s,int e) {
	arr=a;
	el=ele;
	start=s;
	end=e;
	
	}
	
	public void run() {
		
		for(int i=start;i<=end;i++)
		{
			if(arr[i]==el)
			{
				
				flag=1;
				al.add(i);
			}
			
	}
	}
		public static void display() {
			Iterator itr=al.iterator(); 
		if(flag==1) {
		  while(itr.hasNext()){  
			    
			System.out.println("Element found at index "+itr.next());
		  }
		}
		else 
			System.out.println("Element not found");
		}

}
	