package operTest;

import java.util.Scanner;

public class Oper4 {
   public static void main(String[] args) {
//      �ɸ� �׽�Ʈ
      /*
       * Q. ����� �����ϴ� ���� �����ϼ���.
       * 1. ������
       * 2. �����
       * 3. ������
       * 4. ���
       * 
       * ������ : �Ұ��� �������̰� �������̴�.
       * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
       * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
       * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
       * 
       */
	   Scanner sc = new Scanner(System.in);
	   String msg = "�ڡ١ڡ١ڡ١ڡ� �ɸ��׽�Ʈ �ڡ١ڡ١ڡ١ڡ�\n"
	   		+ "Q. ����� �����ϴ� ���� �����ϼ���.\n"
	   		+ "1. ������\n"
	   		+ "2. �����\n"
	   		+ "3. ������\n"
	   		+ "4. ���\n"
	   		+ "�Է�: ", 
	   		choice = "",
	   		red = "������ : �Ұ��� �������̰� �������̴�.",
	   		yellow = "����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.",
	   		black = "������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.",
	   		white = "��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.",
	   		warningMsg = "�߸� �Է��ϼ̽��ϴ�. ���� 1~4�� �ϳ��� �Է��ϼ���.",
	   		result = "";
	   	
	   	System.out.print(msg);
	   	choice = sc.next();
	   	
	   	switch(choice) {
	   	case "1":
	   		result = red;
	   		break;
	   	case "2":
	   		result = yellow;
	   		break;
	   	case "3":
	   		result = black;
	   		break;
	   	case "4":
	   		result = white;
	   		break;
	   	default :
	   		result = warningMsg;
	   		break;
	   	}
	   	
	   	System.out.println(result);
	   	
	   	
   }
}