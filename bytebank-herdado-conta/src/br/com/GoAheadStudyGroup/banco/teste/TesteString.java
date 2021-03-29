package br.com.GoAheadStudyGroup.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "JMC ESCOLA DE MÚSICA";
		String alfaneto = "abcdefghijklmnopqrstwxyz";
	//	String outro = new String("Jesse");
		
//		String x = nome.replace("J", "j");
//		String y = nome.toLowerCase();
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(alfaneto.toUpperCase());

			char c = nome.charAt(1);
					System.out.println(c);
					
					System.out.println(nome.indexOf("MÚ"));
			String sub= nome.substring(4,10);
			System.out.println(sub);
			System.out.println(nome.toLowerCase().contains("esco"));
			System.out.println(nome.split(nome));

					
	}

}
