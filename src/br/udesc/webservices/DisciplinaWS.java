package br.udesc.webservices;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.google.gson.Gson;

import br.udesc.dao.Dao;
import br.udesc.dao.DisciplinaDao;
import br.udesc.modelo.Disciplina;


@Path("disciplina")
public class DisciplinaWS {
	

	private Dao<Disciplina> dao = new Dao<Disciplina>();
	
	@GET
	@Path("listar")
	@Produces("application/json")
	public List<Disciplina> getDisciplinas() {
		return null;
	}
	
	@POST
	@Consumes("application/json")
	public void setDisciplina(String discliplina) {
		Gson g = new Gson();
		Disciplina dis = g.fromJson(discliplina, Disciplina.class);
		 dao.salvar(dis);
	}
	
	

}
