package com.algaworks.cobranca.model;

public enum StatusPessoa {
	
	ATIVO("Ativo"),
	INATIVO("Inativo");
	
	private String descricao;

	private StatusPessoa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
}
