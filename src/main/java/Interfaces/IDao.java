package Interfaces;

import java.util.Collection;

import Modelo.Cancion;
import Modelo.Usuario;

public interface IDao<T, K> {
	boolean insert (T ob);
	T get(K id);
	Collection <T> getAll();
	int update (T ob);
	int delete (T ob);
}
