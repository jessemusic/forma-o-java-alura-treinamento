package br.com.jessemusic;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Jesse Caetano dos Santos");

		javaColecoes.adiciona(new Aula("Campo harmonico por peças", 80));		
		javaColecoes.adiciona(new Aula("Campo harmonico estendido", 40));		
		javaColecoes.adiciona(new Aula("Rítmica", 50));
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		
		System.out.println(javaColecoes.getAulas());
		
	}

}
