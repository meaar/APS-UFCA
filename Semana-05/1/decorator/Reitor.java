package decorator;

public class Reitor extends Incorporado {
    public Reitor(double salario, String descricao) {
    	super(salario, descricao);
    }
    
    public double calcularSalario() {
        return getCargo().calcularSalario() + 1000.00;
    }

    public String mostrarNome() {
        return getCargo().mostrarNome() + "->Reitor";
    }
}
