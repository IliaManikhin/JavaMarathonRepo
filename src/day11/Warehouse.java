package day11;

// Интерфейсы - общее поведение классов  ,  его и вынесем в интерфейс \  public void showInfo(); - у инт-ов нет тела, реализация в каждом классе разная будет   

public class Warehouse {
	
	private int countOrder;
	private int balance;
	
	

	public Warehouse(int countOrder, int balance) {
		this.countOrder = countOrder;
		this.balance = balance;
	}

	public int getCountOrder() {
		return countOrder;
	}

	public void setCountOrder(int countOrder) {
		this.countOrder = countOrder;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Заказов на складе : countOrder=" + countOrder + ", Баланс = " + balance ;
	}
	
}
