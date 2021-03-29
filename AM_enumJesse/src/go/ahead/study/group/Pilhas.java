package go.ahead.study.group;

public class Pilhas {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
		metodo1();
		} catch(Exception e) {
			String texto = e.getMessage();
			System.out.println("Exception: -> " + texto);
			e.printStackTrace();
		
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		
		metodo2();
		
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
		throw new MinhaExcecao("Ficou errado novo");
		
		
		//System.out.println("Fim do metodo2");
	}

}
