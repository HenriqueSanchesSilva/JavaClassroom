package prova;

public class Populacao {
	private int pop[][];
	private int estados, municipios;
	
	public Populacao(int estados, int municipios) {
		// TODO Auto-generated constructor stub
		this.estados = estados;
		this.municipios = municipios;
		pop = new int[estados][municipios];
	}
	
	
	public void atualizarPop(int i, int j, int populacao) {
		// TODO Auto-generated method stub
		if(i>=0 && i<4 && j>=0 && j<5 && populacao>0) {
			pop[i][j] = populacao;
		}
	}
	
	public int popEstados(int estado) {
		// TODO Auto-generated method stub
		int popMedia =0, i;
		for(i=0;i<municipios;i++) {
			popMedia += pop[estado][i];
		}
		popMedia /= (i+1);
		
		return popMedia;
	}
	
}
