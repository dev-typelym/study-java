package controllStatement;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
//		사용자에게 아래의 메뉴를 출력하고 
//		번호를 입력받는다.
//		1. 빨간색
//		2. 검은색
// 		3. 노란색
// 		4. 흰색

// 		사용자가 입력한 번호의 색상을 영어로 출력한다.
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
		if(choice == 1) {
			result = "Red";
		}else if(choice == 2) {
			result = "Black";
		}else if(choice == 3) {
			result = "Yellow";
		}else if(choice ==4){
			result = "White";
		}else {
			result = "잘못 입력하셨습니다.";
		}
		System.out.println(result);		
	}
}
