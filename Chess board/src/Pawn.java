
public class Pawn extends Piece {

	public Pawn(String colour, String curPos) {
		super("Pawn", colour, curPos);
		
	}

	
	public void move(String newPos) {
		curPos=newPos;

	}

}
