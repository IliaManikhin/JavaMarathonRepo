package day7;

public class TaskN {

	public static void main(String[] args) {
		
		Airplane plane1 = new Airplane("Aeroflot", 1985, 100, 50000);
		Airplane plane2 = new Airplane("Aerobus", 2010, 80, 75000);
		
		Airplane.compareLength(plane1, plane2);
		
		Player p1 = new Player(91);
		Player p2 = new Player(96);
		Player p3 = new Player(90);
		Player p4 = new Player(95);
		
		Player.info();
		
		Player p5 = new Player(99);
		Player p6 = new Player(100);
		
		Player.info();
		
		Player p7 = new Player(99);
		Player p8 = new Player(100);
		
		Player.info();
		
		for(int i =0; i<100; i++)
		p6.run();
		
		Player.info();
		
	}

}
