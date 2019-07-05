
public class ShapeTest {

	public static void main(String[] args) {
		Shape s = new Shape("black",true); 
		Rectangle r = new Rectangle(2.0,3.0); 
		Circle c = new Circle(4.0); 
		Square sq = new Square(6.0);

		System.out.println(s);
		System.out.println();
		
		System.out.println(r);
		System.out.println("Area of rectangle is : " +r.getArea());
		System.out.println("Perimeter of rectangle is : "+r.getPerimeter());
		System.out.println();
		
		System.out.println(c);
		System.out.printf("Area of circle is : %.2f",c.getArea());
		System.out.printf("\nPerimeter of circle is : %.2f",c.getPerimeter());
		System.out.println("\n");
		
		System.out.println(sq);
		System.out.println("Area of Square is : "+sq.getArea());
		System.out.println("Perimeter of Square is : "+sq.getPerimeter());
		
	}

}
