package lista8Exe2;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente individuo = new Cliente();
		Scanner readScanner = new Scanner(System.in);
		
		System.out.println("Digite o nome do(a) cliente:");
		individuo.nomeCliente = readScanner.next();
		System.out.println("Digite o cpf do(a) cliente:");
		individuo.cpfCliente = readScanner.next();
		
		individuo.imprimiValores();
	}

}
