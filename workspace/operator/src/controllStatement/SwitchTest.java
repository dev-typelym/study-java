package controllStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String result = "";
		String menu = "1. ������\n"
				+ "2. ������\n"
				+ "3. �����\n"
				+ "4. ���\n"
				+ "1~4�� �� �ϳ��� �����ϼ���: ";
		
		System.out.println(menu);
		choice = sc.nextInt();
		switch(choice) {
		case 1:
			result = "Red";
			break;
		case 2:
			result = "Black";
			break;
		case 3:
			result = "Yellow";
			break;
		case 4:
			result = "White";
			break;
		default:
			result = "�߸� �Է��ϼ̽��ϴ�.";
			break;
		}
		System.out.println(result);	
	}
}
