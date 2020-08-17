package br.udesc.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alunos")
public class Alunos implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cd_aluno")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "ds_email")
	private String email;
	
	@Column(name = "ds_aluno")
	private String nome;
	
	public Alunos() {
	
	}
	
	public Alunos(String email, String nome) {
		super();
		this.email = email;
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
    
	
}
