package day9;

public class Triangle extends Figure{
	
	private double lengthA;
	private double lengthB;
	private double lengthC;
	private double perimeter;
	private double halfPerimeter;
	private double area;
	
	
	public Triangle(double lengthA, double lengthB, double lengthC, String color) {
		super(color);
		this.lengthA = lengthA;
		this.lengthB = lengthB;
		this.lengthC = lengthC;
	}
	
	public double area() {
		halfPerimeter = (lengthA+lengthB+lengthC)/2;
		area = Math.sqrt(halfPerimeter*(halfPerimeter-lengthA)*(halfPerimeter-lengthB)*(halfPerimeter-lengthC));
		return area;
	 }
	 
	 public double perimeter() {
		 perimeter = lengthA + lengthB + lengthC;
		 return perimeter;
	 }
	
	
	
	

}
