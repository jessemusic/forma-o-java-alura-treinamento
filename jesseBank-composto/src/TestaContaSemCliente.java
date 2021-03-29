
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaJmc = new Conta();
		System.out.println(contaJmc.getSaldo());
		
		contaJmc.titular = new Cliente();
		System.out.println(contaJmc.titular);
		
		contaJmc.titular.nome = "Escola de Música e Matemática";
		System.out.println(contaJmc.titular.nome);
	}

}
