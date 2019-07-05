
public class Square extends Rectangle {
private double side;
	public Square() {
		this.side=1.0;
	}

	public Square(double side ){
		super(side, side);
		this.side=side;
		
	}

	public Square(double side, String colour, boolean filled) {
		super(side, side, colour, filled);
		this.side=side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	
	public void setWidth(double width) {
		super.setWidth(width);
	}

	public void setLength(double length) {
		super.setLength(length);
	}

	public String toString() {
		return "A Square with side = " + side + ", which is a subclass of "+super.toString();
	}

}
