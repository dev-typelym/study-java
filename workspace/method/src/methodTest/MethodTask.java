package methodTest;

import java.util.Scanner;

public class MethodTask {
////	1~10���� println()���� ����ϴ� �޼ҵ�
//	void printTen() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i+1);
//		}
//	}
////  "ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
//	void printName(int num) {
//		for (int i = 0; i < num; i++) {
//			System.out.println("ȫ�浿");
//		}
//	}
//	�̸��� n�� println()���� ����ϴ� �޼ҵ�
//	void printName2(int num, String name) {
//		for (int i = 0; i < num; i++) {
//			System.out.println(name);
//		}
//	}
//	�� ������ ������ ���ִ� �޼ҵ�
//	int minus(int number1, int number2, int number3) {
//		int result = number1 - number2 - number3;
//		
//		return result;
//	}
	
//	�� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
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
	
//	1~n������ ���� �����ִ� �޼ҵ�
//	int totalPlus(int num) {
//		int total = 0;
//		for (int i = 0; i < num; i++) {
//			total += i+1;
//		}
//		return total;
//	}
//	Ȧ���� ¦����, ¦���� Ȧ���� �ٱ��ִ� �޼ҵ�
//	int change(int num) {
//		int result = 0;
//		if(num%2 == 0) {
//			result = num-1;
//		}else{
//			result = num+1;
//		}
//		return result;
//	}
//	���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
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
	
//	���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
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
////	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
//	int indexFind(int[] num, int wantIndex) {
//		return num[wantIndex];
//	}
//	�ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
//	 int changeToInteger(String hangle) {
//	      String hangleOriginal = "�����̻�����ĥ�ȱ�";
//	      String result = "";
//	      for (int i = 0; i < hangle.length(); i++) {
//	         result += hangleOriginal.indexOf(hangle.charAt(i));
//	      }
//	      return Integer.parseInt(result);
//	    }

	//   5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
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
//	//   5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
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
	
//	   indexOf() �����
//	   ���ڿ��� ���ڸ� �Է¹��� �� �ش� ���ڰ� �� ��° �ε����� �ִ� �� �˻��ϰ�
//	   ���� �ش� ���ڰ� ������ -1�� �����Ѵ�.
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
//	   ����� ����	   
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
//		  mt.printName2(2,"������");
//		  System.out.println(mt.minus(10, 3, 2));
//	      int[] result = methodTask.divide(10, 0);
//	      if (result == null) {
//	         System.out.println("0���� ���� �� �����ϴ�.");
//	      } else {
//	         System.out.println("��: " + result[0]);
//	         System.out.println("������: " + result[1]);
//	      }
//		  System.out.println(mt.totalPlus(10));
//		  System.out.println(mt.change(10));
//		  System.out.println(mt.numCheck("abbbacd", 'b'));
//	      int[] result = new int[2];
//	      int[] arData = {3, 5, 6, 2, 1};
//	      methodTask.getMaxAndMin(arData, result);
//	      System.out.println("�ִ밪: " + result[0]);
//	      System.out.println("�ּҰ�: " + result[1]);
//	      System.out.println(mt.indexFind(new int[] {1,2,3,4,5}, 3));
		  System.out.println(mt.myIndexOf("abcdfd", 'd'));
	   }
	}


	
	
