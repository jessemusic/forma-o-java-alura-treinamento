package br.com.GoAheadStudyGroup.banco.teste;

import br.com.GoAheadStudyGroup.banco.modelo.Conta;
import br.com.GoAheadStudyGroup.banco.modelo.ContaCorrente;
import br.com.GoAheadStudyGroup.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 21);
		guardador.adiciona(cc2);
		
		Conta cc3 = new ContaCorrente(22, 01);
		guardador.adiciona(cc3);
		
		Conta cc4 = new ContaCorrente(22, 02);
		guardador.adiciona(cc4);

		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(2);
		
		System.out.println(ref.getNumero());
		
	}

}
