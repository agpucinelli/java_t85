package aula03_condicionais;

import java.util.Scanner;

public class exercicio_02_notaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome, sfinal;
		float nota;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a nota: ");
		nota= leia.nextFloat();
		
		if(nota>=7) {
			sfinal = "Aprovado";
			System.out.println(nome +" sua nota final é "+ nota+". Você está " + sfinal);
			
		}else if(nota>=5 && nota<7) {
			sfinal = "de Recuperação";
			System.out.println(nome +" sua nota final é "+ nota+". Você está " + sfinal);
		}else {
			sfinal = "Reprovado";
			System.out.println(nome +" sua nota final é "+ nota+". Você está " + sfinal);
		}
		
		leia.close();
	}

}
