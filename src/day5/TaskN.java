package day5;

public class TaskN {

	public static void main(String[] args) {
	
		//���������� ��������
		Motorcycle bike1 = new Motorcycle(1940, "black", "Harley-Davidson");  
		Automobile car1 = new Automobile();
	
		
		car1.setYear(2000);
		car1.setColor("black");
		car1.setModel("Porsche");
		
		System.out.println(car1.getYear() + "\n" + car1.getColor() + "\n" + car1.getModel());
		
	}
	
	

}
