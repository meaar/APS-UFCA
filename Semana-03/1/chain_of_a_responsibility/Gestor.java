package chain_of_a_responsibility;

public abstract class Gestor {

    protected Gestor sucessor;
	private double limite;
	private String cargo;

    public Gestor(double limite, String cargo, Gestor sucessor){
        this.limite = limite;
        this.cargo = cargo;
        this.sucessor = sucessor;
    }
    public abstract void aprovarVerba(Verba verba);
    public void verificar(Requisicao requisicao) {
		if (requisicao.getValor() <= this.limite) {
			System.out.println(this.cargo+" aprovou a compra no valor de "+requisicao.getValor());
        }else if (this.sucessor != null) {
            this.sucessor.verificar(requisicao);
        }else{
        	System.out.println("A compra no valor de " +requisicao.getValor()+" ultrapassa o limite de " +this.limite+" ou o Cargo não possui superior.");
        }
	}
	public Gestor getSucessor() {
        return sucessor;
    }
    public void setSucessor(Gestor sucessor) {
        this.sucessor = sucessor;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
	
}
