package br.com.casageral.teste;

import javax.swing.JOptionPane;

import br.com.casageral.modelo.Televisao;

public class TelevisaoTeste {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		
		tv.preencherMarca (JOptionPane.showInputDialog("Digite a marca"));
		tv.preencherValor(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor")));
		tv.ligar();
		tv.aumentarVolume(13);
		tv.mudarCanal(5);
		
		
		
		System.out.println(tv.retornarTudo());

		

		
	}

}