package variableTest;

public class StorageClassTest1 {
	int data = 10;
	static int data_s = 10;
	void increaseData() {
		System.out.println(++data);
	}
	
	static void increaseData_s() {
		System.out.println(++data_s);
	}
	public static void main(String[] args) {
		System.out.println(10/5);
	}
}
