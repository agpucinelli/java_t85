package aula_05_array;

import java.util.Scanner;

public class exercicio_01_aula05_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int vetorNumero[] = {2,5,1,3,4,9,7,8,10,6};		
		int numero;
		int index;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Digite o numero que deseja encontrar: ");
		numero = leia.nextInt();
		
		for(index = 0; index < vetorNumero.length; index++) {
			if(numero == vetorNumero[index]) {
				System.out.println("O número "+ numero +" está localizado na posição: " + index);
				break;
			}

		}
		if(index == vetorNumero.length) {
			System.out.println("Não foi encontrado");
		}
		
		
		
		leia.close();
	}

}
