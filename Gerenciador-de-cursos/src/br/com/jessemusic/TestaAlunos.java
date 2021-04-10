package br.com.jessemusic;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Jesse James");
		alunos.add("Alberto Soares");
		alunos.add("Nuco Steppat");
		alunos.add("Jessica");
		alunos.add("Opahh Soares");
		alunos.add("Zico pat");
		alunos.add("Zeze Dica");
		
		System.out.println(alunos.contains("Jesse James"));
		System.out.println(alunos.size());
		alunos.remove("Jesse James");
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
	}

}
