package operTest;

import java.util.Scanner;

public class Oper3_1 {
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
		String msg = "Ű�� �Է��Ͻÿ�: " , result = "";
		double height = 0.0;
		System.out.print(msg);
		height = sc.nextDouble();
		result = height - (int)height > 0 ? height+"" : (int)height+"";
		
		System.out.println(result);
		
	}
}
