package arrayListTask;

public class FruitPage {
	public static void main(String[] args) {
			Market mk = new Market();
			Fruit fruit1 = new Fruit();
			Fruit fruit2 = new Fruit();
			Fruit fruit3 = new Fruit();
	
			fruit1.setFruitName("���");
			fruit1.setPrice(5000);
			
			fruit2.setFruitName("��");
			fruit2.setPrice(8000);
			
			fruit3.setFruitName("����");
			fruit3.setPrice(15000);
			
			mk.add(fruit1);
			mk.add(fruit2);
			mk.add(fruit3);
			
			mk.remove("���");
			
	}
	
}
