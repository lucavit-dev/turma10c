package decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome: ").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));

		if (idade>17 && idade<70) {
			System.out.println(nome + " voc� � obrigado a votar!");
		}

		if (idade <16) {
			System.out.println (nome + " vc esta proibido a votar este ano");
		}
		if (idade==16 || idade==17 || idade>=70) {
			System.out.println(nome + " seu voto � facultativo");
		}


	}

}
