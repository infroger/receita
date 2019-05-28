
public class TesteReceita {

	public static void main(String[] args) {
		IReceita bolo = new ReceitaBolo();
		IReceita pizza = new ReceitaPizza();
		System.out.println(bolo.receita());
		System.out.println(pizza.receita());
		
		
	}
	
}
