package classTest;

class Company{
	static Long sequence;
	Long id;
	String name;
	Long salary;
	int income;
	static Long total;
	
//	제일 처음의 생상자가 호출될때만 실행
	static {
		sequence = 0L;
		total = 0L;
	}


//	초기화 블록
//  생성자가 호출될 때마다 실행
	{
		this.id = ++sequence;
	}
	
	public Company(String name, Long salary) {
		this.name = name;
		this.salary = salary;
	}

	void printMyData() {
		System.out.println(id + ", " + name  + ", 연" + salary + "만원");
	}
	
}

public class Market {
	public static void main(String[] args) {
		Company 임의택 = new Company("임의택", 4000L);
		Company 정유찬 = new Company("정유찬", 6000L);
		Company 오태양 = new Company("오태양", 7000L);
		Company 김욱성 = new Company("김욱성", 10000L);
		
		System.out.println(임의택.id);
		System.out.println(정유찬.id);
		System.out.println(오태양.id);
		System.out.println(김욱성.id);
		
		임의택.printMyData();
		정유찬.printMyData();
		오태양.printMyData();
		김욱성.printMyData();
		
		Company.total += 임의택.income = 1000;
		Company.total += 정유찬.income = 2000;
		Company.total += 오태양.income = -10000;
		Company.total += 김욱성.income = -20000;
		
		System.out.println(Company.total);
	}

}
