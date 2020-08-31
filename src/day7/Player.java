package day7;

import java.util.Random;

public class Player {
	Random rand = new Random();
	
	private  int stamina;
	private static final int MAX_STAMINA = 100;
	private static final int MIN_STAMINA = 0;
	private static int countPlayers = 0;
	private static int fieldPlayers = 6;
	
	
	public Player (int stamina) {
		this.stamina = stamina;
		
		   countPlayers ++;
	}
	
	public  void run() {
		while (stamina > MIN_STAMINA ) {
			stamina--;
		}
		countPlayers--;
		countPlayers++;
//		System.out.println(countPlayers);
	}
	
	public void info () {
		
		fieldPlayers = fieldPlayers - countPlayers;
		
		if ( countPlayers < 6) {
			System.out.println("Команды неполные, еще есть " + fieldPlayers + " свободных мест");
		} else if ( countPlayers >= 7) {
			countPlayers = 6;
		} else {
			System.out.println("Мест в команде больше нет");
		}
	}
	
	
	
//	public void setStamina(int stamina) {
//	
//		int a=90;
//		int b=100;
//
//		this.stamina  =  a +  rand.nextInt(b - a + 1);
//		
//		this.stamina = stamina;
//	}
//	
//	public int getStamina() {
//		return stamina;
//	}


	
	

}
