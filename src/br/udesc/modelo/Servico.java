package br.udesc.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servico")
public class Servico implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "cd_servico")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name = "ds_servico")
	private String nomeServico;
	
	public Servico() {
		
	}

	public Servico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

}
