
public class TesteReceita {

	public static void main(String[] args) {
		IReceita bolo = new ReceitaBolo();
		System.out.println(bolo.receita());
		IReceita maionese = new ReceitaMaioneseDeLeite();
		System.out.println(maionese.receita());		
	}	
}
