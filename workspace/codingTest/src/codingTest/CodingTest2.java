package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class CodingTest2 {
	public static void main(String[] args) {
//		'0'�� '1'�θ� �̷���� ���ڿ��� �ֽ��ϴ�. �� ���ڿ����� '1'�� �ִ� �� �� �����ؼ� ��Ÿ������ ���Ϸ� �մϴ�.
//		���� ��� 110111 �̶�� ���ڿ��� �־����� ��, '1'�� ������ ��Ÿ���� ���� �� ���� 11 �� �� ���� 111 �Դϴ�. 
//		�� ��� 1�� �ִ� 3�� �����ؼ� ��Ÿ�����ϴ�.
//
//		'0'�� '1'�θ� �̷���� ���ڿ� s�� �Ű������� �־��� ��, 
//		�� ���ڿ����� '1'�� �ִ� �� �� �����ؼ� ��Ÿ������ return �ϵ��� solution �Լ��� �ϼ��� �ּ���.
//
//		���ѻ���
//			- s�� ���̴� 3 �̻� 5,000 �����Դϴ�.
//			- s�� '0'�� '1'�θ� �����Ǿ� �ֽ��ϴ�.
//			
//		����� ��
//			s			result
//			"110111"	3
//			"00000"		0
//			
//		����� �� ����
//			����� �� #1
//			������ ���ÿ� �����ϴ�.
//			
//			����� �� #2
//			���ڿ��� '0'���θ� �����Ǿ� �ֽ��ϴ�. '1'�� �ִ� 0�� �����ؼ� ��Ÿ���ϴ�.

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		String Msg = "�Է�: ", zeroOne = "";
		int count = 0, temp = 0, result = 0;

		System.out.println(Msg);
		zeroOne = sc.next();

		for (int i = 0; i < zeroOne.length(); i++) {
			if (zeroOne.charAt(i) == '1') {
				count += 1;
			}else if(zeroOne.charAt(zeroOne.length()+1) == '1') {
				numbers.add(count);
				
			}else if (zeroOne.charAt(i) == '0') {
				temp = count;
				numbers.add(temp);
				count = 0;
			}
		}
		System.out.println(numbers);
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(0) >= numbers.get(i)) {
				numbers.set(i, numbers.get(0)); 
				result = numbers.get(i);
			}
		}
		System.out.println(result);
	}
}
