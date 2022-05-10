package Modelo;

import java.util.Collection;
import java.util.List;

public class Usuario {
	
	private String Nombre;
	private String Contra;
	private int Key;
	List<Cancion>misCanciones;
	
	

	private Usuario(String nombre, String contra, int key, List<Cancion> misCanciones) {
		super();
		Nombre = nombre;
		Contra = contra;
		Key = key;
		this.misCanciones = misCanciones;
	}
	
	

	public String getNombre() {
		return Nombre;
	}



	public void setNombre(String nombre) {
		Nombre = nombre;
	}



	public String getContra() {
		return Contra;
	}



	public void setContra(String contra) {
		Contra = contra;
	}



	public int getKey() {
		return Key;
	}



	public void setKey(int key) {
		Key = key;
	}



	public List<Cancion> getMisCanciones() {
		return misCanciones;
	}



	public void setMisCanciones(List<Cancion> misCanciones) {
		this.misCanciones = misCanciones;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Contra == null) ? 0 : Contra.hashCode());
		result = prime * result + Key;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		result = prime * result + ((misCanciones == null) ? 0 : misCanciones.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (Contra == null) {
			if (other.Contra != null)
				return false;
		} else if (!Contra.equals(other.Contra))
			return false;
		if (Key != other.Key)
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		if (misCanciones == null) {
			if (other.misCanciones != null)
				return false;
		} else if (!misCanciones.equals(other.misCanciones))
			return false;
		return true;
	}


	

}
