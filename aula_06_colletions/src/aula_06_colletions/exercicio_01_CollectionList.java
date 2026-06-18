package aula_06_colletions;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio_01_CollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		
		for(int contador = 0; contador<5; contador++) {
		System.out.println("Digite uma cor:");
		cores.add(leia.nextLine());
		
		}
		
		System.out.println("\n Listar todas as cores: ");
		for (String cor: cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		
		System.out.println("\n Ordenar todas as cores: ");
		for (String cor: cores) {
			System.out.println(cor);
		}
	}

}
