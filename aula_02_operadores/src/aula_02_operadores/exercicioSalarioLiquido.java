package aula_02_operadores;

import java.util.Scanner;

public class exercicioSalarioLiquido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float sBruto, adNoturno, hextra, desc, salarioLiquido;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu salario: ");
		sBruto = leia.nextFloat();
		
		System.out.println("Digite seu Adicional Noturno: ");
		adNoturno = leia.nextFloat();
		
		System.out.println("Digite suas Horas Extra: ");
		hextra = leia.nextFloat();
		
		System.out.println("Digite seus Descontos: ");
		desc = leia.nextFloat();
		
		salarioLiquido = (sBruto + adNoturno + (hextra*5)) - desc;
		
		System.out.println("Salário Liquido: R$"+ salarioLiquido);
		
		leia.close();
		
		
		
		

	}

}
