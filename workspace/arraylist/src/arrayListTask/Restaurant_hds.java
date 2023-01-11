

	
package arrayListTask;

import java.util.ArrayList;

public class Restaurant_hds {
   ArrayList<Food_hds> foods = DBConnector.foodss;
   
//   ���� �߰�
   public void add(Food_hds food) {
      foods.add(food);
   }
   
//   ���� �̸����� ���� ���� ��ȸ
   public String findKindByName(String name) {
      for (Food_hds food : foods) {
         if(food.getName().equals(name)) {
            return food.getKind();
         }
      }
      return null;
   }
   
//   ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
   public ArrayList<Food_hds> findAllByKind(String kind){
      ArrayList<Food_hds> results = new ArrayList<Food_hds>();
      for (Food_hds food : foods) {
         if(food.getKind().equals(kind)) {
            results.add(food);
         }
      }
      return results;
   }
   
//   ���� ���� ���� �� ���� 10% ���
   public void update(Food_hds food) {
      for (Food_hds foodInDatabase : foods) {
         if(foodInDatabase.getName().equals(food.getName())) {
            foodInDatabase.setKind(food.getKind());
            foodInDatabase.setPrice((int)(foodInDatabase.getPrice() * 1.1));
         }
      }
   }
   
//   ����ڰ� ���ϴ� ������ ���� ���� ��ȸ
   public int getCountByKind(String kind) {
      int count = 0;
      for (Food_hds food : foods) {
         if(food.getKind().equals(kind)) {
            count ++;
         }
      }
      return count;
   }
}

