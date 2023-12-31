package vendingMachine;

public class Customer {
	
	VendingMach v;
	String name;
	
	
	public Customer(VendingMach v, String name) {
		this.v = v;
		this.name = name;
	}
	
	public void askProduct(Product p) {
		v.dispense(p);
	}
}
