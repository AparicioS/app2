package br.udesc.excecoes;

public class RegistroNaoEncontrado extends MinhaExcecoes {
	
	public RegistroNaoEncontrado() {
		super(400,"Registro não encontrado");
	}
	
	public RegistroNaoEncontrado(String nome) {
		super(400,("Não existe "+ nome + "cadastrado(a)"));
	}

}
