package chain_of_a_responsibility;

public class BancoA extends Banco {

    public BancoA(String nome, int codigo, Banco sucessor) {
        super(nome, codigo, sucessor);
    }
    
}
