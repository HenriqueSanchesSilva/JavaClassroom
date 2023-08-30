package Lista7;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner	read = new Scanner(System.in);
		String word;		
		
		System.out.println("Digite uma palavra:");
		word = read.next();
		
		System.out.println(new StringBuilder(word).reverse());
	}

}
