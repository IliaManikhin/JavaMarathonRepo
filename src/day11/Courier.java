package day11;

public class Courier implements Worker {
	
	private int salary;
	private Warehouse warehouse;

	@Override
	public void doWork() {
		this.salary = salary + 100;
		
	}

	@Override
	public void bonus() {
		// TODO Auto-generated method stub
		
	}

}
