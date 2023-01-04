package classTest;

class Company{
	static Long sequence;
	Long id;
	String name;
	Long salary;
	int income;
	static Long total;
	
//	���� ó���� �����ڰ� ȣ��ɶ��� ����
	static {
		sequence = 0L;
		total = 0L;
	}


//	�ʱ�ȭ ���
//  �����ڰ� ȣ��� ������ ����
	{
		this.id = ++sequence;
	}
	
	public Company(String name, Long salary) {
		this.name = name;
		this.salary = salary;
	}

	void printMyData() {
		System.out.println(id + ", " + name  + ", ��" + salary + "����");
	}
	
}

public class Market {
	public static void main(String[] args) {
		Company ������ = new Company("������", 4000L);
		Company ������ = new Company("������", 6000L);
		Company ���¾� = new Company("���¾�", 7000L);
		Company ��� = new Company("���", 10000L);
		
		System.out.println(������.id);
		System.out.println(������.id);
		System.out.println(���¾�.id);
		System.out.println(���.id);
		
		������.printMyData();
		������.printMyData();
		���¾�.printMyData();
		���.printMyData();
		
		Company.total += ������.income = 1000;
		Company.total += ������.income = 2000;
		Company.total += ���¾�.income = -10000;
		Company.total += ���.income = -20000;
		
		System.out.println(Company.total);
	}

}
