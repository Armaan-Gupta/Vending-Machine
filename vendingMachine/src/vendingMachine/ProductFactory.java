package vendingMachine;

public class ProductFactory {
	public Product getProduct(String productType) {
		if (productType.equalsIgnoreCase("cocacola")) {
			return new CocaCola();
		}
		else if (productType.equalsIgnoreCase("fanta")) {
			return new Fanta();
		}
		else if (productType.equalsIgnoreCase("sprite")) {
			return new Sprite();
		}
		else if (productType.equalsIgnoreCase("lays")) {
			return new Lays();
		}
		else if (productType.equalsIgnoreCase("doritos")) {
			return new Doritos();
		}
		else if (productType.equalsIgnoreCase("pepsi")) {
			return new Pepsi();
		}
		else if (productType.equalsIgnoreCase("7up")) {
			return new Up7();
		}
		else if (productType.equalsIgnoreCase("limca")) {
			return new Limca();
		}
		else if (productType.equalsIgnoreCase("kurkure")) {
			return new Kurkure();
		}
		else if (productType.equalsIgnoreCase("cheetos")) {
			return new Cheetos();
		}
		return null;
	}
}
