package day8;

public class Task1 {

	public static void main(String[] args) {
							
		String st = "";
		
		long before = System.currentTimeMillis();
		for (int i = 0; i<=20000; i++) {
			st += i + " ";

		}
		long after = System.currentTimeMillis();
		System.out.println("Время выполнения программы " + (after - before));
		System.out.println(st);
		
		
		StringBuilder sb = new StringBuilder("");
		
		long before2 = System.currentTimeMillis();
		for (int i = 0; i<=20000; i++) {
			
			sb.append(i).append(" ");
			
		}
		long after2 = System.currentTimeMillis();
		System.out.println("Время выполнения программы со StringBuilder " + (after2 - before2));
		System.out.println(sb);
		
		
		
		
	}

}
