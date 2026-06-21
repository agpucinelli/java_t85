package pratica_avaliada_02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numSoma = 0;
		int numIndex = 0;
		int media = 0;
		
		Scanner leia = new Scanner(System.in);		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for(int numero = 0; numero<5 ; numero++) {
			System.out.println("Digite um numero: ");
			numIndex = leia.nextInt();
			
			numeros.add(numIndex);			
			numSoma = somar(numSoma,numIndex);
			

		}
		
		media = media(numSoma,5);		
		
		System.out.println(numeros);
		
		System.out.println("A soma dos números é: " + numSoma);
		System.out.println("A média dos números é: " + media);		
		System.out.println("O maior número é: " + maior(numeros));
		
		

		leia.close();

	}
	
	public static int somar (int num1, int num2) {
		return num1 + num2;
		
	}
	public static int media (int num1, int num2) {
		return num1 / num2;
		
	}
	public static int maior (ArrayList<Integer> numeros) {
		numeros.sort(Comparator.reverseOrder());

		return numeros.get(0);
		
	}

}
