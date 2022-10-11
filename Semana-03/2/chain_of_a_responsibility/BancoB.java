package chain_of_a_responsibility;

public class BancoB extends Banco {

    public BancoB(String nome, int codigo, Banco sucessor) {
        super(nome, codigo, sucessor);
    }
    
}
