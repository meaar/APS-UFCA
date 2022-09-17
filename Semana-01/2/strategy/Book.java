package strategy;

public class Book extends Product {

    @Override
    public double cashPayment() {
        if (super.isDigital()){
            return super.getPrice()-super.getPrice()*0.15;
        }else{
            return super.getPrice()-super.getPrice()*0.3;
        }

    }
    
}
