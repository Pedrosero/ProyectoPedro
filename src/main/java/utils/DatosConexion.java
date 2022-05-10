package utils;

import java.io.Serializable;

public class DatosConexion implements Serializable {
	private String server;
	private String database;
	private String username;
	private String password;
	
	DatosConexion() {
		this.server = "";
		this.database = "";
		this.username = "";
		this.password = "";
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "DatosConexion [server=" + server + ", database=" + database + ", username=" + username + ", password="
				+ password + "]";
	}

	
	
}
