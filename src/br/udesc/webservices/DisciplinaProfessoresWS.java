package br.udesc.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import br.udesc.modelo.DisciplinaProfessores;

@Path("turma")
public class DisciplinaProfessoresWS {

	@GET
	@Path("listar")
	@Produces("application/json")
	public List<DisciplinaProfessores> getTurma() {
		return null;
	}
	


}
