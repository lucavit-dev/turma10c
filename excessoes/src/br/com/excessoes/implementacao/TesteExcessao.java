package br.com.excessoes.implementacao;

import javax.swing.JOptionPane;

public class TesteExcessao {

	public static void main(String[] args) {
		// Excessoes: n�o s�o controladas pelo programador
		// Existem dois tipos: 
		// A-) Checked: o Java verifica e nao deixa executar o c�digo
		// B-) Unchecked: s� ocorre ap�s a compila��o.
		try {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
			System.out.println("Resultado = " + (numero*10));

			String email=null;
			System.out.println("Usu�rio: " + email.substring(0, email.indexOf("@")));

		}catch (NullPointerException e) {
			System.out.println("E-mail vazio");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Coordenada inv�lida");
		}catch (NumberFormatException e) {
			System.out.println("N�mero inv�lido");
		}catch (Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
			//printa o erro de excess�o
		} finally {
			System.out.println("At� logo");
		}







	}

}
