package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?>: 제네릭(이름이 없는)
//		객체화 시 타입을 지정하는 기법
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운 캐스팅을 할 필요가 없으며, 지정할 타입에 저한을 줄 수 있다.
		
		
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
		Collections.sort(datas); // 오름차순 정렬
//		Collections.reverse(datas); // 좌우를 반대로 바꿔주는 메소드
//		Collections.shuffle(datas); // 셔플
		for (int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i));
			
		}
		
		System.out.println(datas.indexOf(50));
		
//		추가(삽입)
//		50 뒤에 500을 삽입
			if(datas.contains(50)) {
				datas.add(datas.indexOf(50)+1, 500);
			}

		System.out.println(datas.get(0));
		
//		수정
//		90을 9로 수정
		int prev = 0;
			if(datas.contains(90)) {
				prev =datas.set(datas.indexOf(90), 9);
				System.out.println(prev+"가 9로 대체됨");
			}
		
		System.out.println(datas);

//		삭제
//		1. 인덱스로 삭제
		datas.remove(0);
//		2. 값으로 삭제
		datas.remove(Integer.valueOf(20));
		System.out.println(datas);
	
//		빠른 for문(forEach, 향상된 for문)
//		for(자료형 변수명 : 순서가 있는 무언가){}
//		변수에 하나씩 값이 순서대로 들어간다!
		
		for (Integer data : datas) {
			System.out.println(data);
		}
	}
}
