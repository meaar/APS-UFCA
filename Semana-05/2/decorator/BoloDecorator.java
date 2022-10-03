package decorator;

public abstract class BoloDecorator extends Bolo {

    protected Bolo bolo;

    public BoloDecorator(Bolo bolo, String descricao, double valor) {
        super(bolo.getDescricao()+" + "+descricao, bolo.getValor()+valor);
        this.bolo = bolo;
    }
    
}
