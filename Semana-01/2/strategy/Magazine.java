package strategy;

public class Magazine extends Product {

    @Override
    public double cashPayment() {
        if (super.isDigital()){
            return super.getPrice()-super.getPrice()*0.15;
        }else{
            return super.getPrice()-super.getPrice()*0.3;
        }
    }
    
}
