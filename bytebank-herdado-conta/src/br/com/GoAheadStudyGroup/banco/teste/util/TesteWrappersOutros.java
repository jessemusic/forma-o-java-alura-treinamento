package br.com.GoAheadStudyGroup.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappersOutros {

	public static void main(String[] args) {
		
				
		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(29);
		
		System.out.println(idadeRef.doubleValue());
		
		
		Double dRef= Double.valueOf(3.2);//autoBoxing
		System.out.println(dRef.doubleValue());// unboxing
		
		Boolean bRef = Boolean.FALSE;
		
		Number refNumero = Float.valueOf(50.2f);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(32.6);
		lista.add(23.4f);
		
	}
}
