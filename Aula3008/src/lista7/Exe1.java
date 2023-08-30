package lista7;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Digite uma frase: ");
		String fra = scanner.nextLine();
		
		String frainvert = inverterFrase(fra);
		System.out.println("Frase Invertida: "+ frainvert);
		
		scanner.close();

	}
	
	public static String inverterFrase(String fra) {
		StringBuilder resul = new StringBuilder();
		for (int i = fra.length() - 1; i >=0 ; i --) {
			resul.append(fra.charAt(i));
		}
		return resul.toString();
	}

}

