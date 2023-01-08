package abstractTest;

public class Refrigerator extends Electronics {

	@Override
	public void on() {
		System.out.println("냉장고 전원 온");
	}

	@Override
	public void off() {
		System.out.println("냉장고 전원 오프");
	}

}
