package br.com.jessemusic;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Jesse Caetano dos Santos");

		javaColecoes.adiciona(new Aula("A Campo harmonico por peças", 80));		
		javaColecoes.adiciona(new Aula("Campo harmonico estendido", 40));		
		javaColecoes.adiciona(new Aula("Rítmica", 50));
		javaColecoes.adiciona(new Aula("Composição e arranjo", 30));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 3463);
		Aluno a2 = new Aluno("Paulo", 3000);
		Aluno a3 = new Aluno("Ana", 2991);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Alunos matrículados:");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
			});
		
		
		Aluno turini = new Aluno("Rodrigo Tuniri",3463);
		System.out.println("É esse o mesmo aluno?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		

	}

}
