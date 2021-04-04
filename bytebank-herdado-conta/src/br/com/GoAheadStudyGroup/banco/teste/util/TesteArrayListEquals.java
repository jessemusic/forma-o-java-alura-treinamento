package br.com.GoAheadStudyGroup.banco.teste.util;

import java.util.ArrayList;

import br.com.GoAheadStudyGroup.banco.modelo.Cliente;
import br.com.GoAheadStudyGroup.banco.modelo.Conta;
import br.com.GoAheadStudyGroup.banco.modelo.ContaCorrente;
import br.com.GoAheadStudyGroup.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		
//		Conta cc1 = new ContaCorrente(22, 22);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc1.ehIgual(cc2);
//		System.out.println(igual);
		

		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaPoupanca(2903, 21);
		lista.add(cc2);
		
		Conta cc3 = new ContaPoupanca(2903, 21);
		lista.add(cc2);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("Já existe? " + existe);
		
				
		for(Object o : lista) {
			System.out.println(o);
		}
	
		
		
		
	}

}
