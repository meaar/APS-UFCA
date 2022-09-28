package decorator;

public class Adjunto extends Cargo{

    public Adjunto(double salario, String descricao) {
        super(salario, descricao);
    }

    @Override
    public double calcularSalario() {
        return getSalario() + 2500;
    }

    @Override
    public String mostrarNome() {
        return getDescricao() + "->Adjunto";
    }
    
}
