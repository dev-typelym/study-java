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
		Company2 임의택 = new Company2();
		Company2 정유찬 = new Company2();
		Company2 오태양 = new Company2();
		Company2 김욱성 = new Company2();


		System.out.println(임의택.id);
		System.out.println(정유찬.id);
		System.out.println(오태양.id);
		System.out.println(김욱성.id);
		
		Company.total += 임의택.income = 300;
		Company.total += 임의택.income = 500;
		Company.total += 정유찬.income = 1000;
		Company.total += 오태양.income = 2000;
		Company.total += 김욱성.income = 3000;
		
		System.out.println("회사 수익 : " + Company.total);
	}
}
