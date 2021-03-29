package br.com.GoAheadStudyGroup.banco.teste;

import br.com.GoAheadStudyGroup.banco.modelo.Cliente;
import br.com.GoAheadStudyGroup.banco.modelo.Conta;
import br.com.GoAheadStudyGroup.banco.modelo.ContaCorrente;
import br.com.GoAheadStudyGroup.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {
	
	public static void main(String[] args) {
		
		//int[] idades = new int[];
		
		Object[] contas = new Object[5];
		
		Object cc1 = new ContaCorrente(22, 11);
		contas[0]=cc1;
		
		Object cc2 = new ContaPoupanca(22, 98);
		contas[1]=cc2;
	
		
		Object ref = contas[1];
		System.out.println(((Conta) cc2).getNumero());
		System.out.println(((Conta) ref).getNumero());
		
		Cliente clienteNormal = new Cliente();
		clienteNormal.setNome("Flavio");

		Cliente clienteVip = new Cliente();
		clienteVip.setNome("Romulo");

		Object[] refs = new Object[5];
		refs[0]  = clienteNormal;
		refs[1]  = clienteVip;

		System.out.println(((Cliente) refs[1]).getNome());
		
	}

}
