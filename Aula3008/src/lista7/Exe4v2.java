package lista7;

import java.util.Scanner;

public class Exe4v2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String numero;
		int a,b,c,d;
		int compara;
		
		System.out.println("Digite sua senha criptografada:");
		numero = read.next();
		a = Integer.parseInt(numero.substring(0,1))-1;
		b = Integer.parseInt(numero.substring(1,2))-1;
		c = Integer.parseInt(numero.substring(2,3))-1;
		d = Integer.parseInt(numero.substring(3,4))-1;
		
		compara = a;
		a=c;
		c=compara;
		
		compara = b;
		b=d;
		d=compara;
		
		
		
		
		System.out.println("Resultado >> "+a+b+c+d);
	}

}
