package lista7;

import java.util.Scanner;

public class Exe9 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		        
		String contrario = "";
		        
		System.out.print("Digite uma palavra para verificar se e um palindromo: ");
		String nome = ent.nextLine();
		
		ent.close();

		        
		for (int i = (nome.length() -1); i >= 0; i--) {
		   contrario = contrario + nome.charAt(i);
		}
		        
		        
		if (contrario.toLowerCase().equals(nome.toLowerCase())) {
		   System.out.println("Essa palavra e Palindromo!!");
		} else {
		   System.out.println("Essa palavra nao e Palindromo!!");
		}
	}
}