package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//      5개의 정수만 입력받기
//      - 무한 입력 상태로 구현
//      - q 입력 시 나가기
//      - 각 정수는 배열에 담기
//      - if문은 딱 한 번만 사용하기

		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[5];
		String number = null;
		for (int i = 0;; i++) {
			String msg = i + 1 + "번째 정수 입력: ";
			System.out.println(msg);
			number = sc.next();
			number = number.toLowerCase();

			if (number.equals("q")) {
				break;
			}

			try {
				numbers[i] = Integer.parseInt(number);

			} catch (NumberFormatException e) {
				System.out.println("정수만 입력해주세요");
				i--;
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("정수는 5개만 담을 수 있습니다.");
				for (int j = 0; j < numbers.length; j++) {
					System.out.print(numbers[j] + "");
				}
				break;
				
			} catch (Exception e) {
				System.out.println("다시 시도해주세요");
				i--;
			}
		}

	}
}
