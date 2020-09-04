package day11;

public class Picker implements Worker{
	
	private int salary;
	private Warehouse warehouse;
	
	
	public Picker(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	@Override
	public void doWork () {
		
		this.salary = salary + 80;
//		System.out.println("получена ЗП :" + this.salary);
		
//		for (int i = 0; i<1501; i++)
		warehouse.setCountOrder(warehouse.getCountOrder()+1);
		
		
	}

	@Override
	public void bonus() {
		if (warehouse.getCountOrder() > 1500) {
			this.salary = salary * 3; 
		}
	}


	@Override
	public String toString() {
		return "Picker зарплата = " + salary;
	}
	
	
	
	

}
