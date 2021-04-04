package br.com.GoAheadStudyGroup.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {

	public static void main(String[] args) {
		
				
		int idade = 29;
		
		Integer idadeRef = Integer.valueOf(29);
		
		System.out.println(idadeRef.doubleValue());
		
		System.out.println("Valor máx do Integer: "+Integer.MAX_VALUE);
		System.out.println("Valor mín do Integer: "+Integer.MIN_VALUE);
		System.out.println("Valor em Bytes do Integer: "+Integer.BYTES);
		System.out.println("Valor em Bites do Integer: "+Integer.MIN_VALUE);
		
		int valor = idadeRef.intValue();
		String s = args[0];
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(Integer.valueOf(29));// Autoboxing
		
		Integer ref = Integer.valueOf("3");
		System.out.println(ref);
        ref++;
        System.out.println(ref);
	}
}
