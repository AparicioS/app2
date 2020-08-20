package br.udesc.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.udesc.dao.ProfessoresDao;
import br.udesc.dao.ServicosUsuarioDao;
import br.udesc.modelo.ServicoUsuarioAutorizado;

@Path("servico")
public class ServicoWs {
	
	private ServicosUsuarioDao dao = new ServicosUsuarioDao();
	
	@GET
	@Path("listar")
	@Produces("application/json")
	public Response getProfessores() {
		return Response.ok(dao.listar()).build();
	}

      
}
