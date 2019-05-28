
public class TesteReceita {

	public static void main(String[] args) {
		IReceita bolo = new ReceitaBolo();
		System.out.println(bolo.receita());
		
		IReceita brigadeiro = new ReceitaBrigadeiro();
		System.out.println(brigadeiro.receita());
		
		
	}
	
}
