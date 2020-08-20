package br.udesc.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "avaliacao")
public class Avaliacoes implements Serializable{

 private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ds_avaliacao")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "cd_disciplina")
	private Disciplina disciplina;
	
	@Column(name = "cd_professores")
	private Professores professores;
	
	@Column(name = "ds_semestre")
	private DisciplinaProfessores disciplinaProfessores;
	
	@Column(name = "nr_peso")
	private double peso; 
	
	public Avaliacoes() {
		
	}

	public Avaliacoes(Disciplina disciplina, Professores professores, DisciplinaProfessores disciplinaProfessores,
			double peso) {
		super();
		this.disciplina = disciplina;
		this.professores = professores;
		this.disciplinaProfessores = disciplinaProfessores;
		this.peso = peso;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professores getProfessores() {
		return professores;
	}

	public void setProfessores(Professores professores) {
		this.professores = professores;
	}

	public DisciplinaProfessores getDisciplinaProfessores() {
		return disciplinaProfessores;
	}

	public void setDisciplinaProfessores(DisciplinaProfessores disciplinaProfessores) {
		this.disciplinaProfessores = disciplinaProfessores;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
