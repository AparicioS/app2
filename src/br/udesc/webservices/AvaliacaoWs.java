package br.udesc.webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.udesc.modelo.Avaliacoes;

@Path("avaliacao")
public class AvaliacaoWs {

	@GET
	@Path("listar")
	@Produces("application/json")
	public List<Avaliacoes> getAvaliacoes() {
		return null;
	}
}
