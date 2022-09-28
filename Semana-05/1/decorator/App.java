package decorator;

public class App {
    public static void main(String[] args) {
        Cargo auxiliar1 = new Auxiliar(3000, "Auxiliar");
        System.out.println(auxiliar1.mostrarNome() + " R$ " + auxiliar1.calcularSalario());
        Cargo adjunto1 = new Adjunto(5000, "Adjunto");
        System.out.println(adjunto1.mostrarNome() + " R$ " + adjunto1.calcularSalario());

        Incorporado coordenador1 = new Coordenador(0, "Coordernador");
        coordenador1.setIncorporado(auxiliar1);
        System.out.println(coordenador1.mostrarNome() + " R$ " + coordenador1.calcularSalario());

        Incorporado diretor1 = new Diretor(0, "Diretor");
        diretor1.setIncorporado(adjunto1);
        System.out.println(diretor1.mostrarNome() + " R$ " + diretor1.calcularSalario());

        Incorporado reitor1 = new Reitor(0, "Reitor");
        reitor1.setIncorporado(diretor1);
        System.out.println(reitor1.mostrarNome() + " R$ " + reitor1.calcularSalario());
    }
}