package abstractTest;

public class Refrigerator extends Electronics {

	@Override
	public void on() {
		System.out.println("����� ���� ��");
	}

	@Override
	public void off() {
		System.out.println("����� ���� ����");
	}

}
