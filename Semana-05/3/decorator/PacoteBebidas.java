package decorator;

public class PacoteBebidas extends PacoteDecorator {

    public PacoteBebidas(Pacote pacote, String descricao, double valor) {
        super(pacote,"Pacote de bebidas: "+descricao,valor);
    }

}
