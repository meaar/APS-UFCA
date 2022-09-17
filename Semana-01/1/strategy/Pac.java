package strategy;

public class Pac implements Shipping {

	@Override
	public double calculateShipping(Product product, double distance) {
		return product.getWeight()*19+distance*0.017;
	}

}
