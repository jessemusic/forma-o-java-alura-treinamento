package br.com.jessemusic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {

		Aula a1 = new Aula("Campo Harmonico estendido", 100);

		Aula a2 = new Aula("Guitarra pr�tica", 250);

		Aula a3 = new Aula("Aprendendo leitura musical", 80);

		Aula a4 = new Aula("Ritmica", 90);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
	}

}
