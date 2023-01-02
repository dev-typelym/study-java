package controllStatement;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		브론즈
//		1~100까지 출력
		for(int i=0; i<100; i++) {
			System.out.println(i+1);
		}
		
//		100~1까지 출력
		for(int i=0; i<100; i++) {
			System.out.println(100-i);
		}
		
//		1~100까지 중 짝수만 출력
		for(int i=0; i<50; i++) {
			System.out.println((i+1)*2);
			}
		
//		실버
//		1~10까지 합 출력
		int total = 0;
		for(int i=0; i<10; i++) {
			total += i+1;
		}
		System.out.println(total);
//		1~n까지 합 출력
		Scanner sc = new Scanner(System.in);
		String Msg = "1~n까지의 합을 구할 n을 입력: ";
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

//		골드
//		A~F까지 출력
		for(int i=0; i<6; i++) {
			System.out.print((char)(65+i));
		}
//		A~F까지 중 C제외하고 출력
		for(int i=0; i<6; i++) {
			if(i==2) {
				continue;
			}
			System.out.print((char)(65+i));
		}

//		다이아
//		0 1 2 3 0 1 2 3 0 1 2 3 출력
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(j + " ");
			}
		}
//		aBcDeFgH...Z 출력
		for(int i=0; i<26; i++) {
			if(i%2 == 0 ) {
				System.out.print((char)(97+i));
			}else {
				System.out.print((char)(65+i));
			}
		}
				
	}
}
