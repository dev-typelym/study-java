package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
//		�� ��ư�� ������ ��, �̵��ϴ� �������� ������ ����.
		
//		btn1 : ȸ������ ������
//		btn2 : �α��� ������
//		btn3 : ���� ������
		
//		ȸ������ -> �α��� -> ����������
//		�� ������� �Է��ؾ� �ϸ�, ���� ���� �ܰ踦 �����ϱ����� ���� �ܰ� ��ư�� ���� ���,
//		���� �ܰ迡 ���� �޼����� ����Ѵ�.
//		��) �α��� Ŭ����, "ȸ�������� ���� �������ּ���" ���
		
//		�˸��� �ܰ��� ��ư�� ������, �ش� �ܰ迡 ���� �޼����� ������ش�.
//		��) ȸ������ Ŭ�� ��, ȸ������ ����
//		    ���������� Ŭ�� ��, ���� �̸��� ���� ���
		Scanner sc = new Scanner(System.in);
		String[] arBtn = {"btn1", "btn2", "btn3"}
		, arSuccessMsg = {"ȸ������ ����", "�α��� ����", "�̸�: ������ ����: 26"}
		, arWarningMsg = { "�߸� �Է��ϼ̽��ϴ�. 1~4�� �Է����ּ���.","ȸ�������� ���� �������ּ���.", "�α����� ���� �������ּ���."};
		int choice = 0 , check = 0;
		
		
		while(choice != 4) {
			for (int i = 0; i < arBtn.length; i++) {
				System.out.println(i+1+"."+arBtn[i]);
			}
			System.out.println("");
			System.out.println("�׸��ϰ� ������ 4�� �Է�");
			System.out.print("�Է�: ");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println(arSuccessMsg[0]);
				System.out.println("");
				check = choice;
				break;
			case 2:
				if(check != 1) {
					System.out.println(arWarningMsg[1]);
					System.out.println("");
					break;
				}
				System.out.println(arSuccessMsg[1]);
				System.out.println("");
				check = choice;
				break;
			case 3:
				if(check != 2) {
					System.out.println(arWarningMsg[2]);
					System.out.println("");
					break;
				}
				System.out.println(arSuccessMsg[2]);
				System.out.println("");
				check = choice;
				break;
			case 4:
				break;
			default :
				System.out.println(arWarningMsg[0]);
				System.out.println("");
			
			}
		}
		
	}
}
