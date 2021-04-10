package br.com.jessemusic;

import java.util.ArrayList;

public class TestandoLIsta {

	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		System.out.println(aulas);
		
		for (String string : aulas) {
			System.out.println("Aula: " + string);
		}
		
		aulas.forEach(aula -> {
			System.out.println("Percorrendo :" + aula);
			});;
		

	}

}
