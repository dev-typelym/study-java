package threadTask;

public class ThreadTask2 implements Runnable {
	@Override
	public void run() {
		String animalCry = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(animalCry);
			try {Thread.sleep(500);} catch (InterruptedException e) {;}
		}
	}
}
