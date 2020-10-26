package br.com.concessionaria.modelo;

public class Formula1 {
	private String cor;
	private String escuderia;
	private boolean status;
	private float velocidadeAtual;
	private float valor;
	private float acelerar=0;
	private float desacelerar=0;

	//criando metodo
	//sintaxe para os m�todos
	// <modificador>> <tipo do Retorno> <nomeMetodo> (<TipoParametro>) <nomeParametro>)


	public void preencherEscuderia(String pEscuderia) {
		escuderia=pEscuderia.toUpperCase();
	}
	public String retornarEscuderia() {
		return escuderia;
	}
	public void preencherCor(String pCor) {
		cor=pCor.toUpperCase();
	}
	public String retornaCor() {
		return cor;
	}
	public void preencherValor(float pValor) {
		valor=pValor;
	}
	public float retornaValor() {
		return valor;
	}
	public String ligar() {
		status=true;
		return "Carro ligado!";
	}

	public String desligar() {
		status=false;
		return "Carro desligado!";


	}
	public void acelerar(float pVelocidade) {
		if (status==true)
			velocidadeAtual+=pVelocidade;
	}

	public void desacelerar (float pVelocidade) {
		if(status==true)
			velocidadeAtual-=pVelocidade;
		if(velocidadeAtual<0) {
			velocidadeAtual=pVelocidade;
		}
	}
	public float retornarVelocidadeAtual() {			
		return velocidadeAtual;
	}





}//fechar classe