package day7;



public class Airplane {
	
	private String manufacturer;
	private int year;
	private int length;
	private int weight;
	private int fuel = 0;
	
	public Airplane(String manufacturer, int year, int length, int weight) {
		this.manufacturer = manufacturer;
		this.year = year;
		this.length = length;
		this.weight = weight;
	}
	
	
	public void setYear(int year) {
		this.year = year;
	}

	public void setLength(int length) {
		
		this.length = length;
	}
	
	
	public int getLength() {
		if (length <= 0) {
			System.out.println("Длина самолета должна быть положительная!");	
		}
		return length;
	}


	public void fillUp(int gettingFuel) {
		this.fuel += gettingFuel;
			
	}
	
	public static void compareLength (Airplane plane1, Airplane plane2) {
			
		if (plane1.getLength() > plane2.getLength()) {
			System.out.println("Первый самолет длиннее");
		} else if (plane1.getLength() < plane2.getLength()) {
			System.out.println("Второй самолет длиннее");
		} else if (plane1.getLength() == plane2.getLength()) {
			System.out.println("Самолеты  равной длины");
		}
			
	}
	
	
	public void info () {
		
		System.out.println("Изготовитель: "+ manufacturer + ", год выпуска: "+ year + ", длина: " + length + ", вес: " + weight + ", объем топлива в баке: " + fuel);
	}
	
	
	
	
	
	
	
	
	

}
