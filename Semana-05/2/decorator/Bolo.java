package decorator;

public abstract class Bolo {

    private String descricao;
	private double valor;
	
	public Bolo(String descricao, double valor) {
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
