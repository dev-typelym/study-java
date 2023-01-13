package threadTask;

public class ThreadTask implements Runnable{
	
	
	// ���ѽð� : 1�ð�	
	// 3���� �����尡 �ִ�.
	// Thread1, Thread2, Thread3
	// ����ڰ� �Է��� ������� �� �˸´� ���ڿ��� ��µȴ�.

	// �Է� ��) 3 1 2
	// ��� ��) third first second

	// ��, Thread���� �׻� 1, 2, 3 ������ ����Ǿ�� �Ѵ�.

	// Thread1 : third
	// Thread2 : first
	// Thread3 : second

	// ��� �� �������� ��ȣ�� ����� ��� ���������� ó���Ѵ�.
	
	public ThreadTask() {;}
	
	public static int count;

	public void printFirst(Runnable first) {
		first.run(); // ���� ����
	}

	public void printSecond(Runnable second) {
		second.run(); // ���� ����
	}

	public void printThird(Runnable third) {
		third.run(); // ���� ����
	}

	@Override
	public void run() {
		String number = Thread.currentThread().getName();
		switch(number){
		case "1":
			printFirst(() -> System.out.println("Thread" + ++count +": First "));
			break;
		case "2":
			printSecond(() -> System.out.println("Thread" + ++count +": Second "));
			break;
		case "3":
			printThird(() -> System.out.println("Thread" + ++count +": Third "));
			break;
			
		}
	}
	
	
	
}





