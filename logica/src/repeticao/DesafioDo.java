package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero a ser advinhado"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o n�mero"));
			contador=contador+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				JOptionPane.showMessageDialog(null, "O n�mero � maior");
			}else if (numero<chute) {
				JOptionPane.showMessageDialog(null, "O n�mero � menor");
			}
		}while(numero!=chute);
		System.out.println("Parab�ns voc� acertou com " + contador + " tentativa(s).");
		

		
		/*int player1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1, digite um numero"));
		int player2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2, tente adivinhar o numero do Jog 1"));
		int total = 0;
		
		while (player2<player1 || player2>player1) {
			player2 = Integer.parseInt(JOptionPane.showInputDialog("o Numero esta errado"));
			
		}
		*/
		
		
	}

}
