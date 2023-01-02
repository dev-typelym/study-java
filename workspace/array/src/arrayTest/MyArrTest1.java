package arrayTest;

import java.util.Scanner;

public class MyArrTest1 {
	public static void main(String[] args) {
//		"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
//		문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
//		예를 들어, 10번 문제의 점수는 3이 된다.
//
//		"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//
//		OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
	Scanner sc = new Scanner(System.in);
	String Msg = "OX퀴즈 채점기\n "
			+ "입력: " 
			,quizeAnswer = "";
	int score = 0, total_score = 0;
		
	System.out.println(Msg);
	quizeAnswer = sc.next();
	
//	for (int i = 0; i < quizeAnswer.length(); i++) {
//		if(quizeAnswer.charAt(i) !== 'O' || 'X' ) {
//			System.out.println("O 또는 X를 입력해주세요.");
//		}
//		
//	}
	for (int i = 0; i < quizeAnswer.length(); i++) {
		if(quizeAnswer.charAt(i)=='O') {
			score += 1;
			total_score += score;
		}else if(quizeAnswer.charAt(i)=='X'){
			score = 0;
		}
	}
	System.out.println(total_score);
	
	
	}
}
