
public class Rook extends Piece {

	public Rook(String colour, String curPos) {
		super("Rook", colour, curPos);
		
	}

	
	public void move(String newPos) {
		curPos=newPos;

	}

}
