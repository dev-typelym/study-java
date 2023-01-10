package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//      5���� ������ �Է¹ޱ�
//      - ���� �Է� ���·� ����
//      - q �Է� �� ������
//      - �� ������ �迭�� ���
//      - if���� �� �� ���� ����ϱ�

		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		String number = null;
		for (int i = 0;; i++) {
			String msg = i + 1 + "��° ���� �Է�: ";
			System.out.println(msg);
			number = sc.next();
			number = number.toLowerCase();

			if (number.equals("q")) {
				break;
			}

			try {
				numbers[i] = Integer.parseInt(number);

			} catch (NumberFormatException e) {
				System.out.println("������ �Է����ּ���");
				i--;
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("������ 5���� ���� �� �ֽ��ϴ�.");
				for (int j = 0; j < numbers.length; j++) {
					System.out.print(numbers[j] + "");
				}
				break;
				
			} catch (Exception e) {
				System.out.println("�ٽ� �õ����ּ���");
				i--;
			}
		}

	}
}
