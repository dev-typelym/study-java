package arrayListTask;

import java.util.ArrayList;

public class Restaurant {
	public ArrayList<Food> foods = DBConnector.foods;
	public ArrayList<String> koFood = new ArrayList<>();
	
	private final double KEY = 1.1;
	
	// ���İ˻�
	public Food checkFood(String name) {
		for (Food food : foods) {
			if (food.getName().equals(name)) {
				return food;
			}
		}
		return null;
	}
	

	// �����߰�
	public void add(Food food) {
		foods.add(food);
	}

	// ���� �̸����� ���� ���� ��ȸ
	public String foodSearch(String name) {
		return checkFood(name).getKinds();
	}

	// ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
	public ArrayList<String> kindsAll(String kinds) {
		for (Food food : foods) {
			if (food.getKinds().equals(kinds)) {
				koFood.add(food.getName());
			}
		}
		return koFood;
	}
	
	
	
	//���� ���� ���� �� ���� 10% ���
	public void updateKind(Food food) {
		for (Food foodDataBase : foods) {
			if(foodDataBase.getName().equals(food.getName())) {
				food.setKinds(food.getKinds());
				food.setPrice(food.getPrice()*KEY);
			}
			
		}
	}
	//����ڰ� ���ϴ� ������ ���� ���� ��ȸ
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
