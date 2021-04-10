package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;



public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("jesse Caetano dos Santos");
		palavras.add("matemática saraiva");
		palavras.add("editora casa do codigo");
		
		Comparator<String> comp = new ComparadorPorTamanho();	
		Collections.sort(palavras, comp);
		
		System.out.println(palavras);
		System.out.println("--------------");
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		palavras.forEach(consumidor);

	}
	

}
 class ImprimeNaLinha implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}
	 
 }





class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if(s1.length()<s2.length())
			return -1;
		if(s1.length()>s2.length())
			return 1;
		return 0;
	}
	
}
