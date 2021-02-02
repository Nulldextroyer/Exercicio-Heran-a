
public class PessoaFisica extends Pessoa {
	private String cpf;
	private String estadocivil;
	
	//contrutores
	public PessoaFisica (){
		
	}
	
	public PessoaFisica (String nome, String endereco) {
		super(nome,endereco);
	}
	
	public PessoaFisica(String nome, String endereco, String cpf, String estadocivil) {
		super(nome,endereco);
		setCpf(cpf);
		setEstadocivil(estadocivil);
	}	
	
	//get and set
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.length() > 0)
			this.cpf = cpf;
	}
	
	
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		if(estadocivil.length() > 0 )
			this.estadocivil = estadocivil;
	}
	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" cpf = ");
		builder.append(cpf);
		builder.append(" estadocivil = ");
		builder.append(estadocivil);
		
		return builder.toString();
	}
	
	
}
