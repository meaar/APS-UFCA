package decorator;

public class BoloFruta extends BoloDecorator {

    public BoloFruta(Bolo bolo, String descricao, double valor) {
        super(bolo,"Fruta: "+descricao,valor);
    }

}
