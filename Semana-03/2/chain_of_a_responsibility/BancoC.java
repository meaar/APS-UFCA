package chain_of_a_responsibility;

public class BancoC extends Banco {

    public BancoC(String nome, int codigo, Banco sucessor) {
        super(nome, codigo, sucessor);
    }
    
}
