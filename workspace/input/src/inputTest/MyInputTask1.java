package inputTest;

import java.util.Scanner;

public class MyInputTask1 {
	public static void main(String[] args) {
//	 �̸� ���� alt + shift + R
	
//		�� ������ �Է��� �� ���� ��� ���
//		��, next()�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		String number1 = "" , number2 = "";
		int result = 0;
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		number1 = sc.next();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		number2 = sc.next();
		result = (Integer.parseInt(number1) + Integer.parseInt(number2));
		System.out.println("�� ������ ���� " + result + "�Դϴ�.");
	}
}
