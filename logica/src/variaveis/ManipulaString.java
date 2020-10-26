package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "vitor.vieira@itau-unibanco.com.br";
		System.out.println("Original: " + email);
		System.out.println("Miniscula: " + email.toLowerCase());
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Qntde de caracteres: " + email.length());
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Exibir do 2� ao 4� caracter: " + email.substring(0,6));
		System.out.println("Do 3� caracter em diante: " + email.substring(4,9));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		// Exibir o usuario antes do @
		System.out.println("Exibir o usuario antes do @: " + email.substring(0, email.indexOf("@")));
		// Exibir o usuario depois do @
		System.out.println("Exibir o usuario antes do @: " + email.substring(email.indexOf("@") + 1));
		//primeiro caracter 
		System.out.println("Primeiro caracter: " + email.charAt(4));
		System.out.println("Comparando com ==: " + (email=="humn.vieira@itau-unibanco.com.br"));
		System.out.println("Compara��o: " + email.contentEquals("vitor.vieira@itau-unibanco.com.br"));
	}
}
