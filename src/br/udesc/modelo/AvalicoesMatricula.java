package br.udesc.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "avaliacoes_maricula")
public class AvalicoesMatricula implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ds_avaliacao_matricula")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "cd_alunos")
	private Alunos alunos;
	
	@Column(name = "cd_disciplina")
	private Disciplina disciplina;
	
	@Column(name = "cd_professores")
	private Professores professores;
	
	@Column(name = "ds_semestre")
	private DisciplinaProfessores disciplinaProfessores;
	
	@Column(name = "ds_avaliacao")
	private Avaliacoes avaliacoes;
	
	@Column(name = "nr_nota")
	private double numNota;
	
	public AvalicoesMatricula() {
		
	}

	public AvalicoesMatricula(Alunos alunos, Disciplina disciplina, Professores professores,
			DisciplinaProfessores disciplinaProfessores, Avaliacoes avaliacoes, double numNota) {
		super();
		this.alunos = alunos;
		this.disciplina = disciplina;
		this.professores = professores;
		this.disciplinaProfessores = disciplinaProfessores;
		this.avaliacoes = avaliacoes;
		this.numNota = numNota;
	}

	public Alunos getAlunos() {
		return alunos;
	}

	public void setAlunos(Alunos alunos) {
		this.alunos = alunos;
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

	public Avaliacoes getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(Avaliacoes avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public double getNumNota() {
		return numNota;
	}

	public void setNumNota(double numNota) {
		this.numNota = numNota;
	}
	
	

}
