package day11;

public class Courier implements Worker {
	
	private int salary;
	private Warehouse warehouse;
	
	public Courier(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	@Override
	public void doWork() {
		 
		this.salary = salary + 100;
		
		warehouse.setBalance((warehouse.getBalance()+1000));
		
//		for (int i =0; i<=1000001; i = i +1) {
//			warehouse.setBalance((warehouse.getBalance() + i));
//		}
		
	}

	@Override
	public void bonus() {
		if(warehouse.getBalance() > 1000000) {
			 this.salary = salary *2;
		 }
		
	}

	@Override
	public String toString() {
		return "Courier зарплата = " + salary;
	}
	
	

}
