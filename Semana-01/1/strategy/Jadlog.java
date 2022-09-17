package strategy;

public class Jadlog implements Shipping {

	@Override
	public double calculateShipping(Product product, double distance) {
		return product.getWeight()*18+distance*0.022;
	}

}
