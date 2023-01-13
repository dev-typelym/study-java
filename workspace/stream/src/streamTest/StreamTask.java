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
//		10~1���� ArrayList�� ��� ���
//		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
//		numbers.forEach(System.out::println);
//		1~10���� ArrayList�� ��� ���
//		numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
//		numbers.forEach(System.out::println);
//		
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(numbers2::add);
//		System.out.println(numbers2);
//		Collections.reverse(numbers2);
//		System.out.println(numbers2);
		
//		ABCDEF�� �� ���ں��� ���
//		String words = "ABCDEF";
//		words.chars().forEach( c -> System.out.println((char)c));
//		IntStream.rangeClosed('A', 'F').forEach(c -> System.out.println((char)c));
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
		IntStream.rangeClosed(1, 50).forEach(numbers2::add);
		numbers2.stream().map(c -> (c*2) - 1).forEach(System.out::print);
//		
//      IntStream.range(1, 51).map(v -> v * 2 - 1).forEach(datas::add);
//      System.out.println(datas);

		
//		A~F���� �� D�����ϰ� ArrayList�� ��� ���
//		ArrayList<Integer> english = new ArrayList<Integer>();
//		IntStream.rangeClosed('A','F').forEach(v -> english.add(v));
//		IntStream.rangeClosed('A','F').forEach(v -> english.remove(v));
		
//      IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> System.out.print((char)c));
	      
//		5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//		ArrayList<String> english2 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//		english2.stream().map(c -> c.toLowerCase()).forEach(System.out::println);
		
//		1~100���� �� Ȧ���� ArrayList�� ��� ���
		IntStream.range(1, 100).filter(c -> (c+1)%2 == 0).forEach(numbers2::add);
	    System.out.println(numbers2);
		
//		Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
	     
		ArrayList<String> english2 = new ArrayList<String>(Arrays.asList("Apple","banana","Melon"));
		english2.stream().filter(c -> c.charAt(0) >= 65 && c.charAt(0) <= 90).forEach(System.out::println);

//		�ѱ��� ������ ����
		ArrayList<String> hangle = new ArrayList<String>(Arrays.asList("�����̻�����ĥ�ȱ�"));
		String han = "�����ϻ�";
		
		han.chars().map(c-> hangle.get(0).indexOf(c)).forEach(System.out::print);
		//	������ �ѱ۷� ����
		String han2 = "�����̻�����ĥ�ȱ�";
		String data = "1024";
		
		//data.chars().map( c -> c -48).forEach(i -> System.out.print(han2.charAt(i)));
		StreamTask streamTask = new StreamTask();
	    data.chars().map(streamTask::change).forEach(i -> System.out.print(han2.charAt(i)));

		

		

		
	}
}
