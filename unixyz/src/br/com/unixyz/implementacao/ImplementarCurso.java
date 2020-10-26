package br.com.unixyz.implementacao;

import javax.swing.JOptionPane;

import br.com.unixyz.modelo.Curso;

public class ImplementarCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso ();
		
		curso.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
		curso.setDescricao(JOptionPane.showInputDialog("Descrição"));
		curso.setValor(Float.parseFloat(JOptionPane.showInputDialog("Valor")));
		curso.setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Carga Horária")));
		
		System.out.println("ID: " + curso.getId());
		System.out.println("DESCRIÇÃO: " + curso.getDescricao());
		System.out.println("Valor: " + curso.getValor());
		System.out.println("Carga Horária: " + curso.getCargaHoraria());
		
		
		
		
		
		
		
		

	}

}
