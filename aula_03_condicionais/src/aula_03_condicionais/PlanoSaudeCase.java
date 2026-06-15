package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaudeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner leia = new Scanner(System.in);
		
		String nome;
		int faixaEtaria;
		
		System.out.println("Digite o nome:");		
		nome = leia.next();
		
		System.out.println("********************************************");
		System.out.println("***************FAIXA ETÁRIA****************");
		System.out.println("********************************************");
		System.out.println("OPÇÃO 01 - 0 - 10 Anos de idade");
		System.out.println("OPÇÃO 02 - 11 - 29 Anos de idade");
		System.out.println("OPÇÃO 03 - 30 - 45 Anos de idade");
		System.out.println("OPÇÃO 04 - 45 - 59 Anos de idade");
		System.out.println("OPÇÃO 05 - 60 - 65 Anos de idade");
		System.out.println("OPÇÃO 06 - Maiores de 65 Anos de idade");
		System.out.println("********************************************");
		System.out.println("********************************************");
		
		
		System.out.println("Escolha a sua faixa etária. ");		
		faixaEtaria = leia.nextInt();
		
		
		switch(faixaEtaria) {
		
		case 1: 
			System.out.println(nome + " A mensalidade do plano é R$100");
			break;	
		case 2:
			System.out.println(nome + " A mensalidade do plano é R$200");
			break;
		case 3:
			System.out.println(nome + " A mensalidade do plano é R$300");
			break;
		case 4:
			System.out.println(nome + " A mensalidade do plano é R$500");
			break;
		case 5:
			System.out.println(nome + " A mensalidade do plano é R$600");
			break;
		case 6:
			System.out.println(nome + " A mensalidade do plano é R$1000");
		break;
		}
		
		
		leia.close();

	}

}
