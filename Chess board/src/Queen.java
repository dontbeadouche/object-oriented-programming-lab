
public class Queen extends Piece {

	public Queen(String colour, String curPos) {
		super("Queen", colour, curPos);
		
	}

	
	public void move(String newPos) {
		curPos=newPos;

	}

}
