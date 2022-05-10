package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import Interfaces.IDao;
import Modelo.Cancion;
import Modelo.Usuario;
import utils.Connect;

public class UsuarioDAO implements IDao<Usuario, Integer> {
	private Connection miConexion;

	public UsuarioDAO() {
		this.miConexion = Connect.getConnect();

	}

	public boolean insert(Usuario us) {
		miConexion = Connect.getConnect();
		String sql = "INSERT INTO Usuario(Nombre, Contraseña, id_u) VALUES(?,?,?)";
		try {
			PreparedStatement sentencia = miConexion.prepareStatement(sql);
			sentencia.setString(1, us.getNombre());
			sentencia.setString(2, us.getContra());
			sentencia.setInt(3, us.getKey());
			sentencia.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public Usuario get(Integer id) {
		Usuario u = null;
		String sql = "SELECT Nombre, Contraseña, id_u WHERE id_u=?";
		try {
			PreparedStatement sentencia = miConexion.prepareStatement(sql);
			sentencia.setInt(1, id);
			ResultSet miRs = sentencia.executeQuery();
			miRs.next();
			u.setNombre(miRs.getString("Nombre"));
			u.setContra(miRs.getString("Contraseña"));
			u.setKey(miRs.getInt("Key"));;
		
			CancionDAO cDAO = new CancionDAO();
			u.setMisCanciones(cDAO.getAllCancionesForUsuario(u));
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	public Collection<Usuario> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(Usuario us) {
		miConexion = Connect.getConnect();
		String sql = "UPDATE TABLE SET Nombre, Contraseña, id_u WHERE id_u=?";
		try {
			PreparedStatement sentencia = miConexion.prepareStatement(sql);
			sentencia.setString(1, us.getNombre());
			sentencia.setString(2, us.getContra());
			sentencia.setInt(3, us.getKey());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int delete(Usuario us) {
		miConexion = Connect.getConnect();
		String sql = "DELETE from usuario WHERE Nombre, Contraseña, id_u WHERE id_u=?";
		try {
			PreparedStatement sentencia = miConexion.prepareStatement(sql);
			sentencia.setString(1, us.getNombre());
			sentencia.setString(2, us.getContra());
			sentencia.setInt(3, us.getKey());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
