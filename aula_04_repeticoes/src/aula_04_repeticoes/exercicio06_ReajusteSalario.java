package aula_04_repeticoes;

import java.util.Scanner;

public class exercicio06_ReajusteSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo;
		double porcentagem = 0, salario_total, salario; 
		String cargo = null;
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do colaborador: ");
		nome = leia.nextLine();
		
		
		System.out.println("Digite o código do cargo: ");
		codigo = leia.nextInt();
		switch(codigo) {
		
		case 1:
			cargo = "Gerente";
			porcentagem = 0.10;
		break;
		case 2:
			cargo = "Vendedor";
			porcentagem = 0.07;
		break;
		case 3:
			cargo = "Supervisor";
			porcentagem = 0.09;
		break;
		case 4:
			cargo = "Motorista";
			porcentagem = 0.06;
		break;
		case 5:
			cargo = "Estoquista";
			porcentagem = 0.05;
		break;
		case 6:
			cargo = "Técnico de TI";
			porcentagem = 0.08;
		break;				
		
		}
		
		System.out.println("Digite o salario atual:");
		salario = leia.nextFloat();
		
		salario_total = (salario*porcentagem) + salario;
		
		System.out.println("Nome do Colaborador: " + nome + "\n"
				+ "Cargo: " + cargo + "\n" 
				+ "Salário:" + " R$" + salario_total);
		
		leia.close();
	}

}
