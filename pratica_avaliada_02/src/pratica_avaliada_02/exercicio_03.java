package pratica_avaliada_02;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio_03 {

	static Scanner leia = new Scanner(System.in);
	static ArrayList<String> produtos = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		
		
		String continuar;
		do {
		System.out.println("+----------------------+MENU ESTOQUE+----------+");
		System.out.println("+----------------------+----------+------------+");
		System.out.println("+----------------------+----------+------------+");
		System.out.println("+----------------------+  OPÇÕES: +------------+");
		System.out.println("1--CADASTRAR PRODUTO");
		System.out.println("2--ATUALIZAR QUANTIDADE");
		System.out.println("3--LISTAR PRODUTOS");
		System.out.println("4--SAIR");
				
	
	 switch(op = leia.nextInt()) {
	 
	 case 1:
		 System.out.println("CADASTRAR PRODUTO");
		 produtoAdd();
		
		 break;
	 case 2:
		 System.out.println("ATUALIZAR QUANTIDADE");
		 System.out.println("Qual produto? ");
		 String nomeProduto = leia.next();
		 System.out.println("Nova Quantidade: ");
		 int novaQuantidade = leia.nextInt();
		 alterarQuantidade(nomeProduto, novaQuantidade);
		 System.out.println("\n+---------------ESTOQUE MIL GRAU------------+");
			System.out.println("\n+----------------------+-------+------------+");
			System.out.printf("| %-20s | %-5s    %n",
			        "Produto", "Quantidade");
		 for (String dadosProduto : produtos) {
			    System.out.println("| " + dadosProduto + " |");
			}
		 break;
	 case 3:
		 System.out.println("LISTAR PRODUTOS");
		 System.out.println("\n+---------------ESTOQUE MIL GRAU------------+");
			System.out.println("\n+----------------------+-------+------------+");
			System.out.printf("| %-20s | %-5s    %n",
			        "Produto", "Quantidade");
		 for (String dadosProduto : produtos) {
			    System.out.println("| " + dadosProduto + " |");
			}
		 break;	 
	 case 4:
		 System.out.println("SAIR");
		 System.out.println("Sistema estoque encerrado.");
		 break;	 
		 
	 }
			
	 System.out.print("\n ==> Nova atividade? Digite S para sim. ");
     continuar = leia.next();
		} while (continuar.equalsIgnoreCase("S"));
			
	     System.out.println("Sistema estoque encerrado.");
	
		
	}
	
	public static String produtoAdd() {
		
		System.out.print("Digite o nome do produto");
		String produto = leia.next();
		System.out.print("Digite a quantidade do produto");
		int qt_produto = leia.nextInt();
		
		String dadosProdutos = String.format(
			    "%-20s | %-5d ",
			    produto,
			    qt_produto
			    
			);
		System.out.println("\n+---------------ESTOQUE MIL GRAU------------+");
		System.out.println("\n+----------------------+-------+------------+");
		System.out.printf("| %-20s | %-5s    %n",
		        "Produto", "Quantidade");
		produtos.add(dadosProdutos);
		for (String dadosProduto : produtos) {
		    System.out.println("| " + dadosProduto );
		}
		
		return produto;
	}
	public static void alterarQuantidade(String nomeProduto, int novaQuantidade) {

	    for (int index = 0; index < produtos.size(); index++) {

	        String item = produtos.get(index);

	        String[] dados = item.split("\\|");

	        String nome = dados[0].trim();

	        if (nome.equalsIgnoreCase(nomeProduto)) {

	            String produtoAtualizado = String.format(
	                "%-20s | %-5d",
	                nome,
	                novaQuantidade
	            );

	            produtos.set(index, produtoAtualizado);

	            System.out.println("Quantidade atualizada com sucesso!");
	            return;
	        }
	    }

	    System.out.println("Produto não encontrado.");
	}

}
