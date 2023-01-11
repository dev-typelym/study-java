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

		food1.setName("떡볶이");
		food1.setPrice(3000);
		food1.setKinds("한식");
		
		food2.setName("김밥");
		food2.setPrice(2000);
		food2.setKinds("한식");
		
		food3.setName("초밥");
		food3.setPrice(5000);
		food3.setKinds("일식");
		
		food4.setName("타코야키");
		food4.setPrice(3000);
		food4.setKinds("일식");
		
		food5.setName("짜장면");
		food5.setPrice(8000);
		food5.setKinds("중식");
		
		food6.setName("햄버거");
		food6.setPrice(6000);
		food6.setKinds("양식");
		
		rt.add(food1);
		rt.add(food2);
		rt.add(food3);
		rt.add(food4);
		rt.add(food5);
		rt.add(food6);
		
		System.out.println(rt.foodSearch("초밥"));
		System.out.println(rt.kindsAll("일식"));
		
		rt.updateKind(food6);
		System.out.println(food1);
		System.out.println(rt.foodCount("일식"));
		
		
	}
}
