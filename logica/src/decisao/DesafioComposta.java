package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		/* Pe�a a entrada de veiculo, capacidade de passageiros
		 * Exiba a mensagem:
		 * "Veiculo Categoria A", se a qtde passageiros for igual a 2
		 * "Veiculo Categoria B", se a qtde passageiros estiver entre 4 e 7
		 * "Veiculo Categoria C", se a qtde passageiros for maior que 7
		 */

		String veiculo = JOptionPane.showInputDialog("Digite a categoria do Veiculo: ").toUpperCase();
		byte passageiro = Byte.parseByte(JOptionPane.showInputDialog("Informe a quantidade de passageiros: "));

		if (passageiro==2) {
			System.out.println("Veiculo categoria A");
		}else if(passageiro>7){
			System.out.println("Veiculo categoria C");
		}else if (passageiro<=4){
			System.out.println("Veiculo catergoria B");
		}else {
			System.out.println("Categoria desconhecida");
		}

	}

}
