package br.com.fuctura.eu;

import br.com.fuctura.Pessoa;

public class Loja {
	private String nomeLoja;
	private int quantidade;
	private Pessoa proprietarioLoja;
	
	public Loja (String nomeLoja, int quantidade, Pessoa proprietarioLoja) {
		this.nomeLoja = nomeLoja;
		this.quantidade = quantidade;
		this.proprietarioLoja = proprietarioLoja;
	}

	
	public String getNomeLoja() {
		return nomeLoja;
	}


	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public Pessoa getProprietarioLoja() {
		return proprietarioLoja;
	}


	public void setProprietarioLoja(Pessoa proprietarioLoja) {
		this.proprietarioLoja = proprietarioLoja;
	}


	@Override
	public String toString() {
		return "[nomeLoja=" + nomeLoja + ", quantidade=" + quantidade + ", proprietarioLoja=" + proprietarioLoja
				+ "]";
	}
	
}
