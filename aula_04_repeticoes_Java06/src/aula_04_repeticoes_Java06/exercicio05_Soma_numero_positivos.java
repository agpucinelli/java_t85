package aula_04_repeticoes_Java06;

import java.util.Scanner;

public class exercicio05_Soma_numero_positivos {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero, somaNumero = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero > 0) {
				
				somaNumero = numero + somaNumero;
				
			}
		} while (!(numero == 0));
		
		System.out.println("A soma dos números positivos é " + somaNumero);
		
		leia.close();
	}

}
