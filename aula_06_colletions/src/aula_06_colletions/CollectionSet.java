package aula_06_colletions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
 
public class CollectionSet {
 
	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("uva");
		frutas.add("Uva");
		
		
		ArrayList<String> listaFrutas = new ArrayList<String>(Arrays.asList("Banana", "Pêra", "Banana"));
		
		frutas.addAll(listaFrutas);
		
		for(String fruta : frutas) {
			System.out.println(fruta);
			System.out.println(fruta.hashCode());
		}
		
		
		System.out.println("A fruta Laranja esta presente? " + frutas.contains("Laranja"));
		
		frutas.remove("uva");
		for(String fruta : frutas) {
			System.out.println(fruta);
			System.out.println(fruta.hashCode());
		}
	}
 
}