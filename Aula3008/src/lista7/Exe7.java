package lista7;

import java.util.Scanner;

public class Exe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		String palavra;
		
		System.out.println("Digite sua palavra:");
		palavra = read.next();
		char comp[] = new char[palavra.length()];
		char letra;
		for (int i =0;i<palavra.length();i++) {
			letra = palavra.charAt(i);
			if(letra >= 'A' && letra <= 'Z'){
				letra = palavra.charAt(i);
				comp[i] = letra.toLowerCase();
			}else if(letra >= 'a' && letra <= 'z'){
				comp[i] = palavra.charAt(i);
			}
			
		}
		
		System.out.println("Resultado >>" +palavra);
	}

}
