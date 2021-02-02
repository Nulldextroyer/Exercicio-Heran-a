
public class Pessoa {
	private String nome;
	private String endereco;
	
	//contrutor - 0
	public Pessoa() {
		
	}
	//construtor - 2
	public Pessoa(String nome, String endereco) {
		setNome(nome);
		setEndereco(endereco);
	}
	
	
	//set and get
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0)
			this.nome = nome;
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if(endereco.length() > 0)
			this.endereco = endereco;
	}
	
	//toString 
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("informaçoes: nome = ");
		builder.append(nome);
		builder.append(" endereco = ");
		builder.append(endereco);
		return builder.toString();
	}
	
	
}
