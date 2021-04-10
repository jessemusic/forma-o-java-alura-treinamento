package br.com.jessemusic;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
	
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	
	
	public int getTempo() {
		return tempo;
	}
	public String getTitulo() {
		return titulo;
	}
	@Override
	public String toString() {
		
		return "[Aula: " + this.titulo + ", " + this.tempo + " ]\n";
	}



	@Override
	public int compareTo(Aula o) {
	
		return this.titulo.compareTo(o.titulo);
	}


}
