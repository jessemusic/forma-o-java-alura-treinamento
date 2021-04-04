package br.com.jessemusic.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraDois {



	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scanner =  new Scanner(new File("contas.csv"),"UTF-8");
		while(scanner.hasNextLine()){
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipo = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titulo = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			System.out.format(new Locale("pt", "BR"),"%s %04d %08d %20s %08.2f %n",
								tipo , agencia , numero, titulo,saldo);
		
			linhaScanner.close();
			
//			String [] valores =linha.split(",");
//			System.out.println(valores[1]);
		}
		
		scanner.close();
	}

}
