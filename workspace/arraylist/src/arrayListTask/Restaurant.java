package arrayListTask;

import java.util.ArrayList;

public class Restaurant {
	public ArrayList<Food> foods = DBConnector.foods;
	public ArrayList<String> koFood = new ArrayList<>();
	
	private final double KEY = 1.1;
	
	// 음식검사
	public Food checkFood(String name) {
		for (Food food : foods) {
			if (food.getName().equals(name)) {
				return food;
			}
		}
		return null;
	}
	

	// 음식추가
	public void add(Food food) {
		foods.add(food);
	}

	// 음식 이름으로 음식 종류 조회
	public String foodSearch(String name) {
		return checkFood(name).getKinds();
	}

	// 사용자가 원하는 종류의 음식 전체 조회
	public ArrayList<String> kindsAll(String kinds) {
		for (Food food : foods) {
			if (food.getKinds().equals(kinds)) {
				koFood.add(food.getName());
			}
		}
		return koFood;
	}
	
	
	
	//음식 종류 수정 후 가격 10% 상승
	public void updateKind(Food food) {
		for (Food foodDataBase : foods) {
			if(foodDataBase.getName().equals(food.getName())) {
				food.setKinds(food.getKinds());
				food.setPrice(food.getPrice()*KEY);
			}
			
		}
	}
	//사용자가 원하는 종류의 음식 개수 조회
	public int foodCount(String kinds) {
		int count = 0;
		for (Food food : foods) {
			if (food.getKinds().equals(kinds)) {
				count++;
			}
		}
		return count;
	}

}
