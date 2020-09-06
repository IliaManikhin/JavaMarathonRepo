package day9;

public class Teacher extends Human{
	
	private String discipline;

	public Teacher(String name, String discipline) {
		super(name);
		this.discipline = discipline;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Это преподаватель с именем " + super.getName());
	}
	

}
