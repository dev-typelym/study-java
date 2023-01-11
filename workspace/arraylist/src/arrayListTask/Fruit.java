package arrayListTask;

public class Fruit {

	private String fruitName;
	private int price;

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", price=" + price + "]";
	}

}
