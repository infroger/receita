
public class TesteReceita {

	public static void main(String[] args) {
		IReceita bolo = new ReceitaBolo();
		System.out.println(bolo.receita());
		
		IReceita miojo = new ReceitaMiojo();
		System.out.println(miojo.receita());
	}
	
}
