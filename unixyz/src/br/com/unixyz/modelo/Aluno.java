package br.com.unixyz.modelo;

public class Aluno {

	/* Implementa��o = principal = teste (camada onde tem  main())
	 * modelo = beans -Javabeans = dto = to
	 * 
	 * Design Patterns - S�o todos os padr�es e boas pr�ticas voltados para dev em P.O.O
	 * 
	 * Design Patterns chamado DTO (Data Transfer Object)
	 * - Todo atributo DEVE ser privado.
	 * - Cada atributo DEVE possuir UM m�todo de input (setter) e UM m�todo de output (getter)
	 * - Cada classe DEVE possuir no m�nimo dois construtores (ex: um vazio e o outro cheio (com todos os atributos))
	 */

	private int rm;
	private String nome;
	private String email;	
	
	//construtor vazio
	
	public Aluno() {
		super();
	}
	
	//construtor cheio

	public Aluno(int rm, String nome, String email) {
		// o super � para criar Heran�a, neste caso em especifico nao influencia em existir ou nao.
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}

	public void setAll(int rm, String nome, String email) {
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		
	}

	public String getAll() {
		return 
				"RM     :     " + rm + "\n" +
				"Nome   :     " + nome + "\n" +
				"E-mail :     " + email + "\n";
	}

	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}









} //Classe
