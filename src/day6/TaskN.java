package day6;

public class TaskN {

	public static void main(String[] args) {
	
		//Ёкземпл€ры объектов
		Motorcycle bike1 = new Motorcycle(1940, "black", "Harley-Davidson");  
		Automobile car1 = new Automobile();
		Jet airplane1 = new Jet("Dubai Airlines", 2005, 76, 183500); 
	
		car1.showTypeVehicle();
		bike1.showTypeVehicle();
		car1.setYear(2000);
		
		
		System.out.println(car1.showDifference(1970));
		System.out.println(bike1.showDifference(2000));
		System.out.println();
		
		// ¬ызовы по самолЄту 
		airplane1.setYear(2012);
		airplane1.setLength(85);
		airplane1.fillUp(40000);
		airplane1.fillUp(36000);
		airplane1.info();
		
		//”читель и студент
		Teacher teach = new Teacher("Clint Eastwood", "History of wild west");
		Student stud = new Student("Marty McFly");
		
		teach.rateStudent(stud);
		
		
		
//		car1.setColor("black");
//		car1.setModel("Porsche");
//		
//		System.out.println(car1.getYear() + "\n" + car1.getColor() + "\n" + car1.getModel());
		
	}
	
	

}
