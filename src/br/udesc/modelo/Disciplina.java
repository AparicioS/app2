package br.udesc.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name = "disciplina")
@XmlRootElement
public class Disciplina implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cd_disciplina")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "ds_disciplina")
	private String ds_disciplina;
	
	public Disciplina() {
	
	}

	public Disciplina(String ds_disciplina) {
		super();
		this.ds_disciplina = ds_disciplina;
	}

	public String getDs_disciplina() {
		return ds_disciplina;
	}

	public void setDs_disciplina(String ds_disciplina) {
		this.ds_disciplina = ds_disciplina;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

}
