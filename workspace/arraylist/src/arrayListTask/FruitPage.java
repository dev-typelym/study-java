package arrayListTask;

public class FruitPage {
	public static void main(String[] args) {
			Market mk = new Market();
			Fruit fruit1 = new Fruit();
			Fruit fruit2 = new Fruit();
			Fruit fruit3 = new Fruit();
	
			fruit1.setFruitName("사과");
			fruit1.setPrice(5000);
			
			fruit2.setFruitName("배");
			fruit2.setPrice(8000);
			
			fruit3.setFruitName("딸기");
			fruit3.setPrice(15000);
			
			mk.add(fruit1);
			mk.add(fruit2);
			mk.add(fruit3);
			
			mk.remove("사과");
			
	}
	
}
