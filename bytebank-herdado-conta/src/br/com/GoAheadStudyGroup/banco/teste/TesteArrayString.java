package br.com.GoAheadStudyGroup.banco.teste;

import br.com.GoAheadStudyGroup.banco.modelo.Cliente;
import br.com.GoAheadStudyGroup.banco.modelo.Conta;
import br.com.GoAheadStudyGroup.banco.modelo.ContaCorrente;
import br.com.GoAheadStudyGroup.banco.modelo.ContaPoupanca;

public class TesteArrayString {
	
	public static void main(String[] args) {
		
		System.out.println("Funcionou!");
		
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i] + " --> " + i);
		}
		System.out.println(args.length);
	}

}
