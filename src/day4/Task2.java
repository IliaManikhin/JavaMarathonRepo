package day4;

import java.util.Random;


public class Task2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int maxNumber = -1;
		int minNumber = 10001;
		int [] numbers = new int[100];
		int endZero = 0;
		int endZeroSum = 0;
		
		for(int i=0; i<numbers.length; i++) {
		    numbers[i] = (int)(random.nextInt(10000));
		    
		    if (maxNumber <= numbers[i]) {
		    	maxNumber = numbers[i];		    	
		    }
		    if (minNumber > numbers[i]) {
		    	minNumber = numbers[i];		    	
		    }
		    		      
		}
		
		System.out.println("Наибольший элемент массива: " + maxNumber);
		System.out.println("Наименьший элемент массива: " + minNumber);
		
		for (int x:numbers) {
			if ( x % 10 == 0) {
				endZero++;
			}
			if ( x % 10 == 0) {	
				endZeroSum = endZeroSum + x;
				
			}
		}
		System.out.println("Количество элементов массива, оканчивающихся на 0: " + endZero);
		System.out.println("Сумма элементов массива, оканчивающихся на 0: " + endZeroSum);

	}

}
