package Modelo;

public class Cancion  {
	
	private String Nombre;
	private String Genero;
	private String Duracion;
	private String Artista;
	private Usuario usuario;
	private int key;

	
	
	
	public Cancion(String nombre, String genero, String duracion, String artista, Usuario usuario, int key) {
		super();
		Nombre = nombre;
		Genero = genero;
		Duracion = duracion;
		Artista = artista;
		this.usuario = usuario;
		this.key = key;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String getGenero() {
		return Genero;
	}
	
	public void setGenero(String genero) {
		Genero = genero;
	}
	
	public String getDuracion() {
		return Duracion;
	}
	
	public void setDuracion(String duracion) {
		Duracion = duracion;
	}
	
	public String getArtista() {
		return Artista;
	}
	
	public void setArtista(String artista) {
		Artista = artista;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	


}
