package br.com.jessemusic.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;



public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de saida para um arquivo
//		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//	    Writer osw = new OutputStreamWriter(fos); 
//	    BufferedWriter bw = new BufferedWriter(osw);	
	//	PrintStream ps = new PrintStream(new File("lorem5.txt"));
		
		PrintWriter ps = new PrintWriter("lorem6.txt");
	    ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
	    ps.println();
	    ps.println();
	    ps.println();
	 
	    ps.print("ncididunt ut labore et dolore");
	    ps.close();
	    
	  
	}

}
