package threadTask;

public class ThreadMain {
	public static void main(String[] args) {
//		[�ǽ�]
//		�����̳� ���������� 3������ ������ �ִ�.
//		�� ������ ���� �Ҹ��� �ٸ��� 2������ ������ ���ÿ� ���.
//		������ 1���� ������ 2���� ������ ��� ��� ���� �������� ���.
//
//		package���� threadTask���� ����� Ŭ������ 2���� �����Ѵ�.
//		�ϳ��� Ŭ�������� main �����尡 �ִ�.
//		Runnable �������̽��� ��Ƽ �����带 �����ϰ� �ݵ�� join()�� ����Ѵ�.
//
//		�� �� ������ 10������ ���.
//
//		- �ּ��� �ۼ��Ͽ��°�
//		- Thread�� name�ʵ带 ����� �� �ִ°�
//		- �迭�� ����Ͽ��°�
//		- Ŭ������ �� �� �����Ͽ��°�
//		- ������ : ���ٽ��� ����Ͽ��°�, main �����带 ����Ͽ��°�
		ThreadTask2 threadTask2 = new ThreadTask2();
		String[] cry = {"�۸�!", "�Ŀ�~", "����~"};
		Thread[] arThread = new Thread[cry.length];
		
		for (int i = 0; i < cry.length; i++) {
			arThread[i] = new Thread(threadTask2, cry[i]);
		}
		
		for (int i = 0; i < arThread.length; i++) {
			arThread[i].start();
			if(i==1) {
				try {arThread[i].join();} catch (InterruptedException e) {;}
			}
		}
	}
}
