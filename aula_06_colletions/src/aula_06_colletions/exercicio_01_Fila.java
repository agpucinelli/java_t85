package aula_06_colletions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio_01_Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner leia = new Scanner(System.in);
		 int option;
		 
		 
		 Queue<String> fila = new LinkedList<String>();
		 String continuar;
		 
		 do {
		 System.out.println("********************MENU**********************\n"
		 		+ "\n"
		 		+ ""
		 		+ "         1 - Adicionar Cliente na fila \n"
		 		+ "         2 - Listar todos os Clientes \n"
		 		+ "         3 - Retirar Cliente da Fila\n"
		 		+ "         0 - Sair\n"
		 		+ ""
		 		+ "**********************************************");
		 
		 System.out.println("Digite a opção desejada: ");
		 
		 option = leia.nextInt();
		 
		 switch(option) {
		 
		 case 1:
			 
			 System.out.println("Digite o nome do cliente: ");			
			 fila.add(leia.next());			 
			 
			 
			 break;
		 case 2:
			 System.out.println(fila);
			 break;
		 case 3:
			 fila.remove();
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
