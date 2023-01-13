package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class StreamTask {
	public int change(int number) {
	      return number - 48;
	   }

	public static void main(String[] args) {
//		10~1까지 ArrayList에 담고 출력
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
//		numbers.forEach(System.out::println);
//		1~10까지 ArrayList에 담고 출력
//		numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		numbers.forEach(System.out::println);
//		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(numbers2::add);
//		System.out.println(numbers2);
//		Collections.reverse(numbers2);
//		System.out.println(numbers2);
		
//		ABCDEF를 각 문자별로 출력
//		String words = "ABCDEF";
//		words.chars().forEach( c -> System.out.println((char)c));
//		IntStream.rangeClosed('A', 'F').forEach(c -> System.out.println((char)c));
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력
		IntStream.rangeClosed(1, 50).forEach(numbers2::add);
		numbers2.stream().map(c -> (c*2) - 1).forEach(System.out::print);
//		
//      IntStream.range(1, 51).map(v -> v * 2 - 1).forEach(datas::add);
//      System.out.println(datas);

		
//		A~F까지 중 D제외하고 ArrayList에 담고 출력
//		ArrayList<Integer> english = new ArrayList<Integer>();
//		IntStream.rangeClosed('A','F').forEach(v -> english.add(v));
//		IntStream.rangeClosed('A','F').forEach(v -> english.remove(v));
		
//      IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> System.out.print((char)c));
	      
//		5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//		ArrayList<String> english2 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		english2.stream().map(c -> c.toLowerCase()).forEach(System.out::println);
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력
		IntStream.range(1, 100).filter(c -> (c+1)%2 == 0).forEach(numbers2::add);
	    System.out.println(numbers2);
		
//		Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
	     
		ArrayList<String> english2 = new ArrayList<String>(Arrays.asList("Apple","banana","Melon"));
		english2.stream().filter(c -> c.charAt(0) >= 65 && c.charAt(0) <= 90).forEach(System.out::println);

//		한글을 정수로 변경
		ArrayList<String> hangle = new ArrayList<String>(Arrays.asList("공일이삼사오육칠팔구"));
		String han = "공일일사";
		
		han.chars().map(c-> hangle.get(0).indexOf(c)).forEach(System.out::print);
		//	정수를 한글로 변경
		String han2 = "공일이삼사오육칠팔구";
		String data = "1024";
		
		//data.chars().map( c -> c -48).forEach(i -> System.out.print(han2.charAt(i)));
		StreamTask streamTask = new StreamTask();
	    data.chars().map(streamTask::change).forEach(i -> System.out.print(han2.charAt(i)));

		

		

		
	}
}
