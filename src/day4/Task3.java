package day4;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int [][] numbers = new int[12][8];
		
		int maxSum = 0;
		int index = 0;
		for(int i=0; i<numbers.length; i++) {
			for(int j = 0; j<numbers[i].length; j++) {
				numbers[i][j] = (random.nextInt(50));
												
			}		       			 		       
		}		
		
		
		for (int i=0; i<numbers.length; i++) {
			int sum = 0;
			for(int j=0; j<numbers[i].length; j++) {
				sum+=numbers[i][j];
																			
			}
			
			if (sum >= maxSum) {
				maxSum = sum;
				index = i;
			}
		}
		System.out.println(index);  
	}

}
