package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.util.Magica;

public class ImplementarProfessor {
	
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int i (String msg) {
		return Integer.parseInt(s(msg));
	}

	public static void main(String[] args) {		
		Professor professor = new Professor ();
		Endereco endereco = new Endereco();
		
		professor.setId(Magica.i("ID"));
		professor.setNome(Magica.s("Nome"));
		professor.setForma�ao(Magica.s("Forma��o"));
		
		//Muito IMPORTANTE		
		professor.setEndereco(endereco);
		// NUNCA ESQUECER DE ATRIBUIR O OBJETO
		
		endereco.setLogradouro(Magica.s("Logradouro"));
		endereco.setNumero(Magica.s("Numero"));
		endereco.setBairro(Magica.s("Bairro"));
		endereco.setCidade(Magica.s("Cidade"));
		endereco.setEstado(Magica.s("Estado"));
		endereco.setComplemento(Magica.s("Comlemento"));
		endereco.setCep(Magica.s("CEP"));			
		
		System.out.println(professor.getAll());	
		System.out.println(professor.getEndereco().getCidade());
	}

}//classe
