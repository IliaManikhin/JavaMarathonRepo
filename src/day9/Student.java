package day9;

public class Student extends Human {
	
	private String groupName ;
	
	

	public Student(String name, String groupName) {
		super(name);
		this.groupName = groupName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public void printInfo() {
		System.out.println("��� ������� � ������ " + super.getName());
		System.out.println("��� ������� � ������ " + super.getName());
	}
	

}