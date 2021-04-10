package br.com.jessemusic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do java", "Jesse Caetano dos Santos");

		javaColecoes.adiciona(new Aula("A Campo harmonico por pe�as", 80));		
		javaColecoes.adiciona(new Aula("Campo harmonico estendido", 40));		
		javaColecoes.adiciona(new Aula("R�tmica", 50));
		javaColecoes.adiciona(new Aula("Composi��o e arranjo", 30));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
		
	
	}

}
