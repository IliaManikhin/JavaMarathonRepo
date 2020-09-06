package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		
		List<String> cars = new ArrayList();
		cars.add("BMW");
		cars.add("Mercedes");
		cars.add("Audi");
		cars.add("Mazda");
		cars.add("Nissan");
		
		cars.add(2,"Ford");
		cars.remove(0);
		for(String l:cars) {
			System.out.println(l);
		}
		
		

	}

}
