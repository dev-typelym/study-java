package operTest;

import java.util.Scanner;

public class Oper4 {
   public static void main(String[] args) {
//      심리 테스트
      /*
       * Q. 당신이 좋아하는 색을 선택하세요.
       * 1. 빨간색
       * 2. 노란색
       * 3. 검은색
       * 4. 흰색
       * 
       * 빨간색 : 불같고 열정적이고 적극적이다.
       * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
       * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
       * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
       * 
       */
	   Scanner sc = new Scanner(System.in);
	   String msg = "★☆★☆★☆★☆ 심리테스트 ★☆★☆★☆★☆\n"
	   		+ "Q. 당신이 좋아하는 색을 선택하세요.\n"
	   		+ "1. 빨간색\n"
	   		+ "2. 노란색\n"
	   		+ "3. 검은색\n"
	   		+ "4. 흰색\n"
	   		+ "입력: ", 
	   		choice = "",
	   		red = "빨간색 : 불같고 열정적이고 적극적이다.",
	   		yellow = "노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.",
	   		black = "검은색 : 묵묵하고 든든하고 냉철하고 멋지다.",
	   		white = "흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.",
	   		warningMsg = "잘못 입력하셨습니다. 숫자 1~4중 하나를 입력하세요.",
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