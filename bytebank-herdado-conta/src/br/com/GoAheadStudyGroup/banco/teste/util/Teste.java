package br.com.GoAheadStudyGroup.banco.teste.util;

import java.util.ArrayList;

import br.com.GoAheadStudyGroup.banco.modelo.Conta;
import br.com.GoAheadStudyGroup.banco.modelo.ContaCorrente;
import br.com.GoAheadStudyGroup.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {


		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaPoupanca(2903, 21);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 02);
		lista.add(cc3);
		
		Conta cc4 = new ContaPoupanca(2903, 10);
		lista.add(cc4);
		
		System.out.println(lista.size());
		
		Conta ref = (Conta)lista.get(0);
		System.out.println(ref.getNumero());
		
		Conta ref2 = (Conta)lista.get(1);
		System.out.println(ref2.getAgencia());
	
		lista.remove(3);
		System.out.println(lista.size());
		
		for(int i=0;i<lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		System.out.println("______________________________________");
		for(Object o : lista) {
			System.out.println(o);
		}
	
		

	}

}
