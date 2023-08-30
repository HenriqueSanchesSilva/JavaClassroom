package lista7;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		String palavra;
		
		System.out.print("Digite uma Palavra: ");
		palavra=leitor.next();
		
		System.out.println("Dia >> " + palavra.substring(0,2));
		System.out.println("Mes >> " + palavra.substring(3,5));
		System.out.println("Ano >> " + palavra.substring(6,10));
	}

}
