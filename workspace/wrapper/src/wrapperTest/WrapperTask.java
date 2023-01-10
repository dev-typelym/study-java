package wrapperTest;

import java.sql.Wrapper;

public class WrapperTask {
	public static void main(String[] args) {
//		1, 12.5, 86.6F, 'Z', "Hi", false
//		위 6개의 값을 6칸 배열에 담기
		
		Object[] ar = {1, 12.5, 86.6F, 'Z', "Hi", false};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		
	
	}
}
