package aula03_condicionais;

import java.util.Scanner;

public class exercicio_01_analise_de_idade_e_acesso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade;			
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome:");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade:");
		idade = leia.nextInt();
		
		
		
		if(idade>=18) {
			System.out.println("Acesso liberado para "+nome);
			
		}else if(idade<18) {
			System.out.println("Autorização: ");
				boolean auth = leia.nextBoolean();
					if(auth) {
					System.out.println("Acesso liberado com autorização para "+nome);
					}else {
					System.out.println("Acesso Negado para "+nome);
					}
					
			}

		leia.close();
	}

}
