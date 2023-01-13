package threadTask;

import java.util.Scanner;

public class ThreadMain2 {
	public static void main(String[] args) {
		// 한시간 : 1시간	
		// 3개의 쓰레드가 있다.
		// Thread1, Thread2, Thread3
		// 사용자가 입력한 순서대로 각 알맞는 문자열이 출력된다.

		// 입력 예) 3 1 2
		// 출력 예) third first second

		// 단, Thread들은 항상 1, 2, 3 순서로 실행되어야 한다.

		// Thread1 : third
		// Thread2 : first
		// Thread3 : second

		// 출력 시 쓰레드의 번호도 출력할 경우 가산점으로 처리한다.
		final int SIZE = 3;
		
		Thread[] arThread = new Thread[SIZE];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("예) 3 1 2");
		System.out.print("입력[1~3]: ");
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
