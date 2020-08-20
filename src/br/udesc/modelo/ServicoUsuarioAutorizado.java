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
@Table(name = "servicousuarioautorizado")
public class ServicoUsuarioAutorizado implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cd_servicousuarioautorizado")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cd_usuario")
	private Usuario usuario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cd_servico")
	private Servico servico;
	
	@Column(name = "tf_autorizado")
	private boolean autorizado;
	
	public ServicoUsuarioAutorizado() {
		
	}
	
	public ServicoUsuarioAutorizado(Usuario usuario, Servico servico, boolean autorizado) {
		super();
		this.usuario = usuario;
		this.servico = servico;
		this.autorizado = autorizado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public boolean isAutorizado() {
		return autorizado;
	}

	public void setAutorizado(boolean autorizado) {
		this.autorizado = autorizado;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	
	
	
}
