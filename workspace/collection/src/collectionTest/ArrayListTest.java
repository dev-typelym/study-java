package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?>: ���׸�(�̸��� ����)
//		��üȭ �� Ÿ���� �����ϴ� ���
//		������ ������ Ÿ���� ������ �� ���� ������ �ӽ÷� Ÿ���� ������ �� ����Ѵ�.
//		���� �ٿ� ĳ������ �� �ʿ䰡 ������, ������ Ÿ�Կ� ������ �� �� �ִ�.
		
		
		ArrayList<Integer> datas = new ArrayList<>();
		final int SIZE = 9;
//		C
		for (int i = 0; i < SIZE; i++) {
			if(i > 4) {
				datas.add((14-i) * 10);
				System.out.println(datas.size());
				continue;				
			}
			datas.add((i+1) * 10);
			System.out.println(datas.size());
			
		}
		
//		R
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//			
//		}
		
		for (Integer data : datas) {
			System.out.println(data);
		}
		
//		collections
		System.out.println("============================");
		Collections.sort(datas); // �������� ����
//		Collections.reverse(datas); // �¿츦 �ݴ�� �ٲ��ִ� �޼ҵ�
//		Collections.shuffle(datas); // ����
		for (int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i));
			
		}
		
		System.out.println(datas.indexOf(50));
		
//		�߰�(����)
//		50 �ڿ� 500�� ����
			if(datas.contains(50)) {
				datas.add(datas.indexOf(50)+1, 500);
			}

		System.out.println(datas.get(0));
		
//		����
//		90�� 9�� ����
		int prev = 0;
			if(datas.contains(90)) {
				prev =datas.set(datas.indexOf(90), 9);
				System.out.println(prev+"�� 9�� ��ü��");
			}
		
		System.out.println(datas);

//		����
//		1. �ε����� ����
		datas.remove(0);
//		2. ������ ����
		datas.remove(Integer.valueOf(20));
		System.out.println(datas);
	
//		���� for��(forEach, ���� for��)
//		for(�ڷ��� ������ : ������ �ִ� ����){}
//		������ �ϳ��� ���� ������� ����!
		
		for (Integer data : datas) {
			System.out.println(data);
		}
	}
}
