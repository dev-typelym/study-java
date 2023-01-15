package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class CodingTest2 {
	public static void main(String[] args) {
//		'0'과 '1'로만 이루어진 문자열이 있습니다. 이 문자열에서 '1'이 최대 몇 번 연속해서 나타나는지 구하려 합니다.
//		예를 들어 110111 이라는 문자열이 주어졌을 때, '1'이 연속해 나타나는 곳은 맨 앞의 11 과 맨 뒤의 111 입니다. 
//		이 경우 1은 최대 3번 연속해서 나타났습니다.
//
//		'0'과 '1'로만 이루어진 문자열 s가 매개변수로 주어질 때, 
//		이 문자열에서 '1'이 최대 몇 번 연속해서 나타나는지 return 하도록 solution 함수를 완성해 주세요.
//
//		제한사항
//			- s의 길이는 3 이상 5,000 이하입니다.
//			- s는 '0'과 '1'로만 구성되어 있습니다.
//			
//		입출력 예
//			s			result
//			"110111"	3
//			"00000"		0
//			
//		입출력 예 설명
//			입출력 예 #1
//			문제의 예시와 같습니다.
//			
//			입출력 예 #2
//			문자열은 '0'으로만 구성되어 있습니다. '1'은 최대 0번 연속해서 나타납니다.

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		String Msg = "입력: ", zeroOne = "";
		int count = 0, temp = 0, result = 0;

		System.out.println(Msg);
		zeroOne = sc.next();

		for (int i = 0; i < zeroOne.length(); i++) {
			if (zeroOne.charAt(i) == '1') {
				count += 1;
			}else if(zeroOne.charAt(zeroOne.length()+1) == '1') {
				numbers.add(count);
				
			}else if (zeroOne.charAt(i) == '0') {
				temp = count;
				numbers.add(temp);
				count = 0;
			}
		}
		System.out.println(numbers);
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(0) >= numbers.get(i)) {
				numbers.set(i, numbers.get(0)); 
				result = numbers.get(i);
			}
		}
		System.out.println(result);
	}
}
