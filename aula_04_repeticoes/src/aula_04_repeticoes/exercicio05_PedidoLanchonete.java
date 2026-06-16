package aula_04_repeticoes;

import java.util.Scanner;

public class exercicio05_PedidoLanchonete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codigo;
		float preco = 0, preco_total, quantidade;
		String produto = null;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		codigo = leia.nextInt();
		switch(codigo) {
		
		case 1:
			produto = "Cachorro Quente";
			preco = 10;
		break;
		case 2:
			produto = "X-Salada";
			preco = 15;
		break;
		case 3:
			produto = "X-Bacon";
			preco = 18;
		break;
		case 4:
			produto = "Bauru";
			preco = 12;
		break;
		case 5:
			produto = "Refrigerante";
			preco = 8;
		break;
		case 6:
			produto = "Suco de laranja";
			preco = 13;
		break;				
		
		}
		
		System.out.println("Quantidade?");
		quantidade = leia.nextFloat();
		
		preco_total = preco*quantidade;
		
		System.out.println(produto + "    R$" + preco_total);
		
		leia.close();
		
	}

}
