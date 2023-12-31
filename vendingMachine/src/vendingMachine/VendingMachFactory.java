package vendingMachine;

public class VendingMachFactory {
	public VendingMach getVendingMach(String machType) {
		if (machType == null) {
			return null;
		}
		if (machType.equalsIgnoreCase("coke"))
			return new Coke();
		else if(machType.equalsIgnoreCase("pepsi"))
			return new PepsiMach();
		return null;
	}
}
