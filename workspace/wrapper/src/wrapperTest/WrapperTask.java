package wrapperTest;

import java.sql.Wrapper;

public class WrapperTask {
	public static void main(String[] args) {
//		1, 12.5, 86.6F, 'Z', "Hi", false
//		�� 6���� ���� 6ĭ �迭�� ���
		
		Object[] ar = {1, 12.5, 86.6F, 'Z', "Hi", false};
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		
	
	}
}
