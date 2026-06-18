package aula_06_colletions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio03_CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		for (int contador = 0; contador<10; contador++) {
			System.out.println("Digite um numero: ");
			int num = leia.nextInt();
			numeros.add(num);
			
			
		}
		
		// Lista todos os elementos da Collection Set com o Objeto da Classe Iterator
				System.out.println("\n\nListar todos os Elementos com o Iterator");

				Iterator<Integer> isetNumeros = numeros.iterator();

				while (isetNumeros.hasNext()) {
					System.out.println(isetNumeros.next());
				}
		
				
	}

}
