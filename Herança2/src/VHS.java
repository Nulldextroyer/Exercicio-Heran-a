
public class VHS extends Midia {
	private String titulo;
	//construtores
	public VHS() {
		
	}
	
	public VHS(int codigo, String descricao, String gravacao, float duracao) {
		super(codigo, descricao, gravacao, duracao);
	}

	public VHS(int codigo, String descricao, String gravacao, float duracao, String titulo) {
		super(codigo, descricao, gravacao, duracao);
		setTitulo(titulo);
	}
	//get and set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if(titulo.length() > 0)
			this.titulo = titulo;
	}
	//toSting

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" VHS [titulo=");
		builder.append(titulo);
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
