package br.udesc.webservices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.json.JSONException;
import org.json.JSONObject;

import br.udesc.dao.AvaliacaoDao;
import br.udesc.dao.DisciplinaDao;
import br.udesc.dao.DisciplinaProfessorDao;
import br.udesc.dao.FrequenciaDao;
import br.udesc.dao.ProfessoresDao;
import br.udesc.modelo.Avaliacoes;
import br.udesc.modelo.Disciplina;
import br.udesc.modelo.DisciplinaProfessores;
import br.udesc.modelo.Frequencia;
import br.udesc.modelo.Professores;

@Path("cronograma")
public class FrequenciaWS {
	private AvaliacaoDao daoA = new AvaliacaoDao();
	private DisciplinaDao daoD = new DisciplinaDao();
	private ProfessoresDao daoP = new ProfessoresDao();
	private DisciplinaProfessorDao daoDp = new DisciplinaProfessorDao();
	private FrequenciaDao daoF = new FrequenciaDao();

	@GET
	@Path("listar")
	@Produces("application/json")
	public List<Frequencia> getAvaliacoes() {
		return daoF.listar();
	}

	@POST
	@Consumes("application/json")
	public void getFrequencia(String json) throws JSONException, ParseException {

		JSONObject jsonn = new JSONObject(json);

		
		Frequencia f = new Frequencia();
		Disciplina d = daoD.getId(jsonn.getInt("idDisciplina"));
		Professores p = daoP.getId(jsonn.getInt("idProfessor"));
		DisciplinaProfessores dp = daoDp.getId(jsonn.getInt("idTurma"));

		f.setDisciplina(d);
		f.setProfessores(p);
		f.setDisciplinaProfessores(dp);
		f.setNr_qtasaulas(jsonn.getInt("qtasaulas"));
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		Date data = formato.parse(jsonn.get("data").toString());
		f.setData(data);
	
		daoF.salvar(f);

	}
}
