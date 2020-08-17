package br.udesc.webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("")
public class DisciplinaWS {
	
	@GET
	public String info (){
		return"Apraricio e Luciano";
	}

}
