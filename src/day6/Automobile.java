package day6;

public class Automobile {
		
		private int year;
		private String color;
		private String model;
		private int diff = 0;
		
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
	
		public void showTypeVehicle () {
			System.out.println("Это Автомобиль");
		}
		
		public int showDifference (int passedYear) {
			diff = this.year - passedYear;
			if (passedYear == 0 || passedYear < 0) {
				System.out.println("Год не может быть отрицательным или равным нулю!");
				return passedYear;
			}
			return diff;
		}
	
}
