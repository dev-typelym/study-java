package classTest;

class Company2{
	static int sequnece;
	static int total;
	int id;
	String name;
	int income;

	{	
	   id = ++sequnece;
	}

}
public class Market2 {
	public static void main(String[] args) {
		Company2 ������ = new Company2();
		Company2 ������ = new Company2();
		Company2 ���¾� = new Company2();
		Company2 ��� = new Company2();


		System.out.println(������.id);
		System.out.println(������.id);
		System.out.println(���¾�.id);
		System.out.println(���.id);
		
		Company.total += ������.income = 300;
		Company.total += ������.income = 500;
		Company.total += ������.income = 1000;
		Company.total += ���¾�.income = 2000;
		Company.total += ���.income = 3000;
		
		System.out.println("ȸ�� ���� : " + Company.total);
	}
}
