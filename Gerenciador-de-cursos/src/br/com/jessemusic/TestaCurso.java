package br.com.jessemusic;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do java", "Jesse Caetano dos Santos");

		javaColecoes.adiciona(new Aula("Campo harmonico por pe�as", 80));		
		javaColecoes.adiciona(new Aula("Campo harmonico estendido", 40));		
		javaColecoes.adiciona(new Aula("R�tmica", 50));
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		
		System.out.println(javaColecoes.getAulas());
		
	}

}
