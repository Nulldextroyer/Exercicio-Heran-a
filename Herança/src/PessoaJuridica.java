
public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String tipoEmpresa;
	
	//construtores
	
	public PessoaJuridica() {
	
	}
	
	public PessoaJuridica(String nome, String endereco) {
		super (nome, endereco);
	}
	
	public PessoaJuridica(String nome, String endereco, String cnpj, String tipoEmpresa) {
		super (nome, endereco);
		setCnpj(cnpj);
		setTipoEmpresa(tipoEmpresa);
	}
	//set and get 
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		if(cnpj.length() > 0)
			this.cnpj = cnpj;
	}
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		if(tipoEmpresa.length() > 0)
			this.tipoEmpresa = tipoEmpresa;
	}
	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" cnpj = ");
		builder.append(cnpj);
		builder.append(" tipoEmpresa = ");
		builder.append(tipoEmpresa);
		
		return builder.toString();
	}
	
}
