package day3;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double result;
		
		while (true) {
			double dividend = sc.nextDouble();
			double divider = sc.nextDouble();
			
			if (divider == 0) break; 
			
			result = dividend / divider ;
			
			System.out.println(result);
						
		}
		
	}

}
