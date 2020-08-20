package br.udesc.webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.udesc.dao.ProfessoresDao;
import br.udesc.modelo.Professores;

@Path("professores")
public class ProfessoresWs {
	
	private ProfessoresDao dao = new ProfessoresDao();
	
	@GET
	@Path("listar")
	@Produces("application/json")
	public Response getProfessores() {
		return Response.ok(dao.listar()).build();
	}

}
