package br.com.unixyz.modelo;

import br.com.unixyz.padroes.PadraoFormacao;

public class Formacao implements PadraoFormacao{

	private String descricao;
	private int duracao;
	private float mensalidade;
	
	
	
	public Formacao(String descricao, int duracao, float mensalidade) {
		super();
		this.descricao = descricao;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}


	public void calcMensalidade (double fator) {} // para ateder os metodos que estao nas subclasses
	

	public Formacao() {
		super();
	}
	public float retornarMedia(float n1, float n2) {
		return n1*(float)0.5 +n2*(float)0.5;
	}
	public float retornarMedia (float n1, float n2, float proj1, float proj2) {
		return n1*(float)0.4 +n2*(float)0.4 + proj1*(float)0.1 + proj2*(float)0.1;				
	}
	
	public String getAll() {
		return
				"Descri��o        : " + descricao + "\n" +
				"Dura��o          : " + duracao + "\n" +
				"Valor Mensalidade: " + mensalidade;
	}

	public void setAll(String descricao, int duracao, float mensalidade) {		
		this.descricao = descricao;
		this.duracao = duracao;
		this.mensalidade = mensalidade;

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}






} //Classe