package controllStatement;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		�����
//		1~100���� ���
		for(int i=0; i<100; i++) {
			System.out.println(i+1);
		}
		
//		100~1���� ���
		for(int i=0; i<100; i++) {
			System.out.println(100-i);
		}
		
//		1~100���� �� ¦���� ���
		for(int i=0; i<50; i++) {
			System.out.println((i+1)*2);
			}
		
//		�ǹ�
//		1~10���� �� ���
		int total = 0;
		for(int i=0; i<10; i++) {
			total += i+1;
		}
		System.out.println(total);
//		1~n���� �� ���
		Scanner sc = new Scanner(System.in);
		String Msg = "1~n������ ���� ���� n�� �Է�: ";
		int choice = 0, total2 = 0;
		
		System.out.println(Msg);
		choice = sc.nextInt();
		for(int i=0; i<choice; i++) {
			total2 = total2 + i;
		}
		System.out.println(total2);
		
		for(int i=0; i<6; i++) {
			System.out.print((char)(65+i));
		}

//		���
//		A~F���� ���
		for(int i=0; i<6; i++) {
			System.out.print((char)(65+i));
		}
//		A~F���� �� C�����ϰ� ���
		for(int i=0; i<6; i++) {
			if(i==2) {
				continue;
			}
			System.out.print((char)(65+i));
		}

//		���̾�
//		0 1 2 3 0 1 2 3 0 1 2 3 ���
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(j + " ");
			}
		}
//		aBcDeFgH...Z ���
		for(int i=0; i<26; i++) {
			if(i%2 == 0 ) {
				System.out.print((char)(97+i));
			}else {
				System.out.print((char)(65+i));
			}
		}
				
	}
}
