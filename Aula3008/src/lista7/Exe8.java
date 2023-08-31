package lista7;

import java.io.InterruptedIOException;
import java.util.Scanner;

public class Exe8 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int contador;
		
		contador = read.nextInt();
		int fibonacci[] = new int[contador];
		
		for(int i = 0; i<contador;i++) {
			if(i == 0) {
				fibonacci[i] = 0;				
			}else if(i==1) {
				fibonacci[i] = 1;
			}else {
				fibonacci[i] = fibonacci[i-1] +fibonacci[i-2];
			}
			
			
			System.out.print(fibonacci[i]+", ");
			
		}
	}

}
