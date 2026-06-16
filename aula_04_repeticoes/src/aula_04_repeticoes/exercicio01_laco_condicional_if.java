package aula_04_repeticoes;

import java.util.Scanner;

public class exercicio01_laco_condicional_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int na, nb, nc;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o número A: ");
		na = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		nb = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		nc = leia.nextInt();
		
		if(na+nb > nc) {
			System.out.println("A soma de A + B é Maior do que C.");
		}else if(na+nb < nc) {
			System.out.println("A soma de A + B é Menor do que C.");
		}else {
			System.out.println("A soma de A + B é Igual a C.");
		}
		
		leia.close();
	}

}
