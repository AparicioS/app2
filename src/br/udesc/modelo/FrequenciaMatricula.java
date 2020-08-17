package br.udesc.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "frequancia_matricula")
public class FrequenciaMatricula implements Serializable {
	
    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "frequancia_matricula")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "cd_disciplina")
	private Disciplina disciplina;
	
	@Column(name = "cd_professores")
	private Professores professores;
	
	@Column(name = "ds_semestre")
	private DisciplinaProfessores disciplinaProfessores;
	
	@Column(name = "cd_alunos")
	private Alunos alunos;
	
	@Column(name = "dt_data")
	private Frequencia frequencia;
	
	@Column(name = "nr_presente")
	private int numPresente;
	
	public FrequenciaMatricula() {
		
	}

	public FrequenciaMatricula(Disciplina disciplina, Professores professores,
			DisciplinaProfessores disciplinaProfessores, Alunos alunos, Frequencia frequencia, int numPresente) {
		super();
		this.disciplina = disciplina;
		this.professores = professores;
		this.disciplinaProfessores = disciplinaProfessores;
		this.alunos = alunos;
		this.frequencia = frequencia;
		this.numPresente = numPresente;
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

	public Alunos getAlunos() {
		return alunos;
	}

	public void setAlunos(Alunos alunos) {
		this.alunos = alunos;
	}

	public Frequencia getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(Frequencia frequencia) {
		this.frequencia = frequencia;
	}

	public int getNumPresente() {
		return numPresente;
	}

	public void setNumPresente(int numPresente) {
		this.numPresente = numPresente;
	}
	
}
