package br.com.GoAheadStudyGroup.banco.teste;

import br.com.GoAheadStudyGroup.banco.especial.ContaEspecial;
import br.com.GoAheadStudyGroup.banco.modelo.ContaCorrente;
import br.com.GoAheadStudyGroup.banco.modelo.ContaPoupanca;
import br.com.GoAheadStudyGroup.banco.modelo.SaldoInsuficienteException;

// br.com.GoAheadStudyGroup.banco.teste.TesteContas
public class TesteContas {
	// java.lang.String
	public static void main(String[] args) throws SaldoInsuficienteException{
		
		
		// Full Qualified Name
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: "+ cc.getSaldo());
		System.out.println("CP: "+ cp.getSaldo());
	}

}
