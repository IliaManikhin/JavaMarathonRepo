package day11;

// ���������� - ����� ��������� �������  ,  ��� � ������� � ��������� \  public void showInfo(); - � ���-�� ��� ����, ���������� � ������ ������ ������ �����   

public class Warehouse {
	
	private int countOrder;
	private int balance;
	
	

	public Warehouse(int countOrder) {
		this.countOrder = countOrder;
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
		return "Warehouse [countOrder=" + countOrder + ", balance=" + balance + "]";
	}
	
}
