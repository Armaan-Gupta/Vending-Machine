package vendingMachine;

public class CashRegister {
	public VendingMach vMach;
	public int c1;
	public int c5;
	public int c10;
	public int c25;
	
	public CashRegister(VendingMach vMach) {
		this.c1 = 25;
		this.c5 = 15;
		this.c10 = 15;
		this.c25 = 10;
		this.vMach = vMach;
	}
	
	public int showBalance() {
		return c1 + 5*c5 + 10*c10 + 25*c25;
	}
	
	public void putMoney(int pc1, int pc5, int pc10, int pc25, Product p) {
		int totalAmt = 1*pc1 + 5*pc5 + 10*pc10 + 25*pc25;
		if (totalAmt < p.getPrice()) {
			System.out.println("Insufficient amount");
		}
		else {
			vMach.dispense(p);
			int balance = totalAmt - p.getPrice();
			int balC25 = balance / 25;
			balance = balance % 25;
			int balC10 = balance / 10;
			balance = balance % 10;
			int balC5 = balance / 5;
			balance = balance % 5;
			int balC1 = balance / 1;
			System.out.println("Your balance is " + balC25 + " c25 " + balC10 + " c10 " + balC5 + " c5 " + balC1 + " c1");
			this.c25 += pc25 - balC25;
			this.c5 += pc5 - balC5;
			this.c10 += pc10 - balC10;
			this.c1 += pc1 - balC1;
			System.out.println("Amount remaining in machine is " + c25 + " c25 " + c10 + " c10 " + c5 + " c5 " + c1 + " c1");
		}
	}
	
	
}
