
public class King extends Piece {

	

	public King( String colour, String curPos) {
		super("King", colour, curPos);
		
	}

	public void move(String newPos) {
		curPos= newPos;

	}

}
