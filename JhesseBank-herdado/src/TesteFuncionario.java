
public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		
		Cliente cliente = new Cliente();
	
		
		Gerente jesse = new Gerente();
		
		jesse.setCpf("11.111.111-11");
		jesse.setSalario(19000.00);
		jesse.setNome("Jesse Caetano dos Santos");
		
		System.out.println(jesse.getNome());
		System.out.println(jesse.getBonificacao());
		
		//jesse.salario= 50000.00;
		
		

	}

}
