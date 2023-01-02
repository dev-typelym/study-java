package controllStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String result = "";
		String menu = "1. 빨간색\n"
				+ "2. 검은색\n"
				+ "3. 노란색\n"
				+ "4. 흰색\n"
				+ "1~4번 중 하나를 선택하세요: ";
		
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
			result = "잘못 입력하셨습니다.";
			break;
		}
		System.out.println(result);	
	}
}
