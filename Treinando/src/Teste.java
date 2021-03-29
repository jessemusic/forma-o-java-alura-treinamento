
public class Teste {

	public static void main(String[] args) {
		for (int linha = 0; linha <= 10; linha++) {
			for (int coluna = 0; coluna <=linha; coluna++) {
				if (coluna != linha) {
					System.out.print("*");
				} else {
					System.out.print(coluna);
				}
			}
			System.out.println();
		}
	}
}
