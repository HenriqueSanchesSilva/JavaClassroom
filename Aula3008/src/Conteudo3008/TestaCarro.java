package Conteudo3008;

import java.util.Scanner;

public class TestaCarro {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Scanner readScanner = new Scanner(System.in);
		
		System.out.println("Digite a marca:");
		carro.marca = readScanner.next();
		System.out.println("Digite o modelo:");
		carro.modelo =readScanner.next();
		System.out.println("Digite a placa:");
		carro.placa = readScanner.next();
		
		
		carro.imprimiDados();

	}

}
