package methodTest;

import java.util.Scanner;

public class MethodTask {
////	1~10까지 println()으로 출력하는 메소드
//	void printTen() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i+1);
//		}
//	}
////  "홍길동"을 n번 println()으로 출력하는 메소드
//	void printName(int num) {
//		for (int i = 0; i < num; i++) {
//			System.out.println("홍길동");
//		}
//	}
//	이름을 n번 println()으로 출력하는 메소드
//	void printName2(int num, String name) {
//		for (int i = 0; i < num; i++) {
//			System.out.println(name);
//		}
//	}
//	세 정수의 뺄셈을 해주는 메소드
//	int minus(int number1, int number2, int number3) {
//		int result = number1 - number2 - number3;
//		
//		return result;
//	}
	
//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//	int[] divide(int choice1, int choice2) {
//		int[] result = null;
//		
//		if(choice2 != 0) {
//			result = new int[2];
//			result[0] = choice1/choice2;
//			result[1] = choice1%choice2;
//		}
//		return result;
//	}
	
//	1~n까지의 합을 구해주는 메소드
//	int totalPlus(int num) {
//		int total = 0;
//		for (int i = 0; i < num; i++) {
//			total += i+1;
//		}
//		return total;
//	}
//	홀수를 짝수로, 짝수를 홀수로 바궈주는 메소드
//	int change(int num) {
//		int result = 0;
//		if(num%2 == 0) {
//			result = num-1;
//		}else{
//			result = num+1;
//		}
//		return result;
//	}
//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//	String changeLetter(String letter) {
//		String result = "";
//		for (int i = 0; i < letter.length(); i++) {
//			char check = letter.charAt(i);
//			if(check >= 97 && check <= 122) {
//				result += (char)(check - 32);
//			}else if(check >= 65 && check <= 90) {
//				result += (char)(check + 32);
//			}else {
//				result += check;
//			}
//		}
//		return result;
//	}
	
//	문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
//	int numCheck(String letters, char wantSpell) {
//		int count = 0;
//		for (int i = 0; i < letters.length(); i++) {
//			boolean check = letters.charAt(i) == wantSpell;
//			if(check) {
//				count++;
//			}	
//		}
//		return count;
//	}
////	5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
//	int indexFind(int[] num, int wantIndex) {
//		return num[wantIndex];
//	}
//	한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
//	 int changeToInteger(String hangle) {
//	      String hangleOriginal = "공일이삼사오육칠팔구";
//	      String result = "";
//	      for (int i = 0; i < hangle.length(); i++) {
//	         result += hangleOriginal.indexOf(hangle.charAt(i));
//	      }
//	      return Integer.parseInt(result);
//	    }

	//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//	   int[] getMaxAndMin(int[] arData) {
//	      int[] result = {arData[0], arData[0]};
//	      
//	      for (int i = 0; i < arData.length; i++) {
//	         if(result[0] < arData[i]) {result[0] = arData[i];} 
//	         if(result[1] > arData[i]) {result[1] = arData[i];} 
//	      }
//	      return result;
//	   }
//	   
//	//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
//	   void getMaxAndMin(int[] arData, int[] result) {
//	      result[0] = arData[0];
//	      result[1] = arData[0];
//	      
//	      for (int i = 0; i < arData.length; i++) {
//	         if(result[0] < arData[i]) {result[0] = arData[i];} 
//	         if(result[1] > arData[i]) {result[1] = arData[i];} 
//	      }
//	   }
//	   abcdefghijklmnop
	
//	   indexOf() 만들기
//	   문자열과 문자를 입력받은 뒤 해당 문자가 몇 번째 인덱스에 있는 지 검사하고
//	   만약 해당 문자가 없으면 -1을 리턴한다.
	   int myIndexOf(String letter, char choice) {
		   int count = 0;
		   char[] check = new char[letter.length()];
		   for (int i = 0; i < letter.length(); i++) {
			   check[i] = letter.charAt(i);
			    if(choice == check[i]) {
			    	count = i;
			    	break;
			    }else if(choice != check[i]) {
			    	count = -1;
			    }
			    
		}
		   return count;
	   }
//	   강사님 버전	   
	   int indexOf(String str, char c) {
		      for (int i = 0; i < str.length(); i++) {
		         if(str.charAt(i) == c) {
		            return i;
		         }
		      }
		      return -1;
		   }

	   public static void main(String[] args) {
//	      MethodTask methodTask = new MethodTask();
	      MethodTask mt = new MethodTask();
//		  mt.printTen();
//		  mt.printName(3);
//		  mt.printName2(2,"임의택");
//		  System.out.println(mt.minus(10, 3, 2));
//	      int[] result = methodTask.divide(10, 0);
//	      if (result == null) {
//	         System.out.println("0으로 나눌 수 없습니다.");
//	      } else {
//	         System.out.println("몫: " + result[0]);
//	         System.out.println("나머지: " + result[1]);
//	      }
//		  System.out.println(mt.totalPlus(10));
//		  System.out.println(mt.change(10));
//		  System.out.println(mt.numCheck("abbbacd", 'b'));
//	      int[] result = new int[2];
//	      int[] arData = {3, 5, 6, 2, 1};
//	      methodTask.getMaxAndMin(arData, result);
//	      System.out.println("최대값: " + result[0]);
//	      System.out.println("최소값: " + result[1]);
//	      System.out.println(mt.indexFind(new int[] {1,2,3,4,5}, 3));
		  System.out.println(mt.myIndexOf("abcdfd", 'd'));
	   }
	}


	
	
