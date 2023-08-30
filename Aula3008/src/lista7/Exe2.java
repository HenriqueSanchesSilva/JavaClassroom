package lista7;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite uma Palavra: ");
		String pa = scanner.nextLine();
		
		efeito(pa);
		
		scanner.close();

	}
	
	public static void efeito (String palavra) {
		for (int i = 0;i< palavra.length()* 2 - 1;i++) {
			int lim = i < palavra.length() ? i : palavra.length() * 2 - 2 - i;
			for (int j = 0; j <= lim; j++) {
				System.out.print(palavra.charAt(j));
			}
			System.out.println();
		}
		
		
	}

}