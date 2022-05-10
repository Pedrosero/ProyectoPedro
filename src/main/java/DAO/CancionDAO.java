package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import Interfaces.IDao;
import Modelo.Cancion;
import Modelo.Usuario;
import utils.Connect;

public class CancionDAO implements IDao<Cancion, Integer>{
	private Connection miConexion;
	
	public CancionDAO() {
		this.miConexion=Connect.getConnect();
	}
	
	/*
	 * Metodo para insertar una canción en la bbdd
	 * Se debe poner Nombre, genero, duracion, artista
	 */
	public boolean insert(Cancion can) {
		miConexion = Connect.getConnect();
		String sql="INSERT INTO  Cancion (Nombre, Genero, Duracion, Id_c, Id_u, Artista) VALUES(?,?,?,?,?,?)";
		try {
			PreparedStatement sentencia = miConexion.prepareStatement(sql);
			sentencia.setString(1, can.getNombre());
			sentencia.setString(2, can.getGenero());
			sentencia.setString(3, can.getDuracion());
			sentencia.setInt(4, can.getKey());
			sentencia.executeUpdate();
			return true;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	
	public Cancion get(Integer id) {
		Cancion c = null;
		String sql = "SELECT Nombre, Genero, Duracion, Id_c, Id_u, Artista WHERE id_c=?";
		
	try {
		PreparedStatement sentencia = miConexion.prepareStatement(sql);
		sentencia.setInt(1, id);
		ResultSet miRs = sentencia.executeQuery();
		c = new Cancion(sql, sql, sql, sql, null, id);
		c.setNombre(miRs.getString(1));
		c.setGenero(miRs.getString(2));
		c.setDuracion(miRs.getString(3));
		c.setArtista(miRs.getString(4));
		UsuarioDAO uDAO = new UsuarioDAO();
		c.setUsuario(uDAO.get(miRs.getInt("id_u")));
		
	} catch (SQLException e){
		e.printStackTrace();
	}
		
		return c;
	}

	
	public List<Cancion> getAllCancionesForUsuario(Usuario u) {
		Collection<Cancion> listaCanciones = listaCanciones = new ArrayList<Cancion>();
		String sql = "SELECT  Nombre, Genero, Duracion, Id_c, Id_u, Artista WHERE id_c=?";
		
		try {
			PreparedStatement sentencia = miConexion.prepareStatement(sql);
			sentencia.setInt(1, u.getKey());
			ResultSet miRs = sentencia.executeQuery();
			Cancion c = new Cancion(sql, sql, sql, sql, u, 0);
			while (miRs.next()) {
				c.setNombre(miRs.getString(1));
				c.setGenero(miRs.getString(2));
				c.setDuracion(miRs.getString(3));
				c.setArtista(miRs.getString(4));
				c.setUsuario(u);
				listaCanciones.add(c);
			} 
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	/*
	 * Método para actualizar nuestro bbdd
	 */
	public int update(Cancion can) {
		miConexion=Connect.getConnect();
		String sql = "UPDATE Nombre, Genero, Duracion, Id_c, Id_u, Artista WHERE id_c=?";
		try {
			PreparedStatement sentencia = miConexion.prepareStatement(sql);
			sentencia.setString(1, can.getNombre());
			sentencia.setString(2, can.getGenero());
			sentencia.setString(3, can.getDuracion());
			sentencia.setInt(4, can.getKey());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	/*
	 * Método para borrar elementos de nuestra bbdd
	 */
	public int delete(Cancion can) {
		miConexion=Connect.getConnect();		
		String sql = "DELETE Nombre, Genero, Duracion, Id_c, Id_u, Artista WHERE id_c=?";
		try {
			PreparedStatement sentencia = miConexion.prepareStatement(sql);
			sentencia.setString(1,  can.getNombre());
			sentencia.setString(2, can.getGenero());
			sentencia.setString(3, can.getDuracion());
			sentencia.setInt(4, can.getKey());
			sentencia.setString(5, can.getArtista());
			sentencia.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Collection<Cancion> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
	

