package br.udesc.excecoes;

public  abstract class MinhaExcecoes extends RuntimeException {
	
	private int codigo;
	private String mensagem;
	public MinhaExcecoes(int codigo, String mensagem) {
		super();
		this.codigo = codigo;
		this.mensagem = mensagem;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getMensagem() {
		return mensagem;
	}


}
