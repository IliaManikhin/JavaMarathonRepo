package day6;

import java.util.Random;

public class Teacher {
	
	
	Random rand = new Random();
	private String name;
	private String discipline;
	private int mark;
	private String markText;
	
	public Teacher(String name, String discipline) {
		this.name = name;
		this.discipline = discipline;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}
	
	public void rateStudent (Student st) {
		st.setName("Emmet Brown");
		
		int a=2;
		int b=5;
		
		mark  =  a +  rand.nextInt(b - a + 1);
		
		if (mark == 2) {
			markText = "�������������������";
		} else if (mark == 3) {
			markText = "�����������������";
		} else if (mark == 4) {
			markText = "������";
		} else {
			markText = "�������";
		}
		
		System.out.println("������������� " + name + " ������ �������� � ������ " + st.getName() + " �� �������� " + discipline + " �� ������ " + markText);
		
	}

}
