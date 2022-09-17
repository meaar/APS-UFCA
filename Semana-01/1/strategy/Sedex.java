package strategy;

public class Sedex implements Shipping {

	@Override
	public double calculateShipping(Product product, double distance) {
		return product.getWeight()*20+distance*0.02;
	}

}
