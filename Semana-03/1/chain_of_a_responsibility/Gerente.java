package chain_of_a_responsibility;

public class Gerente extends Gestor {

    public Gerente(double limite, String cargo, Gestor sucessor) {
		super(limite, cargo, sucessor);
	}
	@Override
	public void aprovarVerba(Verba verba) {
		if (verba.getValor() <= 2000){
			System.out.println("Verba de "+verba.getValor()+" aprovada por cargo: " +this.getCargo()); 
		}else{
			sucessor.aprovarVerba(verba);
		}
	}

}
