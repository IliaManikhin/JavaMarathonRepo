package day3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double result;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("������� ��� �����: ������� � ��������");
			double dividend = sc.nextDouble();
			double divider = sc.nextDouble();
			
			if( divider == 0) {
				System.out.println("������� �� 0");
				continue;
			}
			
			result = dividend / divider ;
			
			System.out.println(result);
			
			
		}
		

	}

}
