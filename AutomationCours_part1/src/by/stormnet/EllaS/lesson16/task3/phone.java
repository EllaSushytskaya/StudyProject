package by.stormnet.EllaS.lesson16.task3;

public class phone {
	private String name;
	private int price;

	public phone(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Phone{" +
				"name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
