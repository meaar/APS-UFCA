package chain_of_a_responsibility;

public class App {
    public static void main(String[] args) {

        Gestor sucessor = null;
		
		Presidente pres = new Presidente(5000, "Presidente", sucessor);
		Diretor dir1 = new Diretor(2000, "Diretor", pres);
		Gerente ger1 = new Gerente(500, "Gerente", dir1);
			
		Requisicao req1 = new Requisicao(3000, "Notebook");
		Requisicao req2 = new Requisicao(150, "Mouse e Teclado");
		Requisicao req3 = new Requisicao(1800, "Mesa digitalizadora");
		Requisicao req4 = new Requisicao(6000, "iMac");
		
		Verba v1 = new Verba(450);
		Verba v2 = new Verba(3965);
		Verba v3 = new Verba(1850);
		
		ger1.setSucessor(dir1);
		dir1.setSucessor(pres);
		
		ger1.aprovarVerba(v1);
		ger1.aprovarVerba(v2);
		ger1.aprovarVerba(v3);
		
		ger1.verificar(req1);
		ger1.verificar(req2);
		ger1.verificar(req3);
		ger1.verificar(req4);
        
    }
}