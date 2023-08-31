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
			System.out.print(numero+"! = "+numero);
			for(int i= numero-1;i>0;i--) {
				fatorial *= i;
				System.out.print("."+i);
			}
			System.out.println(", oque da "+fatorial);
		}else {
			fatorial=1;
			System.out.println("Para 0! o resultado e 1");
		}
		
	}
}

	
		

