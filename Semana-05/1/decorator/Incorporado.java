package decorator;

public abstract class Incorporado extends Cargo{
    private Cargo cargo;

    
    public Incorporado(double salario, String descricao) {
    	super(salario, descricao);
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setIncorporado(Cargo cargo) {
        this.cargo = cargo;
    }
}
