package br.udesc.webservices;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import br.udesc.dao.AvaliacaoDao;
import br.udesc.dao.DisciplinaDao;
import br.udesc.dao.DisciplinaProfessorDao;
import br.udesc.dao.ProfessoresDao;
import br.udesc.modelo.Avaliacoes;
import br.udesc.modelo.Disciplina;
import br.udesc.modelo.DisciplinaProfessores;
import br.udesc.modelo.Professores;

@Path("avaliacao")
public class AvaliacaoWs {

	private AvaliacaoDao daoA = new AvaliacaoDao();
	private DisciplinaDao daoD = new DisciplinaDao();
	private ProfessoresDao daoP = new ProfessoresDao();
	private DisciplinaProfessorDao daoDp = new DisciplinaProfessorDao();

	@GET
	@Path("listar")
	@Produces("application/json")
	public Response getAvaliacoes() {
		return Response.ok(daoA.listar()).build();
	}

	@POST
	@Consumes("application/json")
	@RolesAllowed("registrar_avaliacao")
	public Response getAvaliacoes(String json) {

		try {

			JSONObject jsonn = new JSONObject(json);

			System.out.println(jsonn.getInt("idProfessor"));
			Avaliacoes a = new Avaliacoes();
			Disciplina d = daoD.getId(jsonn.getInt("idDisciplina"));
			Professores p = daoP.getId(jsonn.getInt("idProfessor"));
			DisciplinaProfessores dp = daoDp.getId(jsonn.getInt("idTurma"));

			a.setDisciplina(d);
			a.setProfessores(p);
			a.setDisciplinaProfessores(dp);
			a.setPeso(jsonn.getDouble("peso"));
			;

			return Response.ok(daoA.salvar(a)).build();

		} catch (Exception  ex) {
			throw new RuntimeException(ex);
		}

	}

}
