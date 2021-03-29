
public class NumeroPiramide {

	public static void main(String[] args) {
		for (int linha = 0; linha <= 10; linha++) {
			for (int coluna = 1; coluna <=linha; coluna++) {
				if (coluna != linha) {
					System.out.print(coluna);
				} else {
					System.out.print(linha);
				}
			}
			System.out.println();
		}

	}

}
