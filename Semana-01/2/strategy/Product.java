package strategy;

public abstract class Product {
    private double price;
    private boolean digital;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public abstract double cashPayment();

}
