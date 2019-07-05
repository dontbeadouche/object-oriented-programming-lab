import java.util.*;
class MagicSquare
{
	public static void main(String[] args) {
	
		double [][] magicsqr = new double[4][4];
		Scanner scan =new Scanner(System.in);
		
		
		
		boolean quit = false;
		do {
		System.out.println("Enter even Sum : ");
		double sum=scan.nextDouble();
		double start = (sum/4) -7.5;
		double end = start+15;
		double count = start; 	     
		double invcount = end;
		
		if(sum%2==0) {
		
		for(int i=0;i<4;i++){

			for(int j=0;j<4;j++){

			   if(j>=1 && j<3){
				if(i>=1 && i<3)
					magicsqr[i][j] = count;   
				else 
					magicsqr[i][j] = invcount; 

			   }
			   else if(i<1 || i>=3){
				 magicsqr[i][j]=count;	        
			   }
			   else
	                   {   magicsqr[i][j] = invcount;  	} 

			   count++;
			   invcount--;
			}

		}
		quit=true;
		System.out.println("Magic Square : \n");
	for(int i=0;i<4;i++){
			
			for(int j=0;j<4;j++){
			    
			    System.out.print("  "+magicsqr[i][j]);
			}
			System.out.println();
		}
		}
		else
			System.out.println("Please enter an even number !");
		
	}while(!quit);
		
	}	
}