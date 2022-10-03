package decorator;

public class App {
    public static void main(String[] args) {
		Bolo bolo1 = new BoloSabor("limão",15);
		bolo1 = new BoloCobertura(bolo1, "chocolate", 7);
		bolo1 = new BoloFruta(bolo1, "morango", 6.50);
		bolo1 = new BoloFruta(bolo1, "amora ", 4);
		System.out.println(bolo1.getDescricao()+"\nValor: "+bolo1.getValor());

		Bolo bolo2 = new BoloSabor("laranja",15);
		bolo2 = new BoloFruta(bolo2, "pêssego", 3);
		bolo2 = new BoloFruta(bolo2, "amora ", 4);
		bolo2 = new BoloFruta(bolo2, "morango", 6.50);
		System.out.println(bolo2.getDescricao()+"\nValor: "+bolo2.getValor());

		Bolo bolo3 = new BoloSabor("chocolate",16);
		bolo3 = new BoloCobertura(bolo3, "chocolate", 7);
		bolo3 = new BoloFruta(bolo3, "morango", 6.50);
		System.out.println(bolo3.getDescricao()+"\nValor: "+bolo3.getValor());
	}
}
