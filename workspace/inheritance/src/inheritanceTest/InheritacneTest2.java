package inheritanceTest;

class Human{
	void eat() {
		System.out.println("먹기");
	}
	
	void sleep() {
		System.out.println("잠자기");
	}
	
	void walk() {
		System.out.println("두발로 걷기");
	}

	
}

 class Monkey extends Human{
	 
	 void shakeTail() {
		 System.out.println("꼬리 치기");
	 }
	 
	 @Override
	 void walk() {
//			System.out.println("두발로 걷기 또는 네발로 걷기");
		 super.walk();
		 System.out.println("네발로 걷기");
	}
	 
 }



public class InheritacneTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		kingkong.walk();
	}
}
