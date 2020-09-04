package day11;

public class Picker implements Worker{
	
	private int salary;
	private Warehouse warehouse;
	
	
	public Picker() {
		
	}
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	public Warehouse getWarehouse() {
		return warehouse;
	}


	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}


	@Override
	public void doWork () {
		this.salary = salary + 80;
		warehouse.setCountOrder(); 
		
	}

	@Override
	public void bonus() {
		// TODO Auto-generated method stub
		
	}
	
	

}
