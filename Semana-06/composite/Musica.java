package composite;

public class Musica implements Componente{

	private String nomeMusica;
	private String artista;
	private float velocidadeReproducao;
	
	public Musica() {
	}
	public Musica(String nomeMusica, String artista) {
		this.nomeMusica = nomeMusica;
		this.artista = artista;
		this.velocidadeReproducao = 1;
	}

	public void setNomeMusica(String nomeMusica) {
		this.nomeMusica = nomeMusica;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public float getVelocidadeReproducao() {
		return velocidadeReproducao;
	}
	@Override
	public void setVelocidadeReproducao(float velocidade) {
		this.velocidadeReproducao = velocidade;
	}
	@Override
	public void tocar() {
		System.out.println("Tocando "+getNome());
	}
	@Override
	public String getNome() {
		return nomeMusica;
	}

}
