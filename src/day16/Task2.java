package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws FileNotFoundException {
		//Создаем объект класса random для генерации чисел 
		Random random = new Random();
			
		File file1 = new File("day16task2");
		
		//PrintWriter будет читать то что мы напишем в файле 
		//Так же он должен выбросить искл-е в случае если файл не найден
		//PrintWriter автоматом создаст файл, если мы этого не сделали, и туда он будет писать данные сам  
		PrintWriter pw1 = new PrintWriter(file1);
		
		//Цикл for с 1000 итерациями 
		for(int i = 0; i < 1000; i++) {
			//С помощью метода println добавляем случайное число в диапазоне от 0 до 100
			pw1.println(random.nextInt(100));
		}
		pw1.close(); // закрываем PrintWriter 
		
		//Создаем Scanner чтобы считывать с файла цифры 
		Scanner scanner = new Scanner(file1); 
		
		//Создаем второй файл , чтобы в него записать то что счтитаем со сканера 
		File file2 = new File("day16task2file2");
		
		//Создаем  PrintWriter еще один, чтобы писать во второй файл
		PrintWriter pw2 = new PrintWriter(file2);
		
		//Создаем счетчик чтобы знать сколько мы чисел уже просмотрели в файле 1
		int counter = 0;
		int sum = 0;  // Здесь будем считать сумму группы чисел 
		
		//Цикл while будет работать пока есть строки в файле, который читает сканер  
		while(scanner.hasNextInt()) {
			sum += Integer.parseInt(scanner.nextLine()); //Каждое сканируемое число, будет суммировться в переменную sum
			counter++;
			
			//Как только нашли 20 чисел выводим в файл номер два, их среднее арифметическое 
			if(counter == 20) {
				pw2.println(sum / 20.0);
				
				//Чтобы продолжить считывать следующие 20 чисел, надо обнулить счетчик и сумму 
				counter = 0;
				sum = 0; 
			}
		}
		
		pw2.close();
		
		//Еще один Scanner чтобы считывать файл 2 
		
		Scanner scanner2 = new Scanner(file2);
		
		double result = 0;
		
		//Т.к. в файле числа вещественные, то и парсить надо из строк в double  
		while(scanner2.hasNextLine()) {
			result += Double.parseDouble(scanner2.nextLine());
		}
		
		//Выводим результат, но отбросив вещественную часть 
		System.out.println((int)result);
		
		
		

	}

}
