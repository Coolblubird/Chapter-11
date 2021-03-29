import java.util.*;

//Jordan Ashe 03-29-21

class elevenDashOne{
	//main
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double s1 = 0.0;
		double s2 = 0.0;
		double s3 = 0.0;
		String c = "";
		boolean f = false;
		
		System.out.println("Please enter a color of a triangle: ");
		c = input.nextLine();
		
		System.out.println("Please enter a side of a triangle: ");
		s1 = input.nextDouble();
		System.out.println("Please enter another side of a triangle: ");
		s2 = input.nextDouble();
		System.out.println("Please enter another side of a triangle: ");
		s3 = input.nextDouble();
		
		System.out.println("Is the triangle filled in or not? (enter 'true' or 'false') ");
		f = input.nextBoolean();
		
		Triangle t = new Triangle(s1,s2,s3,c,f);
		
		System.out.println();
		
		System.out.println(t.toStringT());
		System.out.println(t.toStringGO());
	}
}

//rect class set
class Triangle
		extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
		
	//base constructor
	Triangle() {
		side1=1.0;
		side2=1.0;
		side3=1.0;
	}
		
	//if a new set is given for the constructor
	Triangle(double s1, double s2, double s3, String c, boolean f) {
		side1=s1;
		side2=s2;
		side3=s3;
		setColor(c);
		setFilled(f);
	}

	//self explanitory
	double getS1() {
		return side1;
	}

	//self explanitory
	double getS2() {
		return side2;
	}

	//self explanitory
	double getS3() {
		return side3;
	}

	//self explanitory
	double getArea() {
		double s = (this.getS1() + this.getS2() + this.getS3()) / 2;
		return Math.sqrt(s * (s - this.getS1()) * (s - this.getS2()) * (s - this.getS3()));
	}
		
	//self explanitory
	double getPeri() {
		return this.getS3() + this.getS2() + this.getS1();
	}
	
	//returns a description
	String toStringT() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}

//rect class set
class GeometricObject{
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
		
	//base constructor
	GeometricObject() {
		color = "white";
		filled = false;
		dateCreated = new java.util.Date();
	}
	
	//if a new set is given for the constructor
	GeometricObject(String c, boolean f) {
		color = c;
		filled = f;
	}
	
	String getColor() {
		return color;
	}
	
	void setColor(String c) {
		color = c;
	}
	
	boolean isFilled() {
		return filled;
	}
	
	void setFilled(boolean f) {
		filled = f;
	}
	
	String getDateCreated() {
		return dateCreated.toString();
	}
	
	//returns a description
	String toStringGO() {
		return "GeometricObject: the color is " + color + ", is it filled? " + filled + " And the date it was made on was " + getDateCreated();
	}
}