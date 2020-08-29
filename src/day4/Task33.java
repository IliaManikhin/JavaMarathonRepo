package day4;

import java.util.Arrays;

public class Task33 {

	public static void main(String[] args) {
		
		int[][] array = new int[2][3];
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				array[i][j] = (int)(Math.random()*10);
			System.out.print(array[i][j] + "\t");
			}
		}
		
		int sumString = 0;
		int sumMax = 0;
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				sumString = sumString + array[i][j];
				
			}
			
			if (sumString > sumMax ) {
				sumMax = sumString;
				
			}
			
		}
			System.out.println(sumMax);
//			System.out.println(Arrays.deepToString(array));
			
		

	}

}
