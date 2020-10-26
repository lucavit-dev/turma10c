package br.com.concessionaria.teste;

import javax.swing.JOptionPane;

import br.com.concessionaria.modelo.Formula1;

public class TesteFormula1 {

	public static void main(String[] args) {

		// criar um objeto (para importar Crtl + sft + O)
		Formula1 objeto = null;

		// Instanciar um objeto
		Formula1 carro = new Formula1();
		carro.preencherEscuderia("BENNETON");
		carro.preencherValor((float) 100.10);
		carro.preencherCor("verMelhA");
		System.out.println(carro.retornarEscuderia());
		System.out.println(carro.retornaValor());
		System.out.println(carro.retornaCor());
		if (JOptionPane.showConfirmDialog(null, "Ligar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0) {
			System.out.println(carro.ligar());
		}else{
			System.out.println(carro.desligar());
		}
		carro.acelerar(50);
		carro.acelerar(30);
		System.out.println(carro.retornarVelocidadeAtual());
		carro.desacelerar(120);
		System.out.println(carro.retornarVelocidadeAtual());
	}






}
