package operTest;

import java.util.Scanner;

public class Oper3_2 {
	public static void main(String[] args) {
//		����ڿ��� Ű�� �Է¹ް�
// 		������� ������ ���
// 		�Ǽ���� �Ǽ��� ���
// 		��) 183 -> 183 ���
// 		    183.5 -> 183.5 ���
// 		���� �����ڸ� ���!
		
// 		��Ʈ!
//		�E������ Ǯ�� ����
// 		���Ĺ��ڷ� Ǯ�� �� ����
		
		Scanner sc = new Scanner(System.in);
		String msg = "Ű�� �Է��Ͻÿ�: ", comma = "", result="";
		double height = 0.0;
		char check =' ';
		
		System.out.print(msg);
		height = sc.nextDouble();
		comma = (height - (int)height) + "";
		check = comma.charAt(1);
		result = check == '.' ? height+"" : (int)height+"";
		System.out.println(result);
	}
}
