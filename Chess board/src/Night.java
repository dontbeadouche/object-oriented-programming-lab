
public class Night extends Piece {

	public Night(String colour, String curPos) {
		super("Night", colour, curPos);
		
	}

	
	public void move(String newPos) {
		curPos=newPos;

	}

}
