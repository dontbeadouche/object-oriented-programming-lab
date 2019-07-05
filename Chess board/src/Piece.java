
public abstract class Piece implements Movable {

	String name;
	String colour;
	String curPos;
	
	public Piece(String name, String colour, String curPos) {
		
		this.name = name;
		this.colour = colour;
		this.curPos = curPos;
	}
	
	public void disp(String a)
	{ System.out.println(this.colour+" "+this.name+" Moving from "+this.curPos+" to "+a);
	}
	
	

}
