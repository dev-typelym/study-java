package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
//		각 버튼을 눌렀을 때, 이동하는 페이지는 다음과 같다.
		
//		btn1 : 회원가입 페이지
//		btn2 : 로그인 페이지
//		btn3 : 마이 페이지
		
//		회원가입 -> 로그인 -> 마이페이지
//		위 순서대로 입력해야 하며, 만약 이전 단계를 진행하기전에 다음 단계 버튼을 누를 경우,
//		이전 단계에 대한 메세지를 출력한다.
//		예) 로그인 클릭시, "회원가입을 먼저 진행해주세요" 출력
		
//		알맞은 단계의 버튼을 누르면, 해당 단계에 대한 메세지를 출력해준다.
//		예) 회원가입 클릭 시, 회원가입 성공
//		    마이페이지 클릭 시, 본인 이름과 나이 출력
		Scanner sc = new Scanner(System.in);
		String[] arBtn = {"btn1", "btn2", "btn3"}
		, arSuccessMsg = {"회원가입 성공", "로그인 성공", "이름: 임의택 나이: 26"}
		, arWarningMsg = { "잘못 입력하셨습니다. 1~4를 입력해주세요.","회원가입을 먼저 진행해주세요.", "로그인을 먼저 진행해주세요."};
		int choice = 0 , check = 0;
		
		
		while(choice != 4) {
			for (int i = 0; i < arBtn.length; i++) {
				System.out.println(i+1+"."+arBtn[i]);
			}
			System.out.println("");
			System.out.println("그만하고 싶으면 4를 입력");
			System.out.print("입력: ");
			
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
