package br.udesc.webservices;


import javax.ws.rs.GET;

import javax.ws.rs.Produces;



public class Inicio {
	
	@GET
	@Produces("application/json")
	public String get() {
		return "Aparicio e Luciano";
	}

}
