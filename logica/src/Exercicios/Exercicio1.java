package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * 	Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
			A taxa de servi�os � de: 
			R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; 
			R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15; 
			R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
			Monte uma aplica��o que apresente a conta do cliente.
		 */


		short diarias= Short.parseShort(JOptionPane.showInputDialog("qnt de diarias: "));
		double valorDiaria=0;
		if (diarias>15) {
			valorDiaria = 85.5;
		}else if (diarias==15) {
			valorDiaria = 86;
		}else {
			valorDiaria = 88;
		}
		System.out.println("Total: " + (valorDiaria*diarias));

		/*
		 * double taxa1 = 5.50;
		 *double taxa2 = 6.00;
		 *double taxa3 = 8.00;
		 *float dias = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de dias: "));
		 *double total;
		 *if (dias==15) {
		 *System.out.println("Valor total: " + total (total(15*taxa2));
		 */	
	}

}
