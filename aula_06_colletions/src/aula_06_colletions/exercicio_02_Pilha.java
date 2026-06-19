package aula_06_colletions;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class exercicio_02_Pilha {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner leia = new Scanner(System.in);
		 int option;
		 
		 
		 Deque<String> pilha = new ArrayDeque<String>();
		 String continuar;
		 
		 do {
		 System.out.println("********************MENU**********************\n"
		 		+ "\n"
		 		+ ""
		 		+ "         1 - Adicionar livros a pilha \n"
		 		+ "         2 - Listar livros \n"
		 		+ "         3 - Retirar livros\n"
		 		+ "         0 - Sair\n"
		 		+ ""
		 		+ "**********************************************");
		 
		 System.out.println("Digite a opção desejada: ");
		 
		 option = leia.nextInt();
		 
		 switch(option) {
		 
		 case 1:
			 
			 System.out.println("Digite o nome do livro: ");			
			 pilha.push(leia.next());			 
			 
			 
			 break;
		 case 2:
			 System.out.println(pilha);
			 break;
		 case 3:
			 pilha.pop();
			 break;
		 case 0:
			 
			 break;
		 }
		 System.out.print("Deseja continuar? Digite S para sim ou N para não: ");
         continuar = leia.next();
		 } while (continuar.equalsIgnoreCase("S"));

	     System.out.println("Cadastro encerrada.");
	     leia.close();
		 
	}

}
