package aula_03_condicionais;

import java.util.Scanner;

public class plano_de_saude {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite o nome:");		
		nome = leia.next();
		
		System.out.println("Digite o idade: ");		
		idade = leia.nextInt();
		
		if(idade > 0 && idade <= 10) {
			System.out.println(nome + " A mensalidade do plano é R$100");
		} else if(idade > 0 && idade <= 29) {
			System.out.println(nome + " A mensalidade do plano é R$200");
				
		}else if(idade > 0 && idade <= 45) {
			System.out.println(nome + " A mensalidade do plano é R$300");	
		}else if(idade > 0 && idade <= 59) {
			System.out.println(nome + " A mensalidade do plano é R$500");	
		}else if(idade > 0 && idade <= 65) {
			System.out.println(nome + " A mensalidade do plano é R$600");	
		}else {
			System.out.println(nome + " A mensalidade do plano é R$1000");
		}
		
		
		leia.close();
		

	}

}
