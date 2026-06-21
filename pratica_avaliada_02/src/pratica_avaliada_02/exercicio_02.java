package pratica_avaliada_02;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String continuar;
		double mediaNota = 0;
		double mediaFinal= 0;
		
		ArrayList<String> alunos = new ArrayList<String>();
		
		do {
		System.out.println("**********Adicionar aluno**********"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "Digite o nome do aluno: ");
		
		String nome = leia.next();
		
		System.out.println(""
				
				+ "Digite a idade do aluno: ");
		
		int idade= leia.nextInt();
		
		System.out.println(""
				
				+ "\n"
				+ "Digite a nota do aluno: ");
		
		double nota = leia.nextDouble();
		mediaNota = mediaNota + nota;
		
		
		String dadosAluno = String.format(
			    "%-20s | %-5d | %-10.1f",
			    nome,
			    idade,
			    nota
			);

			alunos.add(dadosAluno);
			mediaFinal = mediaNota/alunos.size();
			System.out.println("\n+----------------------+-------+------------+");
			System.out.printf("| %-20s | %-5s | %-10s |%n",
			        "Nome", "Idade", "Nota");
			System.out.println("+----------------------+-------+------------+");

			for (String aluno : alunos) {
			    System.out.println("| " + aluno + " |");
			}

			System.out.println("+----------------------+-------+------------+");
			System.out.println("+----------------------+-------+------------+");
			System.out.println("+----------------------+-------+------------+");
			System.out.println("| MEDIA GERAL: " +mediaNota + " dividido " + alunos.size() + " = "+   String.format("%.1f", mediaFinal)  + " |");
			System.out.println("+----------------------+-------+------------+");
			System.out.println("+----------------------+-------+------------+");
			System.out.println("+----------------------+-------+------------+");
		
		
		
		System.out.print("Adicionar novo aluno? Digite S para sim. ");
        continuar = leia.next();
		} while (continuar.equalsIgnoreCase("S"));
			
	     System.out.println("Cadastro encerrada.");
		
		leia.close();
	}

}
