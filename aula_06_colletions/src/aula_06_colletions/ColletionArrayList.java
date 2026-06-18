package aula_06_colletions;

import java.util.ArrayList;
import java.util.Comparator;

public class ColletionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		
		numeros.add(1);
		numeros.add(5);
		numeros.add(2);
		numeros.add(7);
		numeros.add(4);
		
		
		
		System.out.println(" O objeto esta no indice 1: " + numeros.get(1));
		System.out.println(" O indice do objeto 1: " + numeros.indexOf(1));
		
		numeros.remove(0);
		
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
		//crescente
		numeros.sort(null);
		
		//decrescente
		numeros.sort(Comparator.reverseOrder());
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
		
	}

}
