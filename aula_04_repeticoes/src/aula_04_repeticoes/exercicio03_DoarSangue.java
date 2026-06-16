package aula_04_repeticoes;

import java.util.Scanner;

public class exercicio03_DoarSangue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int idade;			
	
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome:");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade:");
		idade = leia.nextInt();
		
		
		
		if(idade>=18 && idade<=59 ) {
			System.out.println(nome + " está apto(a) para doar sangue!\r\n");
			
		}else if(idade>=60 && idade <=69) {
			System.out.println("Primeira doação de Sangue: ");
				boolean auth = leia.nextBoolean();
					if(auth) {
					System.out.println(nome + " está apto(a) para doar sangue!\r\n");
					}else {
					System.out.println(nome + " não está apto(a) para doar sangue!\r\n");
					}
					
			}else {
				System.out.println(nome + " não está apto(a) para doar sangue!\r\n");
			}

		leia.close();
	}

}
