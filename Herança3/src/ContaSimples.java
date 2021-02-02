
public class ContaSimples extends Conta {
	private double saldoPoupanca;
	private double valorPoupanca;
	//construtores
	public ContaSimples() {
		
	}
	
	public ContaSimples(String banco, int agencia, int numeroconta, double saldo, double saldoPoupanca, double valorPoupanca) {
		super(banco, agencia, numeroconta, saldo);
		setSaldoPoupanca(saldoPoupanca);	
		setValorPoupanca(valorPoupanca);
		
	}
	//get and set 
	
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public double getValorPoupanca() {
		return valorPoupanca;
	}

	public void setValorPoupanca(double valorPoupanca) {
		this.valorPoupanca = valorPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		
		if(saldoPoupanca >= 0)
			this.saldoPoupanca = saldoPoupanca;
	}
	//metodos

	public boolean depositoPoupanca() {
		if(saldoPoupanca + valorPoupanca > saldoPoupanca) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean saquePoupanca() {
		if(saldoPoupanca + valorPoupanca < saldoPoupanca) {
			return true;
		}else {
			return false;
		}
	}
	//toString

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", depositoPoupanca()=");
		builder.append(depositoPoupanca());
		builder.append(", saquePoupanca()=");
		builder.append(saquePoupanca());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}	
	
}
