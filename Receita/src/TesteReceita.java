
public class TesteReceita {

	public static void main(String[] args) {
		IReceita bolo = new ReceitaBolo();
		System.out.println(bolo.receita());
		
		IReceita tortaDeBolacha = new ReceitaTortaDeBolacha();
        System.out.println(tortaDeBolacha.receita());
	}
	
}
