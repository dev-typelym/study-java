package classTest;

class Car{
//	브랜드
	String brand;
//	색상
	String color;
//	가격
	int price;
//	생성자
	Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	
	public Car(String color, int price) {
		this.color = color;
		this.price = price;
	}


//	시동켜기(브랜드 시동 켜기)
	void turnOn() {
		System.out.println(this.brand +" 시동켜기");
	}
//	시동끄기(브랜드 시동 끄기)
	void turnOff() {
		System.out.println(this.brand +" 시동끄기");
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
