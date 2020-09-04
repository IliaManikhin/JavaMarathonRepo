package day9;

public class Task1 {

	public static void main(String[] args) {
		
		Student st1 = new Student("Neo", "Web-developers");
		Teacher t1 = new Teacher("Morpheus", "Web-development");
		
		
		System.out.println(st1.getGroupName());
		System.out.println(t1.getDiscipline());
		st1.printInfo();
		t1.printInfo();

	}

}


