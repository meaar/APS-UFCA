package strategy;

public class Game extends Product {

    @Override
    public double cashPayment() {
        if (super.isDigital()){
            return super.getPrice();
        }else{
            return super.getPrice()-super.getPrice()*0.3;
        }
    }

}
