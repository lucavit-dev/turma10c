package br.com.unixyz.modelo;

public class Professor {

	private int id;
	private String nome;
	private String formacao;
	private Endereco endereco;

	public String getAll() {
		return
				"ID:     : " + id + "\n" +
				"Nome    : " + nome + "\n" +
				"Forma��o: " + formacao + "\n" + "\n" +
				"Endere�o \n" + endereco.getAll();
	}

	public void setAll (int id, String nome, String forma�ao, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.formacao = forma�ao;
		this.endereco = endereco;
	}

	public Professor() {
		super();
	}

	public Professor(int id, String nome, String forma�ao, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.formacao = forma�ao;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getForma�ao() {
		return formacao;
	}
	public void setForma�ao(String forma�ao) {
		this.formacao = forma�ao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



} // classe
