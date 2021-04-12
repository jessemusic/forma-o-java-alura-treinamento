package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Curso2{
	private String nome;
	private int alunos;
	
	public Curso2(String nome, int alunos) {
		
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}

public class ExemploCursos2 {
	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Ukulele", 25));
		cursos.add(new Curso("Jazz improvise", 150));
		cursos.add(new Curso("Harmonia popular", 100));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
//		cursos.stream()
//			.filter(c-> c.getAlunos()>=100)
//			.findAny()
//			.ifPresent(c-> System.out.println(c.getNome()));
		
//		 cursos = cursos.stream()
//		.filter(c-> c.getAlunos()>=100)
//		.collect(Collectors.toList());
//		
//		cursos.stream()
//			.forEach(c-> System.out.println(c.getNome()));
		
		
		 cursos.parallelStream()
					.filter(c-> c.getAlunos()>=40)					
					.collect(Collectors.toMap(
							c-> c.getNome(),
							c-> c.getAlunos()))
					.forEach((nome, alunos)->System.out.println(nome+" tem " + alunos +" alunos"));
		 cursos.stream()
		    .mapToInt(c -> c.getAlunos())
		    .average();
	
	}
	
	
}
