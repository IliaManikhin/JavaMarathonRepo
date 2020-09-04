package day9;

public class Rectangle extends Figure{
	
	private double width;
	private double height;
	private double area;
	private double perimeter;
	public Rectangle(double width, double height, String color) {
		super(color);
		this.width = width;
		this.height = height;
		
	}
	
	public double area() {
		area = width * height;
		
		return area;
	 }
	 
	 public double perimeter() {
		 perimeter = 2*(width + height);
		 return perimeter;
	 }
	
	

}
