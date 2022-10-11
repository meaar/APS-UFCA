package chain_of_a_responsibility;

public class App {
    public static void main(String[] args) {

        Banco sucessor = null;
		Conta conta_e_commerce = new Conta("Alberto",8000);
		BancoA bancoA = new BancoA("Nubank", 1, sucessor);
		BancoB bancoB = new BancoB("Banco do Brasil", 2, bancoA);
		BancoC bancoC = new BancoC("Bradesco", 3, bancoB);
		bancoA.setSucessor(bancoC);
			
		Requisicao req1 = new Requisicao(1, "Notebook",3000);
		Requisicao req2 = new Requisicao(2, "Mouse e Teclado",400);
		Requisicao req3 = new Requisicao(3, "Mesa digitalizadora",200);
		Requisicao req4 = new Requisicao(3, "iMac",8000);

		bancoA.validacao(conta_e_commerce,req3);
		bancoC.validacao(conta_e_commerce,req1);
		bancoB.validacao(conta_e_commerce,req2);
		bancoA.validacao(conta_e_commerce,req1);
		bancoC.validacao(conta_e_commerce,req4);
        
    }
}