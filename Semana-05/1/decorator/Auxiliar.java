package decorator;

public class Auxiliar extends Cargo {

    public Auxiliar(double salario, String descricao) {
        super(salario, descricao);
    }

    @Override
    public double calcularSalario() {
        return getSalario() + 1000;
    }

    @Override
    public String mostrarNome() {
        return getDescricao() + "->Auxiliar";
    }
    
}
