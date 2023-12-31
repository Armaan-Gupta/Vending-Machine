package vendingMachine;

interface VendingMach {
	public void dispense(Product p);
}

class Coke implements VendingMach {
	private String name;
	private Product cocaCola;
	private Product fanta;
	private Product sprite;
	private Product lays;
	private Product doritos;
	
	public Coke() {
		this.name = "Coke";
		this.cocaCola = new CocaCola();
		this.fanta = new Fanta();
		this.sprite = new Sprite();
		this.lays = new Lays();
		this.doritos = new Doritos();
	}
	
	public void dispense(Product p) {
		System.out.println("Dispensed product " + p.getName());
	}
}

class PepsiMach implements VendingMach {
	
	private String name;
	private Product pepsi;
	private Product up7;
	private Product limca;
	private Product kurkure;
	private Product cheetos;
	
	public PepsiMach() {
		this.name = "PepsiMach";
		this.pepsi = new Pepsi();
		this.up7 = new Up7();
		this.limca = new Limca();
		this.kurkure = new Kurkure();
		this.cheetos = new Cheetos();
	}
	
	public void dispense(Product p) {
		System.out.println("Dispensed product " + p.getName());
	}
}