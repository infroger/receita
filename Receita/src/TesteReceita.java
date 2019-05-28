
public class TesteReceita {

	public static void main(String[] args) {
		IReceita bolo = new ReceitaBolo();
		IReceita bolo = new ReceitaPao();
 IReceita cuca = new ReceitaCuca();		System.out.println(bolo.receita());
		System.out.println(cuca.receita());

		
	}
	
}
