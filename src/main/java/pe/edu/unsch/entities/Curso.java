package pe.edu.unsch.entities;
// Generated 05-jul-2019 15:27:14 by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Curso generated by hbm2java
 */
@Entity
@Table(name = "curso", catalog = "cargabd")
public class Curso implements java.io.Serializable {

	private int idcurso;
	private String nombre;
	private String sigla;
	private short horas;

	public Curso() {
	}

	public Curso(int idcurso, String nombre, String sigla, short horas) {
		this.idcurso = idcurso;
		this.nombre = nombre;
		this.sigla = sigla;
		this.horas = horas;
	}

	@Id

	@Column(name = "idcurso", unique = true, nullable = false)
	public int getIdcurso() {
		return this.idcurso;
	}

	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}

	@Column(name = "nombre", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "sigla", nullable = false, length = 10)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "horas", nullable = false)
	public short getHoras() {
		return this.horas;
	}

	public void setHoras(short horas) {
		this.horas = horas;
	}

}
