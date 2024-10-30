package studio7;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return (2 * length) + (2 * width);
	}

	public boolean isSquare() {
		return (length == width);
	}

	public boolean isSmaller(Rectangle rectangle2) {
		double area1 = length * width;
		double area2 = rectangle2.length * rectangle2.width;
		return (area1 < area2);
	}		

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(2.0, 3.0);
		Rectangle r2 = new Rectangle(1.0, 1.0);
		
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimeter());
		System.out.println(r1.isSquare());
		System.out.println(r1.isSmaller(r2));
	}
}
