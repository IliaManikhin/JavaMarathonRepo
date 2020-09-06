package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList(80);
		
		Random random = new Random();
			
			
				for(int i = 0; i<30; i++) {
								 
				 if (i % 2 == 0) {
					 numbers.add(i);
				 }
						 
			}
		
		System.out.println(numbers);
		
		for(int i = 300; i<350; i++) {
			 
			 if (  i >= 300 && i <= 350 && i % 2 == 0) {
				 numbers.add(i);
			 }
					 
		}
		System.out.println(numbers);
		
		
		
	

	}

}
