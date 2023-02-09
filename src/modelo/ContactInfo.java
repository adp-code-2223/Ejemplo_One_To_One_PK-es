package modelo;
// Generated 9 feb 2023 11:38:30 by Hibernate Tools 5.6.14.Final

/**
 * ContactInfo generated by hbm2java
 */
public class ContactInfo implements java.io.Serializable {

	private Integer id;
	private Profesor profesor;
	private String email;
	private String tlfMovil;

	public ContactInfo() {
	}

	public ContactInfo(Profesor profesor, String email) {
		this.profesor = profesor;
		this.email = email;
	}

	public ContactInfo(Profesor profesor, String email, String tlfMovil) {
		this.profesor = profesor;
		this.email = email;
		this.tlfMovil = tlfMovil;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Profesor getProfesor() {
		return this.profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTlfMovil() {
		return this.tlfMovil;
	}

	public void setTlfMovil(String tlfMovil) {
		this.tlfMovil = tlfMovil;
	}

	@Override
	public String toString() {
		return "ContactInfo [id=" + id + ", profesor.id=" + profesor.getId() + ", email=" + email + ", tlfMovil=" + tlfMovil + "]";
	}
	
	

}
