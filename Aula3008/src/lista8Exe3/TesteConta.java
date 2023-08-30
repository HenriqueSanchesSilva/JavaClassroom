package lista8Exe3;

import java.util.Scanner;


public class TesteConta {

	public static void main(String[] args) {
		Conta individuo = new Conta();
		Scanner readScanner = new Scanner(System.in);
		
		System.out.println("Digite o numero da agencia:");
		individuo.numAgencia = readScanner.next();
		System.out.println("Digite o codigo do banco:");
		individuo.codBanco = readScanner.nextInt();
		System.out.println("Digite o numero da conta:");
		individuo.numConta = readScanner.next();
		System.out.println("Digite o nome do titular:");
		individuo.titular = readScanner.next();
		System.out.println("Digite o saldo disponivel:");
		individuo.saldo = readScanner.nextDouble();
		
		individuo.imprimiValores();
	}

}
