package variaveis;

import javax.swing.JOptionPane;

public class Variavel {

	public static void main(String[] args) {
		/*
		 * Tipos de Dados=>
		 * Alfanum�rico(String): � o dado que n�o deve ser utilizado em opera��es aritm�ticas.
		 * Exemplo: CEP (dentro do contexto de que n�o seja uma busca chave dentro da aplica��o)
		 * Neste variavel se usa aspas
		 * 
		 * 
		 * Num�rico: � o dado que pode ser utilizado em opera��es aritm�ticas e/ou ele � um dado
		 * chave de busca dentro da aplica��o
		 * Exemplo: CEP (dentro do contexto de seja uma busca chave dentro da aplica��o).
		 * => int 	 => para n�meros inteiros
		 * => double => para n�meros reais (com casas decimais).
		 * 
		 * Nesta variavel nao se usa aspas
		 *  
		 */

		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
		double imc = peso / (altura*altura);
		System.out.println("Usu�rio: " + nome);
		System.out.println("Idade  : " + idade);
		System.out.printf("Imc    : %.2f\n", imc);
		System.out.printf("Sr(a) %s, voc� tem %d anos de idade. Seu IMC � %.2f\n", nome,idade,imc);
		/*
		 * Existem 3 tipos de "print"
		 * print=> exibe tudo na mesma linha
		 * println=> quebra a linha
		 * printf=> exibe o numero real (%f=> numeros reais) // %s=> Strings // %d=> inteiros
		 * //System.out.printf("Sr(a) %s, voc� tem %d anos de idade. Seu IMC � %.2f\n",
		//		nome,idade,imc);
		 */


	}

}
