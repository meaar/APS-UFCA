package decorator;

public class App {
    public static void main(String[] args) {
		Pacote viagem = new DestinoPraia("Fortaleza", 300);
		viagem = new PacoteBebidas(viagem, "Basico", 200);
		viagem = new PacoteMassagens(viagem, "Premium", 1000);
		viagem = new PacotePasseios(viagem, "Basico ", 100);
		System.out.println(viagem.getDescricao()+"\nValor: "+viagem.getValor());
	}
}
