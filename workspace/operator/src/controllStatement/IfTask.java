package controllStatement;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
//		����ڿ��� �Ʒ��� �޴��� ����ϰ� 
//		��ȣ�� �Է¹޴´�.
//		1. ������
//		2. ������
// 		3. �����
// 		4. ���

// 		����ڰ� �Է��� ��ȣ�� ������ ����� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String result = "";
		String menu = "1. ������\n"
				+ "2. ������\n"
				+ "3. �����\n"
				+ "4. ���\n"
				+ "1~4�� �� �ϳ��� �����ϼ���: ";
		
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
			result = "�߸� �Է��ϼ̽��ϴ�.";
		}
		System.out.println(result);		
	}
}
