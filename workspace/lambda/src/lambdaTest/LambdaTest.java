package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {

////    ���ٽ��� ���� �̷��� �����
//    LambdaInter lambdaInter = new LambdaInter() {
//       
//       @Override
//       public boolean checkMultipleOf10(int number) {
//          return number % 10 == 0;
//       }
//    };

//    ������ example(int number) �� �ִ� �޼ҵ�����
//    �͸� �޼ҵ�� (int number) �� ����ϰ� �ڷ��� ���� ����. �Ұ�ȣ�� ���� ����. ��, �Ű������� �ۼ�.
//    �ּҰ��� �ش� ������ �־ ��ü���� �ش� �ּҸ� �ҷ��ͼ� ���.
		LambdaInter lambdaInter = (number) -> number % 10 == 0; // -> �̰� �ַο��ͽ�������
		boolean result = lambdaInter.checkMultipleOf10(10);
		System.out.println(result);

//    LambdaInter lambdaInter = (number) -> {
//       System.out.println("10�� ��� �˻�");
//       return number % 10 == 0;
//    };
//    boolean result = lambdaInter.checkMultipleOf10(10);
//    System.out.println(result);
	}
}