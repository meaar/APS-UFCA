package decorator;

public class BoloCobertura extends BoloDecorator {

    public BoloCobertura(Bolo bolo, String descricao, double valor) {
        super(bolo,"Cobertura: "+descricao,valor);
    }
    
}
