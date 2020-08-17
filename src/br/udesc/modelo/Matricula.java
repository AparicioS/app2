package br.udesc.modelo;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_matricula")
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
	
	@Column(name = "dt_trancamento")
	private LocalDate dtTrancamento;
	
	@Column(name = "ds_status")
	private String status;
	
	@Column(name = "nr_mediasemestral")
	private double mediasemestral;
	
	@Column(name = "nr_notaexame")
	private double notaexame;
	
	public Matricula() {
	
	}

	public Matricula(Alunos alunos, Disciplina disciplina, Professores professores,
			DisciplinaProfessores disciplinaProfessores) {
		super();
		this.alunos = alunos;
		this.disciplina = disciplina;
		this.professores = professores;
		this.disciplinaProfessores = disciplinaProfessores;
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
	
}
