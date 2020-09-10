package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws FileNotFoundException {
		//������� ������ ������ random ��� ��������� ����� 
		Random random = new Random();
			
		File file1 = new File("day16task2");
		
		//PrintWriter ����� ������ �� ��� �� ������� � ����� 
		//��� �� �� ������ ��������� ����-� � ������ ���� ���� �� ������
		//PrintWriter ��������� ������� ����, ���� �� ����� �� �������, � ���� �� ����� ������ ������ ���  
		PrintWriter pw1 = new PrintWriter(file1);
		
		//���� for � 1000 ���������� 
		for(int i = 0; i < 1000; i++) {
			//� ������� ������ println ��������� ��������� ����� � ��������� �� 0 �� 100
			pw1.println(random.nextInt(100));
		}
		pw1.close(); // ��������� PrintWriter 
		
		//������� Scanner ����� ��������� � ����� ����� 
		Scanner scanner = new Scanner(file1); 
		
		//������� ������ ���� , ����� � ���� �������� �� ��� �������� �� ������� 
		File file2 = new File("day16task2file2");
		
		//�������  PrintWriter ��� ����, ����� ������ �� ������ ����
		PrintWriter pw2 = new PrintWriter(file2);
		
		//������� ������� ����� ����� ������� �� ����� ��� ����������� � ����� 1
		int counter = 0;
		int sum = 0;  // ����� ����� ������� ����� ������ ����� 
		
		//���� while ����� �������� ���� ���� ������ � �����, ������� ������ ������  
		while(scanner.hasNextInt()) {
			sum += Integer.parseInt(scanner.nextLine()); //������ ����������� �����, ����� ������������ � ���������� sum
			counter++;
			
			//��� ������ ����� 20 ����� ������� � ���� ����� ���, �� ������� �������������� 
			if(counter == 20) {
				pw2.println(sum / 20.0);
				
				//����� ���������� ��������� ��������� 20 �����, ���� �������� ������� � ����� 
				counter = 0;
				sum = 0; 
			}
		}
		
		pw2.close();
		
		//��� ���� Scanner ����� ��������� ���� 2 
		
		Scanner scanner2 = new Scanner(file2);
		
		double result = 0;
		
		//�.�. � ����� ����� ������������, �� � ������� ���� �� ����� � double  
		while(scanner2.hasNextLine()) {
			result += Double.parseDouble(scanner2.nextLine());
		}
		
		//������� ���������, �� �������� ������������ ����� 
		System.out.println((int)result);
		
		
		

	}

}
