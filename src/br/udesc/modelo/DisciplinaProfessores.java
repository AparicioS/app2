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
@Table(name = "disciplina_professores")
public class DisciplinaProfessores implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ds_semestre")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "cd_disciplina")
	private Disciplina disciplina;
	
	@Column(name = "cd_professores")
	private Professores professores;
	
	@Column(name = "nr_vagas")
	private int numVagas;
	
	public DisciplinaProfessores() {
	
	}

	public DisciplinaProfessores(Disciplina disciplina, Professores professores, int numVagas) {
		super();
		this.disciplina = disciplina;
		this.professores = professores;
		this.numVagas = numVagas;
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

	public int getNumVagas() {
		return numVagas;
	}

	public void setNumVagas(int numVagas) {
		this.numVagas = numVagas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
