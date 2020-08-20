package br.udesc.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import br.udesc.dao.DisciplinaDao;
import br.udesc.dao.DisciplinaProfessorDao;
import br.udesc.dao.ProfessoresDao;
import br.udesc.excecoes.ObjetoInexistente;
import br.udesc.modelo.Avaliacoes;
import br.udesc.modelo.Disciplina;
import br.udesc.modelo.DisciplinaProfessores;
import br.udesc.modelo.Professores;

@Path("turma")
public class DisciplinaProfessoresWS {

	private DisciplinaProfessorDao daoDp = new DisciplinaProfessorDao();
	private DisciplinaDao daoD = new DisciplinaDao();
	private ProfessoresDao daoP = new ProfessoresDao();

	@GET
	@Path("listar")
	@Produces("application/json")
	public Response getTurma() {
		return Response.ok(daoDp.listar()).build();
	}

	@POST
	@Consumes("application/json")
	public Response getTurma(String json) throws JSONException , ObjetoInexistente {

		try {

			JSONObject jsonn = new JSONObject(json);

			System.out.println(jsonn.getInt("idProfessor"));
			DisciplinaProfessores dp = new DisciplinaProfessores();
			Disciplina d = daoD.getId(jsonn.getInt("idDisciplina"));
			Professores p = daoP.getId(jsonn.getInt("idProfessor"));

			dp.setDisciplina(d);
			dp.setProfessores(p);
			dp.setNumVagas(jsonn.getInt("nrVaga"));

			return Response.ok(daoDp.salvar(dp)).build();

		} catch (ObjetoInexistente ex) {
			throw new RuntimeException(ex);
		}

	}

}
