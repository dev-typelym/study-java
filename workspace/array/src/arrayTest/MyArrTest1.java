package arrayTest;

import java.util.Scanner;

public class MyArrTest1 {
	public static void main(String[] args) {
//		"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
//		������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
//		���� ���, 10�� ������ ������ 3�� �ȴ�.
//
//		"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
//
//		OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	Scanner sc = new Scanner(System.in);
	String Msg = "OX���� ä����\n "
			+ "�Է�: " 
			,quizeAnswer = "";
	int score = 0, total_score = 0;
		
	System.out.println(Msg);
	quizeAnswer = sc.next();
	
//	for (int i = 0; i < quizeAnswer.length(); i++) {
//		if(quizeAnswer.charAt(i) !== 'O' || 'X' ) {
//			System.out.println("O �Ǵ� X�� �Է����ּ���.");
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
