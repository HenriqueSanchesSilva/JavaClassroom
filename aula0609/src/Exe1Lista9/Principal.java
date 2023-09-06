package Exe1Lista9;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Conta c = new Conta(9000.0, "120","Henrique","98980",45);
		
		System.out.println("--------------------------------");
		System.out.println("Nome do titular >> "+c.getTitular());
		System.out.println("Numero da agencia >> "+c.getNrAgencia());
		System.out.println("Numero da conta >> "+c.getNrConta());
		System.out.println("Codigo do banco >> "+c.getCodBanco());
		System.out.println("Saldo disponivel >> "+c.getSaldo());
		System.out.println("--------------------------------");
		
		System.out.println("Digite o valor que voce deseja sacar:");
		c.saque(in.nextDouble());
	}

}
