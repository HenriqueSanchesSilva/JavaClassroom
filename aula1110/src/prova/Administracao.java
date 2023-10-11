package prova;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Administracao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Populacao pop = new Populacao(4, 5);
		int i, j, n, estado, popEstado;
		Scanner in = new Scanner(System.in);
		
		for(i=0;i<4;i++) {
			for(j=0;j<5;j++) {
				n = Integer.parseInt(JOptionPane.showInputDialog
						("Informe a população da cidade "
				+ String.valueOf(j+1) + "\ndo estado "
				+ String.valueOf(i+1)));
				pop.atualizarPop(i, j, n);
			}
		}
		
		System.out.println("Digite o número do estado:");
		estado = in.nextInt();
		estado --;
		popEstado = pop.popEstados(estado);
		System.out.println("A população média deste estado é: "+popEstado);
		
		
		in.close();
	}
}
