import java.util.*;
public class ChessBoardTest {
	
	
	public static void main (String args[]) {
	Piece k = new King("White","d1");
	Piece r = new Rook("Black","a6");
	Piece q = new Queen("White","h8");
	
	ArrayList<Piece> al = new ArrayList<Piece>();
	al.add(k); 
	al.add(r);
	al.add(q);
	
	System.out.println("Created 3 chess pieces : \n");
	
	for(Piece p:al)
		System.out.println((al.indexOf(p)+1)+". "+p.colour+" "+p.name+" at "+p.curPos);
	
	boolean quit=false;
	Scanner sc = new Scanner(System.in);
	int flag=1;
	while(flag==1){
		System.out.println("Enter which piece to be moved (0 to quit) : ");
		int choice =sc.nextInt();
		if(choice ==0) {
			
			flag=0;
			System.out.println("Thank You !");
			break;
	}
		else {
			System.out.println("Enter new position : ");
			String np = sc.next();
		
		switch(choice) {
		
		case 1:
			k.disp(np);
			k.move(np);
			break;
		case 2:
			r.disp(np);
			r.move(np);
			break;
		case 3:
			q.disp(np);
			q.move(np);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
}
		}
	}
}
