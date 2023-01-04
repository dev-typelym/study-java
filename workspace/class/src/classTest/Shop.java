package classTest;

public class Shop {
	String product;
	int price;
	int left;

	public Shop() {
	}

	public Shop(String product, int price, int left) {
		this.product = product;
		this.price = price;
		this.left = left;
	}

	int sell(Customer customer) {
		left--;
		int result = (int)(price * (1.0 - customer.discount / 100.0));
		customer.money -= result;
		return result;
		
	}

	public static void main(String[] args) {
		Shop shop = new Shop("과자", 1000, 5);
		Customer customer1 = new Customer("임의택", "01072716604", 200000, 30);

		shop.sell(customer1);

		System.out.println(customer1.money);

	}

}
