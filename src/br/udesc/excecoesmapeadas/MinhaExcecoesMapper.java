package br.udesc.excecoesmapeadas;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import br.udesc.excecoes.MinhaExcecoes;

@Provider
public class MinhaExcecoesMapper implements ExceptionMapper<MinhaExcecoes> {

	@Override
	public Response toResponse(MinhaExcecoes ex) {
		return Response.status(ex.getCodigo()).entity(ex.getMensagem()).build();
	}

}
