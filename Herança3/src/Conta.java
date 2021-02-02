
public class Conta {
	private String banco;
	private int agencia;
	private int numeroconta;
	private double saldo;
	private double valor;
	
	
	//construtores
	public Conta() {
		
	}
	
	public Conta(String banco, int agencia, int numeroconta, double saldo) {
		setBanco(banco);
		setAgencia(agencia);
		setNumeroconta(numeroconta);
		setSaldo(saldo);
	}
	
	public Conta(String banco, int agencia, int numeroconta, double saldo, double valor) {
		setBanco(banco);
		setAgencia(agencia);
		setNumeroconta(numeroconta);
		setSaldo(saldo);
		setValor(valor);
	}
	
	
	//get and set
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		if(banco.length() > 0)
			this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia > 0)
			this.agencia = agencia;
	}
	public int getNumeroconta() {
		return numeroconta;
	}
	public void setNumeroconta(int numeroconta) {
		if(numeroconta > 0)
			this.numeroconta = numeroconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo > 0)
			this.saldo = saldo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public boolean deposito() {
		if(saldo + valor > saldo) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean saque() {
		if(saldo + valor < saldo) {
			return true;
		}else {
			return false;
		}
	}
	
	
	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroconta=");
		builder.append(numeroconta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", deposito()=");
		builder.append(deposito());
		builder.append(", saque()=");
		builder.append(saque());
		builder.append("]");
		return builder.toString();
	}
	
	
}
