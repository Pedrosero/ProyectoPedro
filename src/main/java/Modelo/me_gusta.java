package Modelo;

public class me_gusta {
	private int id_u;
	private int id_c;
	
	
	public int getId_u() {
		return id_u;
	}
	public void setId_u(int id_u) {
		this.id_u = id_u;
	}
	public int getId_c() {
		return id_c;
	}
	public void setId_c(int id_c) {
		this.id_c = id_c;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_c;
		result = prime * result + id_u;
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
		me_gusta other = (me_gusta) obj;
		if (id_c != other.id_c)
			return false;
		if (id_u != other.id_u)
			return false;
		return true;
	}
	
	
}
