package aula_04_repeticoes_Java06;

import java.util.Scanner;

public class exercicio03_Total_maiores_menores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade = 0, maior = 0, menor = 0;
		
		
		
				
		while(idade>=0) {
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite a idade: ");
			idade = leia.nextInt();
			
			if(idade<21) {
				menor++;
			}else if(idade>50) {
				maior++;
			}
			leia.close();
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menor);
		System.out.println("Total de pessoas menores de 50 anos: " + maior);
		
		
	}
	
}
