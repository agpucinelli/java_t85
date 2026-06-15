package aula_02_operadores;

import java.util.Scanner;

public class exercicioNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1, n2, n3, n4, mediaFinal;		
		Scanner leia = new Scanner(System.in);

		System.out.println("DIGITE A NOTA 1:");
		n1 = leia.nextFloat();
		
		System.out.println("DIGITE A NOTA 2:");
		n2 = leia.nextFloat();
		
		System.out.println("DIGITE A NOTA 3:");
		n3 = leia.nextFloat();
		
		System.out.println("DIGITE A NOTA 4");
		n4 = leia.nextFloat();
		
		mediaFinal = (n1+n2+n3+n4)/4;
		
		System.out.println("A média Final é: " + mediaFinal);
		
		leia.close();
	}

}
