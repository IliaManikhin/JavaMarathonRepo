package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		System.out.println(parseFileToObjList());

	}
	
 public static List<Person> parseFileToObjList() {
		 
		 List<Person> people = new ArrayList(); 
		 
		 File file = new File("people.txt");
		 
		 try {
				Scanner sc = new Scanner(file);
				while(sc.hasNextLine()) {
					String s = sc.nextLine();
					
					String[] person = s.split(" ");
					if (Integer.parseInt(person[1]) < 0) {
						throw new IllegalArgumentException();
					}
					Person pers = new Person(Integer.parseInt(person[1]), person[0] );
					people.add(pers);
					
					}
				sc.close();
				return people;
				
				
				} catch (FileNotFoundException e) {
					System.out.println("Файл не нйден");
				} catch (IllegalArgumentException e) {
					System.out.println("Некорректный входной файл");
				}
		return null;
		
		
	}

}
