package inheritanceTest;

class Human{
	void eat() {
		System.out.println("�Ա�");
	}
	
	void sleep() {
		System.out.println("���ڱ�");
	}
	
	void walk() {
		System.out.println("�ι߷� �ȱ�");
	}

	
}

 class Monkey extends Human{
	 
	 void shakeTail() {
		 System.out.println("���� ġ��");
	 }
	 
	 @Override
	 void walk() {
//			System.out.println("�ι߷� �ȱ� �Ǵ� �׹߷� �ȱ�");
		 super.walk();
		 System.out.println("�׹߷� �ȱ�");
	}
	 
 }



public class InheritacneTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		kingkong.walk();
	}
}
