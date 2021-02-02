
public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Felipe", "Ribeirao Preto"); 
		System.out.println(p);
		System.out.println("\n");
		
		PessoaFisica pf = new PessoaFisica("Felipe", "Ribeirao Preto", "123.123.123-00","casado");
		System.out.println(pf);
		System.out.println("\n");
		
		PessoaJuridica pj = new PessoaJuridica("Felipe", "Ribeirao Preto","213-5", "Empresario Individual");
		System.out.println(pj);
	}

}
