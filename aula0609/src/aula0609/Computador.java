package aula0609;

public class Computador {

	String marca;
	String cor;	
	
	public Computador(String marca, String cor) {
		this.marca = marca;
		this.cor = cor;
	}
	
	public Computador() {
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void imprimiDados() {
		System.out.println("Marca >> "+marca);
		System.out.println("Cor >> "+cor);
	}
	
}
