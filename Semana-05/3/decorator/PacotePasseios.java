package decorator;

public class PacotePasseios extends PacoteDecorator {

    public PacotePasseios(Pacote pacote, String descricao, double valor) {
        super(pacote,"Pacote de passeios: "+descricao,valor);
    }

}
