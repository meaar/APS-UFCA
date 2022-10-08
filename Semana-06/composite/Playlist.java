package composite;

import java.util.ArrayList;
import java.util.Random;

public class Playlist implements Componente {

	private String nomePlayList;
	private ArrayList<Componente> playlists;

	public Playlist() {
	}
	public Playlist(String nomePlayList) {
		this.nomePlayList = nomePlayList;
		this.playlists = new ArrayList<Componente>();
	}
	public void setNomePlayList(String nomePlayList) {
		this.nomePlayList = nomePlayList;
	}
	public ArrayList<Componente> getPlaylists() {
		return playlists;
	}
	public void adicionar(Componente playlists) {
		this.playlists.add(playlists);
	}
	public void remover(Componente componente) {
		for (int i = 0; i < this.playlists.size(); i++) {
			if (this.playlists.get(i).equals(componente)){
				this.playlists.remove(i);
				break;
			}
		}
	}
	@Override
	public void tocar() {
		System.out.println("Tocando playlist " +getNome());
		Random random = new Random();
		this.playlists.get(random.nextInt(this.playlists.size())).tocar();;
	}
	@Override
	public void setVelocidadeReproducao(float velocidade) {
		for (Componente componente : this.playlists) {
			componente.setVelocidadeReproducao(velocidade);
		}
		System.out.println("Velocidade de reprodução da playlist "+getNome()+" alterada para "+velocidade);
	}
	@Override
	public String getNome() {
		return nomePlayList;
	}

}
