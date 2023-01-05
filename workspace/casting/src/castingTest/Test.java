package castingTest;

import java.util.Random;

public class Test {
	String accountNumMake() {
		String totalAccount = "";

		for (int i = 0; i < 6; i++) {
			Random r = new Random();
			totalAccount += r.nextInt(9);
		}
		return totalAccount;
	}
	public static void main(String[] args) {
	}
}
