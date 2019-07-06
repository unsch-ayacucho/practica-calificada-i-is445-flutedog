package pe.edu.unsch.entities;
// Generated 05-jul-2019 15:27:14 by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Cargacurso generated by hbm2java
 */
@Entity
@Table(name = "cargacurso", catalog = "cargabd")
public class Cargacurso implements java.io.Serializable {

	private int idcargacurso;
	private int idcarga;
	private int idcurso;

	public Cargacurso() {
	}

	public Cargacurso(int idcargacurso, int idcarga, int idcurso) {
		this.idcargacurso = idcargacurso;
		this.idcarga = idcarga;
		this.idcurso = idcurso;
	}

	@Id

	@Column(name = "idcargacurso", unique = true, nullable = false)
	public int getIdcargacurso() {
		return this.idcargacurso;
	}

	public void setIdcargacurso(int idcargacurso) {
		this.idcargacurso = idcargacurso;
	}

	@Column(name = "idcarga", nullable = false)
	public int getIdcarga() {
		return this.idcarga;
	}

	public void setIdcarga(int idcarga) {
		this.idcarga = idcarga;
	}

	@Column(name = "idcurso", nullable = false)
	public int getIdcurso() {
		return this.idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

}
