package arrayListTask;

public class FoodPage {
	public static void main(String[] args) {
		Restaurant rt = new Restaurant();
		Food food1 = new Food();
		Food food2 = new Food();
		Food food3 = new Food();
		Food food4 = new Food();
		Food food5 = new Food();
		Food food6 = new Food();

		food1.setName("������");
		food1.setPrice(3000);
		food1.setKinds("�ѽ�");
		
		food2.setName("���");
		food2.setPrice(2000);
		food2.setKinds("�ѽ�");
		
		food3.setName("�ʹ�");
		food3.setPrice(5000);
		food3.setKinds("�Ͻ�");
		
		food4.setName("Ÿ�ھ�Ű");
		food4.setPrice(3000);
		food4.setKinds("�Ͻ�");
		
		food5.setName("¥���");
		food5.setPrice(8000);
		food5.setKinds("�߽�");
		
		food6.setName("�ܹ���");
		food6.setPrice(6000);
		food6.setKinds("���");
		
		rt.add(food1);
		rt.add(food2);
		rt.add(food3);
		rt.add(food4);
		rt.add(food5);
		rt.add(food6);
		
		System.out.println(rt.foodSearch("�ʹ�"));
		System.out.println(rt.kindsAll("�Ͻ�"));
		
		rt.updateKind(food6);
		System.out.println(food1);
		System.out.println(rt.foodCount("�Ͻ�"));
		
		
	}
}
