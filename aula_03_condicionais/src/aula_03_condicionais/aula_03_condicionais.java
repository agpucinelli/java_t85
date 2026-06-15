package aula_03_condicionais;

import java.util.Scanner;

public class aula_03_condicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
				
		System.out.println("Digite um  numero inteiro: ");		
		int numero = leia.nextInt();
		
		if(numero > 10 && numero < 100) {
			System.out.println("ok");
		}
	}

}
