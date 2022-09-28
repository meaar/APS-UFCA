package decorator;

public abstract class Cargo {
    private double salario;
    private String descricao;

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Cargo(double salario, String descricao) {
        this.salario = salario;
        this.descricao = descricao;
    }
    
    public abstract double calcularSalario();
    public abstract String mostrarNome();
}
