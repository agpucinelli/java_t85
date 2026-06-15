package aula_02_operadores;

import java.util.Scanner;

public class exercicioSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Digite o salário: ");		
		salario = leia.nextFloat();
		
		System.out.println(" Digite o abono: ");		
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("O novo salário será: R$" + novoSalario);
		
		leia.close();
	}

}
