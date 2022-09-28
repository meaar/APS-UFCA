package decorator;

public class Coordenador extends Incorporado {

    public Coordenador(double salario, String descricao) {
    	super(salario, descricao);
    }
   
    public double calcularSalario() {
        return getCargo().calcularSalario() + 1000.00;
    }

    public String mostrarNome() {
        return getCargo().mostrarNome() + "->Coordenador";
    }
}
