package br.com.jessemusic;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Jesse Caetano dos Santos");

		javaColecoes.adiciona(new Aula("A Campo harmonico por peças", 80));		
		javaColecoes.adiciona(new Aula("Campo harmonico estendido", 40));		
		javaColecoes.adiciona(new Aula("Rítmica", 50));
		javaColecoes.adiciona(new Aula("Composição e arranjo", 30));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 3463);
		Aluno a2 = new Aluno("Paulo", 3000);
		Aluno a3 = new Aluno("Ana", 2991);
		Aluno a4 = new Aluno("Gabriela", 2991);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		System.out.println(javaColecoes.getAlunos());
		System.out.println("------------------");
		
		System.out.println("Quem está com essa matrícula 2991 ?");
		Aluno aluno = javaColecoes.buscaMatriculado(2991);
System.out.println("Aluno: "+aluno);
	}

}
