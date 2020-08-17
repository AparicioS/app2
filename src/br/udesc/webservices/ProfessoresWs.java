package br.udesc.webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.udesc.modelo.Professores;

@Path("professores")
public class ProfessoresWs {
	
	@GET
	@Path("listar")
	@Produces("application/json")
	public List<Professores> getProfessores() {
		return null;
	}

}
