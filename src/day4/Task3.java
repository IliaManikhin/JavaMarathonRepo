package day4;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int [][] numbers = new int[12][8];
		int sum = 0;
		int sumMax = 0;
		int index = 0;
		for(int i=0; i<numbers.length; i++) {
			for(int j = 0; j<numbers[i].length; j++) {
				numbers[i][j] = (int)(random.nextInt(50));
				
				 System.out.print(numbers[i][j] +"," + "\t");

								
			}
		       	System.out.println();
		       	
		       
		}		
		System.out.println();
		for (int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				
				sumMax = sum + numbers[i][j] ;
//				sum = sum + numbers[i][j];
				index = numbers[i][j];
				if (sumMax >= sum ) {
					sum = sumMax;
					index = numbers[i][j];
				}
				
				System.out.print("Summa strok " + sumMax);
				
			}
			System.out.println();
			
		}
		
	}

}
/**
На словах что нужно сделать:
Посчитать сумму первой строки (первого внутреннего массива)
Записать сумму в переменную
Записать индекс строки в перемкнную
Посчитать сумму следующей строки
Сравнить ее с предыдущей суммой
Если сумма новой строки больше или ровна предыдущей
Обновить макс сумму
Обновить индекс строки */