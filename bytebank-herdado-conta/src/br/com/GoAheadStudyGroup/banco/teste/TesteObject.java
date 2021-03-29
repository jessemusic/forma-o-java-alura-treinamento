package br.com.GoAheadStudyGroup.banco.teste;

import br.com.GoAheadStudyGroup.banco.modelo.ContaCorrente;
import br.com.GoAheadStudyGroup.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
//
//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		println();
		
		ContaCorrente cc = new ContaCorrente(22,33);
		ContaPoupanca cp = new ContaPoupanca(33,22);
		System.out.println(cc);
		System.out.println(cp);
		
		
	}
	
	static void println() {	}
	
	
	static void println(int a) {	
	}
	
	
	static void println(boolean valor) {	
	}
	
	static void println(ContaCorrente conta) {	
	}
	
	
	static void println(ContaPoupanca contap) {	
	}

}
