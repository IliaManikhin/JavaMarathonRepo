package day9;

public class Circle extends Figure{
	
	private double circleRadius;
	private double area;
	private double perimetr;
	

	public Circle(double circleRadius, String color) {
		super(color);
		this.circleRadius = circleRadius;
	}
	
	 public double area() {
		 area = (int) (Math.PI * Math.pow(circleRadius, 2));
		 
		return area;
		 
	 }
	 
	 public double perimeter() {
		 perimetr = (int) (2*Math.PI*circleRadius);
		 
		return perimetr;
		 
	 }
	

}
