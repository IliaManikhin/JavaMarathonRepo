package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		System.out.println(parseFileToStringList());

	}
	
	 public static List<String> parseFileToStringList() {
		 
		 List<String> people = new ArrayList(); 
		 
		 File file = new File("people.txt");
		 
		 try {
				Scanner sc = new Scanner(file);
				while(sc.hasNextLine()) {
					String s = sc.nextLine();
					
					String[] person = s.split(" ");
					if (Integer.parseInt(person[1]) < 0) {
						throw new IllegalArgumentException();
					}
					
					people.add(s);
					
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
