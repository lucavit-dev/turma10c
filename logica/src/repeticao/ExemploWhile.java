package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite seu email").toLowerCase();
		while (email.indexOf("@")==-1){
			email=JOptionPane.showInputDialog("email dever conter o @").toLowerCase();
		}
		System.out.println(email);
		
		String nome = JOptionPane.showInputDialog("nome").toUpperCase();

		while (nome.length()<5 || nome.length()>20) {
			nome = JOptionPane.showInputDialog("Digite um nome entre 2 e 20 caracteres").toUpperCase();
		}
		System.out.println(nome);
		
		

	}

}
