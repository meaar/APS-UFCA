package chain_of_a_responsibility;

public class Presidente extends Gestor {

    public Presidente(double limite, String cargo, Gestor sucessor) {
		super(limite, cargo, sucessor);
	}
	@Override
	public void aprovarVerba(Verba verba) {
		if (verba.getValor() <= 4000){
			System.out.println("Verba de "+verba.getValor()+" aprovada por cargo: " +this.getCargo()); 
		}else{
			sucessor.aprovarVerba(verba);
		}
	}

}
