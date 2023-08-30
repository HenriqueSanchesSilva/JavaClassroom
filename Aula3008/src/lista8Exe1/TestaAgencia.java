package lista8Exe1;

import java.util.Scanner;

public class TestaAgencia {

	public static void main(String[] args) {
		Agencia bancoAgencia = new Agencia();
		Scanner readScanner = new Scanner(System.in);
		
		System.out.println("Digite o numero da agencia:");
		bancoAgencia.numAgencia = readScanner.next();
		System.out.println("Digite o codigo da agencia:");
		bancoAgencia.codAgencia = readScanner.nextInt();
		
		bancoAgencia.imprimiValores();
		
	}

}
