package lista7;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {

		Scanner readScanner = new Scanner(System.in);
		int numero, fatorial=0;
		
		System.out.println("Digite seu numero:");
		numero = readScanner.nextInt();
		fatorial=numero;
		if(numero > 0) {
			for(int i= numero-1;i>0;i--) {
				fatorial *= i;
			}
		}else {
			fatorial=1;
		}
		
		System.out.println(fatorial);
	}
}

	
		

