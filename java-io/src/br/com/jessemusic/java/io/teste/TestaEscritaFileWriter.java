package br.com.jessemusic.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;



public class TestaEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de saida para um arquivo
//		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//	    Writer osw = new OutputStreamWriter(fos); 
	   
		
	
		BufferedWriter bw = new BufferedWriter(new FileWriter("Lorem4.txt"));
		
	    
	    bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
	    bw.newLine();
	    bw.newLine();
	    bw.newLine();
	    	    
	    bw.write("ncididunt ut labore et dolore");
	    bw.close();
	    
	  
	}

}
