package aula_02_operadores;

import java.util.Scanner;

public class exercicioCalculoProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, n4, calculoFinal;
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Digite o valor do n1: ");
		n1 = leia.nextFloat();
		
		System.out.println(" Digite o valor do n2: ");
		n2 = leia.nextFloat();
		
		System.out.println(" Digite o valor do n3: ");
		n3 = leia.nextFloat();
		
		System.out.println(" Digite o valor do n4: ");
		n4 = leia.nextFloat();
		
		calculoFinal = (n1*n2) - (n3*n4);
		
		System.out.println("O valor da diferença é: " + calculoFinal);
		

	}

}
