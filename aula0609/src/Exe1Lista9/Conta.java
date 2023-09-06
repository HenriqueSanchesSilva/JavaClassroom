package Exe1Lista9;

public class Conta {

	double saldo;
	String nrAgencia;
	String titular;
	String nrConta;
	int codBanco;
	
	public Conta() {
	}
	
	public Conta(double saldo, String nrAgencia, String titular, String nrConta, int codBanco){
		this.saldo =saldo;
		this.codBanco = codBanco;
		this.nrAgencia = nrAgencia;
		this.titular = titular;
		this.nrConta = nrConta;		
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNrAgencia() {
		return nrAgencia;
	}

	public void setNrAgencia(String nrAgencia) {
		this.nrAgencia = nrAgencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNrConta() {
		return nrConta;
	}

	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}

	public int getCodBanco() {
		return codBanco;
	}

	public void setCodBanco(int codBanco) {
		this.codBanco = codBanco;
	}

	public void saque(double valor) {
		String message = ""; 
		if(valor > 0) {
			if (saldo > valor) {
				setSaldo(saldo-valor);
				message="Saque efetuado, seu novo saldo é:" + saldo;
			}else {
				message = "Valor insuficiente para efetuar saque";
			}
		}else {
			message="Valor de saque invalido";
		}
		
		System.out.println(message);
	}
}






















