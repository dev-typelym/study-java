package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		����ڿ��� Ű�� �Է¹ް�
// 		������� ������ ���
// 		�Ǽ���� �Ǽ��� ���
// 		��) 183 -> 183 ���
// 		    183.5 -> 183.5 ���
// 		���� �����ڸ� ���!
		
// 		��Ʈ!
//		�E������ Ǯ�� ����


		Scanner sc = new Scanner(System.in);
		String msg = "Ű�� �Է��Ͻÿ�: ";
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
