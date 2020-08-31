package day8;

public class Task1 {

	public static void main(String[] args) {
		
		
		long before = System.currentTimeMillis();
		
		String st = null ;
		
		for (int i = 0; i<2000; i++) {
			st += " " + i;
//			System.out.println(st + "");
		}
		
		StringBuilder sb = new StringBuilder(st);
		System.out.println(sb.toString());
		
		long after = System.currentTimeMillis();
		System.out.println("Время выполнения программы " + (after - before));
		
		
	}

}
