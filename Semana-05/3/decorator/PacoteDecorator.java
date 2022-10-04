package decorator;

public abstract class PacoteDecorator extends Pacote {

    protected Pacote pacote;

    public PacoteDecorator(Pacote pacote, String descricao, double valor) {
        super(pacote.getDescricao()+" + "+descricao, pacote.getValor()+valor);
        this.pacote = pacote;
    }
    
}
