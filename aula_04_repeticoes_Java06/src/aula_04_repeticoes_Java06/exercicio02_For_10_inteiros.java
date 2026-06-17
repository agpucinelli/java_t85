package aula_04_repeticoes_Java06;

import java.util.Scanner;

public class exercicio02_For_10_inteiros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador, numero, npar = 0, nimpar = 0;
		Scanner leia = new Scanner(System.in);
		
		for(contador = 1; contador<=10; contador++){
			
			System.out.println("Digite o "+contador+ " numero: ");
			
			numero = leia.nextInt();
			if(numero % 2 == 0) {
				npar++;
			
			}else {
				nimpar++;
			}
		}
		
		System.out.println("Total de números pares: " + npar);
		System.out.println("Total de números impares: " + nimpar);
		
		leia.close();
		
	}

}
