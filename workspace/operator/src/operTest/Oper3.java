package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고
// 		정수라면 정수로 출력
// 		실수라면 실수로 출력
// 		예) 183 -> 183 출력
// 		    183.5 -> 183.5 출력
// 		삼항 연산자를 사용!
		
// 		힌트!
//		뺼셈으로 풀면 쉬움


		Scanner sc = new Scanner(System.in);
		String msg = "키를 입력하시오: ";
		String num = "", result = "";
		int height_int = 0;
		double height_double = 0.0;
		System.out.print(msg);
		num = sc.next();
		height_int = (int)Double.parseDouble(num);
		height_double = Double.parseDouble(num);
		
		result = height_double - height_int > 0 ? height_double + "" : height_int + "";
		
		System.out.println(result);
	
	}
}
