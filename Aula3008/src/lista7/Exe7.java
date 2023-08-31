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
				comp[i] = Character.toLowerCase(palavra.charAt(i));
			}else if(letra >= 'a' && letra <= 'z'){
				comp[i] = Character.toUpperCase(palavra.charAt(i));
			}
			
		}
		palavra = String.valueOf(comp);
		System.out.println("Resultado >>" +palavra);
	}

}
