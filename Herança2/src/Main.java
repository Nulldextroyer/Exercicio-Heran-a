
public class Main {

	public static void main(String[] args) {
		Item i = new Item(12345, "Celular");
		System.out.println(i);
		
		Livro l = new Livro(2505, "muito meloso", "Felipe Greghi");
		System.out.println(l);

		Midia m = new Midia(777666, "trap gostosin", "30 pra um",10555 );
		System.out.println(m);
		
		CD c = new CD(666, "pagodin suave", "preclao.ltda", 666, 12, "Pericles", "mamasita");
		System.out.println(c);
		
		VHS v = new VHS(2007, "rock pesado", "mtv", 123, "number of the beast");
		System.out.println(v);
	}

}
