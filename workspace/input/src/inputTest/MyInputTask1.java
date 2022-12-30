package inputTest;

import java.util.Scanner;

public class MyInputTask1 {
	public static void main(String[] args) {
//	 이름 변경 alt + shift + R
	
//		두 정수를 입력한 뒤 덧셈 결과 출력
//		단, next()만 사용한다.
		Scanner sc = new Scanner(System.in);
		String number1 = "" , number2 = "";
		int result = 0;
		System.out.print("첫번째 정수를 입력하세요 : ");
		number1 = sc.next();
		System.out.print("두번째 정수를 입력하세요 : ");
		number2 = sc.next();
		result = (Integer.parseInt(number1) + Integer.parseInt(number2));
		System.out.println("두 정수의 합은 " + result + "입니다.");
	}
}
