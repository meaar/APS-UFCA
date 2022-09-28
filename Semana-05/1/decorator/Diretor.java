package decorator;

public class Diretor extends Incorporado{
    
    public Diretor(double salario, String descricao) {
    	super(salario, descricao);
    }
    public double calcularSalario() {
        return getCargo().calcularSalario() + 1000.00;
    }

    public String mostrarNome() {
        return getCargo().mostrarNome() + "->Diretor";
    }
}
