package stringTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
//		����ڿ��� �Է¹��� ���ڿ� �� �ҹ��ڴ� ��� �빮�ڷ�,
//		�빮�ڴ� ��� �ҹ��ڷ� �����Ѵ�.
//		Scanner sc = new Scanner(System.in);
//		String msg = "���ڿ��� �Է��ϼ���: ", letter = null;
//		System.out.println(msg);
//		letter = sc.next();
//		for (int i = 0; i < letter.length(); i++) {
//			char[] letter2 = new char[letter.length()]; 
//			letter2[i] = letter.charAt(i);
//			if(letter.charAt(i) < (char)97) {
//			letter2[i] = (char) (letter.charAt(i) + 32);
//			}
//			
//			if(letter.charAt(i) > (char)96) {
//			letter2[i] = (char) (letter.charAt(i) - 32);
//			}
//			System.out.print(letter2[i]);
//		}
		
		
		
//		������ �ѱ۷� ����
//		��) 1024 -> �ϰ��̻�
//		Scanner sc = new Scanner(System.in);
//		String msg = "������ �Է��ϼ���: ";
//		String numbers = null;
//		System.out.print(msg);
//		char[] numCheck = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//		char[] korNum = {'��', '��', '��', '��', '��', '��', '��', 'ĥ', '��', '��'};
//		numbers = sc.next();
//		for (int i = 0; i < numbers.length(); i++) {
//			char[] numbers2 = new char[numbers.length()];
//			for (int j = 0; j < numCheck.length; j++) {
//				if(numbers.charAt(i)==numCheck[j]) {
//					numbers2[i] = korNum[j];
//				}
//				
//			}
//			System.out.print(numbers2[i]);
//		}
		
		Scanner sc = new Scanner(System.in);
		String msg = "���ڿ��� �Է��ϼ���: ", letter = null;
		System.out.println(msg);
		letter = sc.next();
		for (int i = 0; i < letter.length(); i++) {
			char[] letter2 = new char[letter.length()]; 
			letter2[i] = letter.charAt(i);
			if(letter.charAt(i) >= (char)65 && letter.charAt(i) <= (char)90) {
			letter2[i] = (char) (letter.charAt(i) + 32);
			
			}else if(letter.charAt(i) >= (char)97 && letter.charAt(i) <= (char)122){
			letter2[i] = (char) (letter.charAt(i) - 32);
		
			}else if(letter.charAt(i) < (char)65 || letter.charAt(i) > (char)122 ) {
			letter2[i] = (char)(letter.charAt(i));
			}
				
			System.out.print(letter2[i]);
		}
	}
}
