package aula0609;

public class Principal {

	public static void main(String[] args) {
		Computador c = new Computador();
		
		c.setCor("vermelho");
		System.out.println(c.getCor());
		
		c.setMarca("HP");
		System.out.println(c.getMarca());
		
		
		c.imprimiDados();
		
	}

}
