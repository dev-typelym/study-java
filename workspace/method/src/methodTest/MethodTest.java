package methodTest;

public class MethodTest {
//	�� ������ ���� �޼ҵ� ����
	int multiple(int number1, int number2){
		int result = number1*number2;
		return result;
	}
	
//	static
//		�����Ϸ��� ���� ���� �޸𸮿� �Ҵ����ش�.
//		�Ϲ� �޼ҵ带 static �޼ҵ忡�� ����ϱ� ���ؼ���
//		1. �Ϲ� �޼ҵ忡 static�� �ۼ��Ͽ� ���� �ð��뿡 �޸𸮸� �÷��ش�.
//		2. �Ϲ� �޼ҵ��� �Ҽ��� �˷��ش�.
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		System.out.println(mt.multiple(3, 2));
	}
}
