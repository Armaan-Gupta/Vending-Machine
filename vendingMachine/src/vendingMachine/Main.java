package vendingMachine;

public class Main {
	public static void main(String args[]) {
		VendingMachFactory vmf = new VendingMachFactory();
		ProductFactory pf = new ProductFactory();
		
		VendingMach coke = vmf.getVendingMach("coke");
		Product cocaCola = pf.getProduct("cocacola");
		
		Customer armaan = new Customer(coke, "Armaan");
		armaan.askProduct(cocaCola);
		
	}
}
