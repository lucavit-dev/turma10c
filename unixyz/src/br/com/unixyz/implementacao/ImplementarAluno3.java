package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.util.Magica;

public class ImplementarAluno3 {
	
	//Usando construtor cheio, retornando os set ja quando instancia o Objeto.

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno(
				Magica.i("RM"),
				Magica.s("Nome").toUpperCase(),
				Magica.s("E-mail").toLowerCase()		
				);
		
		System.out.println(aluno.getAll());	
		
	}

}//CLASSE
