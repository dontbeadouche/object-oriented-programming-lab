public class Shape {

	private String colour;
	private boolean filled;

	public Shape() {
		this.colour="green";
		this.filled=true;
	}

	public Shape(String colour, boolean filled) {

		this.colour = colour;
		this.filled = filled;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String toString() {
		return "A Shape with colour of " + colour + " and "+(filled==true ? "filled":"Not filled");
	}


}
