package inputTest;

import java.util.Scanner;

public class MyInputTask2 {
	public static void main(String[] args) {
//		3���� ������ �� ���� �Է¹��� ��
//		�� ������ ���� ���
//		next()�� ���
		
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0, number3 = 0, result = 0;
		String numbersMsg = "3���� ����: ";
		System.out.print(numbersMsg);
		number1 = Integer.parseInt(sc.next());
		number2 = Integer.parseInt(sc.next());
		number3 = Integer.parseInt(sc.next());
		result = number1*number2*number3;
		System.out.println("������ ���� : " + result);
		
		
		
	}
}
