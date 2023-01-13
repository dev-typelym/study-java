package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
		HashMap<String, Integer> chinaTown = new HashMap<String, Integer>();
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		
		chinaTown.put("�����", 4500);
		chinaTown.put("«��", 6500);
		chinaTown.put("������", 14500);
		
//		forEach()
//		���� ���� ������ �ִ� �÷��� ��ü���� forEach �޼ҵ带 ����� �� �ִ�.
//		forEach() �޼ҵ忡�� Consumer �������̽� Ÿ���� ���� �����ؾ� �Ѵ�.
//		Consumer�� �Լ��� �������̽��̱� ������ ���ٽ��� ����� �� �ִ�.
//		�Ű��������� �÷��� ��ü �ȿ� ����ִ� ������ ������� ����,
//		ȭ��ǥ �ڿ����� �����ϰ� ���� ������ �ۼ��Ѵ�.
	
		chinaTown.values().stream().forEach(v -> System.out.println(v));
		chinaTown.values().forEach(v -> System.out.println(v)); // forEach�� ���̽Ἥ ��Ʈ���ȿ��� �Ƚᵵ ��
		chinaTown.values().forEach(System.out::println);
		
		datas.forEach(data -> System.out.println(data));
		datas.forEach(System.out::println);
		
		IntStream.range(1, 10).forEach(v -> datas.add(v));
		IntStream.range(1, 10).forEach(datas::add);
		System.out.println(datas);
		
//		chars()
		String data = "ABC";
		data.chars().forEach(System.out::println);
		data.chars().forEach( c -> System.out.println((char)c));
	
//		map(): ���� ���� ���ϴ� ������ ����
		String eng = "ABC";
		eng.chars().map(c -> c + 3).forEach(c -> System.out.print((char)c));
		
//      ArrayList<User> users = new ArrayList<User>(Arrays.asList(
//      new User(1, "�ѵ���", 20), 
//      new User(2, "ȫ�浿", 21), 
//      new User(3, "�̼���", 31)));

//		���� ���� �޼ҵ忡 �ٷ� ������ ������ ��ü�� �������� �ۼ��ϰ�,
//		�޼ҵ忡 ���� �������� �ʰ� �׳� ����� ������ Ŭ������ �������� �ۼ��Ѵ�.
//		users.stream().map(User::getAge).forEach(System.out::println);

//		filter(): ���ǽ��� true�� ��츸 ����
		StreamTest streamTest = new StreamTest();
		IntStream.rangeClosed(1, 10).filter(n -> n%2 == 0).forEach(System.out::println);
		
//		sorted()
		Integer[] arData = {10, 40, 23, 32, 50};
//		ArrayList<Integer> datas2 = new ArrayList<Integer>(Arrays.asList(arData));
		
//		datas2.stream().sorted().forEach(System.out::println);
//		datas2.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		collect(): ����� �پ��� Ÿ������ �������ش�.
		ArrayList<Integer> datas2 = new ArrayList<Integer>(Arrays.asList(10, 40, 23, 32, 50));
		ArrayList<Integer> results = 
		(ArrayList<Integer>)datas2.stream().sorted().collect(Collectors.toList());
		
		System.out.println(results);
		
		ArrayList<Integer> times = new ArrayList<Integer>(Arrays.asList(10, 3, 2));
		String result = times.stream().map(String::valueOf).collect(Collectors.joining(":"));
		System.out.println(result);
		
		
		
		
		
		

		
	}
}
