package day6;

public class Motorcycle {
	
	private int year;
	private String color;
	private String model;
	private int diff = 0;
	
	
	public void showTypeVehicle () {
		System.out.println("Это Мотоцикл");
	}


	public int showDifference(int passedYear) {
		
		diff  = this.year - passedYear;
		if (passedYear == 0 || passedYear < 0) {
			System.out.println("Год не может быть отрицательным или равным нулю!");
			return passedYear;
		}
		if (passedYear > this.year) {
			diff = passedYear - this.year;
		}
		return diff;
		
	}
	
	public Motorcycle(int year, String color, String model) {
		this.year = year;
		this.color = color;
		this.model = model;
//		System.out.println(year + " , " +  color + " , " + model );
	}
	

	

}
