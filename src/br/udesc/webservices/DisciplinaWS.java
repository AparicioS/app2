package br.udesc.webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.udesc.modelo.Disciplina;
import br.udesc.modelo.DisciplinaProfessores;

@Path("disciplina")
public class DisciplinaWS {
	
	@GET
	@Path("listar")
	@Produces("application/json")
	public List<Disciplina> getDisciplinas() {
		return null;
	}

}
