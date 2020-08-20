package br.udesc.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professores")
public class Professores implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cd_professor")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "ds_professor")
	private String nomeProfessor;
	
	@Column(name = "ds_titulo")
	private String titulo;
	
	public Professores() {
	
	}
	
	public Professores(String nomeProfessor, String titulo) {
		super();
		this.nomeProfessor = nomeProfessor;
		this.titulo = titulo;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
