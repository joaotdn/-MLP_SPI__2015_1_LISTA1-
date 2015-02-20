package automovel;

public class Carro {
	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void acelerar() {
		if (this.velocidadeAtual > this.velocidadeMaxima) {
			System.out.println("A velocidade foi excedida");
		}
	}

}
