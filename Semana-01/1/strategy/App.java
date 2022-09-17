package strategy;

public class App {
    public static void main(String[] args) throws Exception {
        Product headset = new Product("Headset Gamer HyperX Cloud Stinger", 0.946);
        Product console = new Product("Console Xbox Serie S", 6);

        Pac shippingPAC = new Pac();
        Sedex shippingSedex = new Sedex();
        Jadlog shippingJadlog = new Jadlog();
        Fedex shippingFedex = new Fedex();

        System.out.println(headset.getName());
        System.out.println("PAC: "+shippingPAC.calculateShipping(headset, 1806.2));
        System.out.println("Sedex: "+shippingSedex.calculateShipping(headset, 1806.2));
        System.out.println("Jadlog: "+shippingJadlog.calculateShipping(headset, 1806.2));
        System.out.println("Fedex: "+shippingFedex.calculateShipping(headset, 1806.2));
        System.out.println("\n"+console.getName());
        System.out.println("PAC: "+shippingPAC.calculateShipping(console, 1806.2));
        System.out.println("Sedex: "+shippingSedex.calculateShipping(console, 1806.2));
        System.out.println("Jadlog: "+shippingJadlog.calculateShipping(console, 1806.2));
        System.out.println("Fedex: "+shippingFedex.calculateShipping(console, 1806.2));
    }
}
