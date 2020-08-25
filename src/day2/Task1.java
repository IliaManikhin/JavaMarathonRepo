package day2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите этаж дома:");
		int floor = sc.nextInt();
		
		if (floor > 0 && floor < 5) {
			System.out.println("Малоэтажный дом");
		}else if (floor > 4 && floor < 9) {
			System.out.println("Среднеэтажный дом");
		}else if (floor > 8) {
			System.out.println("Многоэтажный  дом");
		}else  {
			System.out.println("Некорректный ввод.");
		}

	}

}
