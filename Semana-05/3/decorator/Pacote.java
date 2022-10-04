package decorator;

public abstract class Pacote {

    private String descricao;
	private double valor;
	
	public Pacote(String descricao, double valor) {
		this.descricao = descricao;
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public Double getValor() {
		return valor;
	}
    
}
