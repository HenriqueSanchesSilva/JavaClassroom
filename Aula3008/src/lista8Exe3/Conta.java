package lista8Exe3;

public class Conta {
	double saldo;
	String numAgencia;
	String titular;
	String numConta;
	int codBanco;

	public void imprimiValores() {
		System.out.println("-----------------");
		System.out.println("AGENCIA:" + numAgencia+" BANCO:"+codBanco);
		System.out.println("CONTA CORRENTE:" + numConta);
		System.out.println("TITULAR:" + titular);
		System.out.println("SALDO:" + saldo);
		System.out.println("-----------------");
	}
}
