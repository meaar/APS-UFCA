package strategy;

public class Library {
    protected double balance;
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void sellProduct(User user, Product product, boolean cashPayment) {
        if (cashPayment) {
            if (user.getBalance()-product.cashPayment() >= 0) {
                user.setBalance(user.getBalance()-product.cashPayment());
                setBalance(getBalance()+product.cashPayment());
                System.out.println("Successful purchase");
            } else {
                System.out.println("Unable to make a purchase. Insufficient funds");
            }
        } else {
            if (user.getBalance()-product.getPrice() >= 0) {
                user.setBalance(user.getBalance()-product.getPrice());
                setBalance(getBalance()+product.getPrice());
                System.out.println("Successful purchase");
            } else {
                System.out.println("Unable to make a purchase. Insufficient funds");
            }
        }
    }

}