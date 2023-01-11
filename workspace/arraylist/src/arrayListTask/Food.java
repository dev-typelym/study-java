package arrayListTask;

public class Food {
	
	private String name;
	private double price;
	private String kinds;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", kinds=" + kinds + "]";
	}
	
	
}
