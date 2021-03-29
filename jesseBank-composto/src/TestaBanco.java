
public class TestaBanco {
	public static void main(String[] args) {
		Cliente jesse = new Cliente();
		jesse.nome = "Jesse Caetano";
		jesse.cpf = "111.111.111-11";
		jesse.profissao = "Professor programador";
		
		Conta contaDoJesse = new Conta();
		contaDoJesse.deposita(1000);
		
		contaDoJesse.titular = jesse;
		System.out.println(contaDoJesse.titular.nome);
		System.out.println(contaDoJesse.titular);
		System.out.println(jesse);
	}
}
