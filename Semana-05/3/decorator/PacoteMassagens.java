package decorator;

public class PacoteMassagens extends PacoteDecorator {

    public PacoteMassagens(Pacote pacote, String descricao, double valor) {
        super(pacote,"Pacote de massagens: "+descricao,valor);
    }

}
