/**
 * 
 */
package aula_01_variaveis;

import java.util.Scanner;

/**
 * 
 */
public class Variaveis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int numero01 = 10;
		int numero02 = 5;
		float numero03, numero04;
		String nome;
		char opcao = 'N';
		
		System.out.println("Variavel numero1 = " + numero01);
		System.out.println("Variavel numero2 = " + numero02);
		System.out.printf("%d + %d = %d\n", numero01, numero02, numero01 + numero02);
		System.out.print("Digite o primeiro valor real: ");
		numero03 = leia.nextFloat();
		
		System.out.print("\nDigite o segundo valor real: ");
		numero04 = leia.nextFloat();
		
		System.out.printf("%.2f * %.2f = %.2f", numero03, numero04, numero03 * numero04);
		
		System.out.print("\nDigite seu nome: ");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Seja bem vindo " + nome);
	
	}

}
