
public class Main {

	public static void main(String[] args) {
		Conta c = new Conta("santander",345,123567733,100, -20);
		System.out.println(c);
		
		ContaSimples cs = new ContaSimples("santander",345,1235677555,100,2000, -40);
		System.out.println(cs);

		ContaEspecial ce = new ContaEspecial("bradesco",237,1123134252,100,20,6000);
		System.out.println(ce);
	}

}
