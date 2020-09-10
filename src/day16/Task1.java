package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//Создаем объект класа FIle, и прописываем ему путь до файла  
		File file = new File("day16task1");
		
		// Scanner чтобы считывать данные из файла 
		//Делаем исключение т.к. файл может быть не найден
		try {
			Scanner scanner = new Scanner(file);
			
			//считаем строку из файла и сохраним ее в переменную 
			String line = scanner.nextLine();
			//Отделим числа в файле по пробелу , метод split(), результат положим в массив строк
			String[] numbers = line.split(" "); 
			
			//Надо посчтитать сумму сначала, чтобы потом рассчитать среднее арифм-е
			
			int sum = 0;
			//Проходимся циклом for each по кажд. эл-у , и прибавляем его к сумме 
			for (String number : numbers) {
				sum+= Integer.parseInt(number);}
				
				//Теперь у нас етсь сумма всех чисел в файле 
				//Среднее арифм-е это сумма разделенная на количество всех чисел 
				
				double result = sum / (double)numbers.length; //преобразовывваем целое число в вещественное ,чтобы сохранить знаки после запятой
				
				System.out.printf(result + "--> %.3f", result);
				
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден");
		}   

	}

}
