package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int checkEight = 0;
		int checkOne = 0;
		int even = 0;
		int uneven = 0;
		int sum = 0;
		
		int [] numbers = new int[n];
		
		for(int i=0; i<numbers.length; i++) {
		    numbers[i] = (int)(random.nextInt(10));
		    System.out.print(numbers[i] + " ");
		     
		}
		
		System.out.println("����� �������: " + numbers.length);
			
		for (int numbersCheck:numbers) {
			sum = sum + numbersCheck;
			
			 if (numbersCheck > 8 ) {			    				    
			      checkEight++;
			    }
			 if (numbersCheck == 1) {
				 checkOne++;
			 }
			 if (numbersCheck % 2 == 0) {
				 even++;
			 }
			 if (numbersCheck % 2 != 0) {
				 uneven++;
			 }
			 
		}
		System.out.println("���������� ����� ������ 8: " + checkEight);
		System.out.println("���������� ����� ������ 1: " + checkOne);
		System.out.println("���������� ������ �����: " + even);
		System.out.println("���������� �������� �����: " + uneven);
		System.out.println("����� ���� ��������� �������: " + sum);
	

	}

}
