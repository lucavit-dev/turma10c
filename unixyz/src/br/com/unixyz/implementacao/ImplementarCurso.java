package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Curso;

public class ImplementarCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso ();
		
		curso.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
		curso.setDescricao(JOptionPane.showInputDialog("Descri��o"));
		curso.setValor(Float.parseFloat(JOptionPane.showInputDialog("Valor")));
		curso.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Carga Hor�ria")));
		
		System.out.println("ID: " + curso.getId());
		System.out.println("DESCRI��O: " + curso.getDescricao());
		System.out.println("Valor: " + curso.getValor());
		System.out.println("Carga Hor�ria: " + curso.getCargaHoraria());
		
		
		
		
		
		
		
		

	}

}
