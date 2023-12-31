package vendingMachine;

interface Product {
	public String getName();
	public int getPrice();
	public void setPrice(int price);
	public int getCount();
	public void setCount(int count);
}

class CocaCola implements Product{
	private String name;
	private int price;
	private int count;
	
	public CocaCola() {
		this.name = "CocaCola";
		this.price = 45;
		this.count = 5;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

class Fanta implements Product{
	private String name;
	private int price;
	private int count;
	
	public Fanta() {
		this.name = "Fanta";
		this.price = 45;
		this.count = 5;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

class Sprite implements Product{
	private String name;
	private int price;
	private int count;
	
	public Sprite() {
		this.name = "Sprite";
		this.price = 45;
		this.count = 5;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

class Lays implements Product{
	private String name;
	private int price;
	private int count;
	
	public Lays() {
		this.name = "Lays";
		this.price = 15;
		this.count = 10;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

class Doritos implements Product{
	private String name;
	private int price;
	private int count;
	
	public Doritos() {
		this.name = "Doritos";
		this.price = 17;
		this.count = 10;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

class Pepsi implements Product{
	private String name;
	private int price;
	private int count;
	
	public Pepsi() {
		this.name = "Pepsi";
		this.price = 45;
		this.count = 5;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

class Up7 implements Product{
	private String name;
	private int price;
	private int count;
	
	public Up7() {
		this.name = "7up";
		this.price = 45;
		this.count = 5;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

class Limca implements Product{
	private String name;
	private int price;
	private int count;
	
	public Limca() {
		this.name = "Limca";
		this.price = 45;
		this.count = 5;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

class Kurkure implements Product{
	private String name;
	private int price;
	private int count;
	
	public Kurkure() {
		this.name = "Kurkure";
		this.price = 15;
		this.count = 10;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

class Cheetos implements Product{
	private String name;
	private int price;
	private int count;
	
	public Cheetos() {
		this.name = "Cheetos";
		this.price = 17;
		this.count = 10;
	}
	
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return this.count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
