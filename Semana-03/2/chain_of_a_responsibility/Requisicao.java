package chain_of_a_responsibility;

public class Requisicao {

    private double codigo;
	private String descricao;
	private double preco;
    
	public Requisicao(double codigo, String descricao, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}
	public double getPreco() {
		return preco;
	}
	public double getCodigo() {
		return codigo;
	}
	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Requisicao(double codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

}
