package chain_of_a_responsibility;

public abstract class Banco {

    private String nome;
    protected Banco sucessor;
	private int codigo;

    public Banco(String nome, int codigo, Banco sucessor){
        this.nome = nome;
        this.codigo = codigo;
        this.sucessor = sucessor;
    }
    public void pagamento(Conta conta, Requisicao requisicao) {
        if (conta.getSaldo() < requisicao.getPreco()) {
            System.out.println("Saldo da conta insuficiente!");
        }else{
            conta.setSaldo(conta.getSaldo()-requisicao.getPreco());
            System.out.println("Compra de "+requisicao.getDescricao()+" no valor de "+requisicao.getPreco()+" realizada com sucesso!");
        }
    }
    public void validacao(Conta conta, Requisicao requisicao) {
		if (requisicao.getCodigo() == this.codigo) {
			System.out.println(this.nome+" validou a compra");
            pagamento(conta, requisicao);
        }else if (this.sucessor != null) {
            this.sucessor.validacao(conta, requisicao);
        }else{
            System.out.println("Não é possivel validar o pagamento! "+this.nome+" Nao suporta o codigo "+this.codigo);
        }
	}
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
	public Banco getSucessor() {
        return sucessor;
    }
    public void setSucessor(Banco sucessor) {
        this.sucessor = sucessor;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
	
}
