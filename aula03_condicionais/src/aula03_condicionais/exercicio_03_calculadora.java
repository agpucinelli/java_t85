package aula03_condicionais;

import java.util.Scanner;

public class exercicio_03_calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1,n2,nf;
		int operador;
		String op = null;
		String continuar;
		
		Scanner leia = new Scanner(System.in);
		
		do {
		
		System.out.println("**************************");
		System.out.println("*        CALCULADORA     *");
		System.out.println("**************************");
		System.out.println("*  ____________________  *");
		System.out.println("* |  0.00              | *");
		System.out.println("* |____________________| *");
		System.out.println("*                        *");
		System.out.println("*   [7] [8] [9]   [+]   *");
		System.out.println("*   [4] [5] [6]   [-]   *");
		System.out.println("*   [1] [2] [3]   [x]   *");
		System.out.println("*   [0] [.] [=]   [/]   *");
		System.out.println("*                        *");
		System.out.println("**************************");
		
		System.out.println("Digite o primeiro número:");
		n1 = leia.nextDouble();
		System.out.println("**************************");
		System.out.println("*        CALCULADORA     *");
		System.out.println("**************************");
		System.out.println("*  ____________________  *");
		System.out.println("* |  " +n1 +"             *");
		System.out.println("* |____________________| *");
		System.out.println("*                        *");
		System.out.println("*   [7] [8] [9]   [+]   *");
		System.out.println("*   [4] [5] [6]   [-]   *");
		System.out.println("*   [1] [2] [3]   [x]   *");
		System.out.println("*   [0] [.] [=]   [/]   *");
		System.out.println("*                        *");
		System.out.println("**************************");
		
		System.out.println("Digite a operação:");
		System.out.println("--Digite 1 para     [+]   *");
		System.out.println("--Digite 2 para     [-]   *");
		System.out.println("--Digite 3 para     [x]   *");
		System.out.println("--Digite 4 para     [/]   *");
		operador = leia.nextInt();
		switch(operador) {
		case 1:
			op="+";
			System.out.println("**************************");
			System.out.println("*        CALCULADORA     *");
			System.out.println("**************************");
			System.out.println("*  ____________________  *");
			System.out.println("* |  " +n1 +"+             *");
			System.out.println("* |____________________| *");
			System.out.println("*                        *");
			System.out.println("*   [7] [8] [9]   [+]   *");
			System.out.println("*   [4] [5] [6]   [-]   *");
			System.out.println("*   [1] [2] [3]   [x]   *");
			System.out.println("*   [0] [.] [=]   [/]   *");
			System.out.println("*                        *");
			System.out.println("**************************");
			break;
		case 2:
			op="-";
			System.out.println("**************************");
			System.out.println("*        CALCULADORA     *");
			System.out.println("**************************");
			System.out.println("*  ____________________  *");
			System.out.println("* |  " +n1 +"-             *");
			System.out.println("* |____________________| *");
			System.out.println("*                        *");
			System.out.println("*   [7] [8] [9]   [+]   *");
			System.out.println("*   [4] [5] [6]   [-]   *");
			System.out.println("*   [1] [2] [3]   [x]   *");
			System.out.println("*   [0] [.] [=]   [/]   *");
			System.out.println("*                        *");
			System.out.println("**************************");
			break;
		case 3:
			op="x";
			System.out.println("**************************");
			System.out.println("*        CALCULADORA     *");
			System.out.println("**************************");
			System.out.println("*  ____________________  *");
			System.out.println("* |  " +n1 +"x             *");
			System.out.println("* |____________________| *");
			System.out.println("*                        *");
			System.out.println("*   [7] [8] [9]   [+]   *");
			System.out.println("*   [4] [5] [6]   [-]   *");
			System.out.println("*   [1] [2] [3]   [x]   *");
			System.out.println("*   [0] [.] [=]   [/]   *");
			System.out.println("*                        *");
			System.out.println("**************************");
			break;
		case 4:
			op="/";
			System.out.println("**************************");
			System.out.println("*        CALCULADORA     *");
			System.out.println("**************************");
			System.out.println("*  ____________________  *");
			System.out.println("* |  " +n1 +"/             *");
			System.out.println("* |____________________| *");
			System.out.println("*                        *");
			System.out.println("*   [7] [8] [9]   [+]   *");
			System.out.println("*   [4] [5] [6]   [-]   *");
			System.out.println("*   [1] [2] [3]   [x]   *");
			System.out.println("*   [0] [.] [=]   [/]   *");
			System.out.println("*                        *");
			System.out.println("**************************");
			break;
		}
		
		
		System.out.println("Digite o segundo número:");
		n2 = leia.nextDouble();
			if(op=="+") {
				nf = n1+n2;
			}else if(op=="-") {
				nf = n1-n2;
			}else if(op=="x") {
				nf = n1*n2;
			}else {
				nf = n1/n2;
			}
		
			
		System.out.println("**************************");
		System.out.println("*        CALCULADORA     *");
		System.out.println("**************************");
		System.out.println("*  ____________________  *");
		System.out.println("* |  " +n1 +" "+ op +" "+  n2 +" =\n\n     " +nf+"       ");
		System.out.println("* |____________________| *");
		System.out.println("*                        *");
		System.out.println("*   [7] [8] [9]   [+]   *");
		System.out.println("*   [4] [5] [6]   [-]   *");
		System.out.println("*   [1] [2] [3]   [x]   *");
		System.out.println("*   [0] [.] [=]   [/]   *");
		System.out.println("*                        *");
		System.out.println("**************************");
		
		System.out.println("**************************");
		
		
		 System.out.println();
         System.out.print("Deseja reiniciar a calculadora? Digite S para sim ou N para não: ");
         continuar = leia.next();

     } while (continuar.equalsIgnoreCase("S"));

     System.out.println("Calculadora encerrada.");
     leia.close();

	}

}
