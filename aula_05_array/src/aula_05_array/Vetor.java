package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Vetor inicializado com dados
		Scanner leia = new Scanner(System.in);
		
		int vetorInteiros[] = {10, 20, 70, 45, 78, 100};
		
		// Vetor Vazio
		float vetorReal[] = new float [5];
		
		
		//Listar todos os dados do vetor inteiros
		
		for (int contador = 0; contador < vetorInteiros.length; contador++) {
			System.out.printf("vetorInteiros[%d] = %d\n", contador, vetorInteiros[contador]);
		}
		
		for (int contador = 0; contador < vetorReal.length; contador++) {
			System.out.printf("Digite um valor para posição %d: \n", contador);
			vetorReal[contador] = leia.nextFloat();
		}
		
		Arrays.sort(vetorReal);
		
		
		for (int contador=0;contador<vetorReal.length; contador++) {
			System.out.printf("vetorReal[%d] = %.2f\n", contador, vetorReal[contador]);
		}
		System.out.println("Tamanho o vetor inteiros: " + vetorInteiros.length);
		System.out.println("Tamanho o vetor Reais: " + vetorReal.length);
		
		
		leia.close();
	}

}
 