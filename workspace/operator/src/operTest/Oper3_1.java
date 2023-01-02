package operTest;

import java.util.Scanner;

public class Oper3_1 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고
// 		정수라면 정수로 출력
// 		실수라면 실수로 출력
// 		예) 183 -> 183 출력
// 		    183.5 -> 183.5 출력
// 		삼항 연산자를 사용!
		
// 		힌트!
//		뺼셈으로 풀면 쉬움
// 		서식문자로 풀면 더 쉬움
		
		Scanner sc = new Scanner(System.in);
		String msg = "키를 입력하시오: " , result = "";
		double height = 0.0;
		System.out.print(msg);
		height = sc.nextDouble();
		result = height - (int)height > 0 ? height+"" : (int)height+"";
		
		System.out.println(result);
		
	}
}
