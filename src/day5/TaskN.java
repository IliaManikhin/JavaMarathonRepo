package day5;

public class TaskN {

	public static void main(String[] args) {
	
		//Экземпляры объектов
		Motorcycle bike1 = new Motorcycle();  
		TaskOneAutomobile car1 = new TaskOneAutomobile();
	
		
		car1.setYear(2000);
		car1.setColor("black");
		car1.setModel("Porsche");
		
		System.out.println(car1.getYear() + "\n" + car1.getColor() + "\n" + car1.getModel());
		
	}
	
	

}
