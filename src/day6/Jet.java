package day6;

public class Jet {
	
	private String manufacturer;
	private int year;
	private int length;
	private int weight;
	private int fuel = 0;
	
	public Jet(String manufacturer, int year, int length, int weight) {
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

	public void fillUp(int gettingFuel) {
		this.fuel += gettingFuel;
		
		
	}
	
	public void info () {
		
		System.out.println("������������: "+ manufacturer + ", ��� �������: "+ year + ", �����: " + length + ", ���: " + weight + ", ����� ������� � ����: " + fuel);
	}

}
