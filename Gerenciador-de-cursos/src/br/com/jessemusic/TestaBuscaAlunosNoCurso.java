package br.com.jessemusic;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es do java", "Jesse Caetano dos Santos");

		javaColecoes.adiciona(new Aula("A Campo harmonico por pe�as", 80));		
		javaColecoes.adiciona(new Aula("Campo harmonico estendido", 40));		
		javaColecoes.adiciona(new Aula("R�tmica", 50));
		javaColecoes.adiciona(new Aula("Composi��o e arranjo", 30));
		
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
		
		System.out.println("Quem est� com essa matr�cula 2991 ?");
		Aluno aluno = javaColecoes.buscaMatriculado(2991);
System.out.println("Aluno: "+aluno);
	}

}
