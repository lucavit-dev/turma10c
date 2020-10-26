package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * (F�cil)
		1�) Crie um programa que pergunte ao usu�rio o seu n�vel de escolaridade (M�dio, Superior ou P�s) 
		enquanto a resposta for v�lida, ir� computando os totais dos n�veis digitados, 
		no final apresente somente o n�vel que foi mais votado.

		(Complicadinho)
		2�) Monte um programa que solicite a idade e o nome das pessoas. Ao terminar, (quando o usu�rio responder "SIM", que ele quer terminar) o programa dever� exibir:
		 *** a pessoa mais velha (nome e idade), 
		 **** a pessoa mais nova, 
		 * a quantidade de pessoas maiores de idade e 
		 ** a m�dia entre as idades que foram digitadas.
		 */
		
		
		String nome="";
		short idade=0;
		int contMaiorIdade=0;
		int qtdePessoas=0;
		int totalIdades=0;
		String pessoaMaisExperiente="";
		int idadeMaisExperiente=0;
		String pessoaMaisJovem="";
		int idadeMaisJovem=0;
		do {
			nome = JOptionPane.showInputDialog("Digite o nome");
			idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade"));
			if (idade>=18) {
				contMaiorIdade++;
			}
			totalIdades+=idade; // totalIdades = totalIdades + idade;
			qtdePessoas++;
			if(idade>idadeMaisExperiente) {
				idadeMaisExperiente=idade;
				pessoaMaisExperiente=nome;
			}
			
			if (idade<idadeMaisJovem || qtdePessoas==1) {
				idadeMaisJovem=idade;
				pessoaMaisJovem=nome;
			}
		}while(JOptionPane.showConfirmDialog(
				null, // posi��o inicial da janela (centralizada em relacao ao monitor)
				"Deseja Continuar?", //Mensagem principal (que fica no centro da janela)
				"Pergunta", // mensagem que aparece no barra de t�tulo da janela
				JOptionPane.YES_NO_OPTION // configura��o dos bot�es da Janela (Yes==0// No==1)
				)==0);
		System.out.println("Total de pessoas maiores de idade: " + contMaiorIdade);
		System.out.println("M�dia de idades: " + (totalIdades/qtdePessoas));
		System.out.println("Mais experiente: " + pessoaMaisExperiente);
		System.out.println("Idade da mais experiente: " + idadeMaisExperiente);
		System.out.println("Mais Jovem: " + pessoaMaisJovem);
		System.out.println("Idade da mais jovem: " + idadeMaisJovem);		

	}
}




