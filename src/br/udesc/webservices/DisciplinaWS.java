package br.udesc.webservices;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;


import br.udesc.dao.DisciplinaDao;
import br.udesc.modelo.Disciplina;


@Path("disciplina")
public class DisciplinaWS {
	

   private DisciplinaDao dao = new DisciplinaDao();
	
	@GET
	@Path("listar")
	@Produces("application/json")
	public Response getDisciplinas() {
		return Response.ok(dao.listar()).build();
	}

}
