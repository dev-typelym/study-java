package threadTask;

import java.util.Scanner;

public class ThreadMain2 {
	public static void main(String[] args) {
		// �ѽð� : 1�ð�	
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
		final int SIZE = 3;
		
		Thread[] arThread = new Thread[SIZE];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��) 3 1 2");
		System.out.print("�Է�[1~3]: ");
		for(int i=0; i<arThread.length; i++) {
			String temp = sc.next();
			arThread[i] = new Thread(new ThreadTask() ,temp);
		}
		
		for(int i=0; i<arThread.length; i++) {
			arThread[i].start();
			try {
				arThread[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
