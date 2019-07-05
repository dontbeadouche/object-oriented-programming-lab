
public class Bishop extends Piece {

	public Bishop(String colour, String curPos) {
		super("Bishop", colour, curPos);
		
	}

	
	public void move(String newPos) {
		curPos=newPos;

	}

}
