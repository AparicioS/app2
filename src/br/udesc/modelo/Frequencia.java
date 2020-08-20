package br.udesc.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "frequencia")
public class Frequencia implements Serializable {
	
 private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_frequencia")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "cd_disciplina")
	private Disciplina disciplina;
	
	@Column(name = "cd_professores")
	private Professores professores;
	
	@Column(name = "ds_semestre")
	private DisciplinaProfessores disciplinaProfessores;
	
	@Column(name = "dt_date")
	private Date data;
	
	@Column(name = "nr_qtasaulas")
	private int nr_qtasaulas;
	
	public Frequencia() {
		
	}



	public Frequencia(Disciplina disciplina, Professores professores, DisciplinaProfessores disciplinaProfessores,
			Date data, int nr_qtasaulas) {
		super();
		this.disciplina = disciplina;
		this.professores = professores;
		this.disciplinaProfessores = disciplinaProfessores;
		this.data = data;
		this.nr_qtasaulas = nr_qtasaulas;
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}



	public int getNr_qtasaulas() {
		return nr_qtasaulas;
	}

	public void setNr_qtasaulas(int nr_qtasaulas) {
		this.nr_qtasaulas = nr_qtasaulas;
	}
	
}
