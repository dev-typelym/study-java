package classTest;

class Car{
//	�귣��
	String brand;
//	����
	String color;
//	����
	int price;
//	������
	Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	
	public Car(String color, int price) {
		this.color = color;
		this.price = price;
	}


//	�õ��ѱ�(�귣�� �õ� �ѱ�)
	void turnOn() {
		System.out.println(this.brand +" �õ��ѱ�");
	}
//	�õ�����(�귣�� �õ� ����)
	void turnOff() {
		System.out.println(this.brand +" �õ�����");
	}
}

public class Road {
	public static void main(String[] args) {
		Car myCar = new Car("KIA", "black", 3000);
		Car momCar = new Car("Benz", "white", 10000);
		Car dadyCar = new Car("Red", 6000);
		
		myCar.turnOn();
		myCar.turnOff();
		
		momCar.turnOn();
		momCar.turnOff();
		
		dadyCar.turnOn();
		dadyCar.turnOff();
	}
	
	
	
}
