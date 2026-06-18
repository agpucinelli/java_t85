package aula_05_array;



public class exercicio_04_aula05_vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		;
		
		double vetorSoma = 0;
		double media;
		
		
		double notas[][] = {
				{4.0, 5.0, 7.0, 3.0},
				{2.5, 6.5, 4.7, 8.0},
				{10.0, 8.5, 9.5, 8.0},
				{9.0, 6.5, 7.6, 8.2},
				{5.0, 5.0, 5.0, 6.3},
				{7.0, 8.0, 9.0, 8.5},
				{5.5, 3.5, 2.5, 1.0},
				{8.0, 9.0, 10.0, 9.5},
				{5.6, 5.8, 6.5, 7.0},
				{7.5, 8.5, 9.5, 10.0}		
		};
		
		double[] mediaNota = new double[notas.length];
		
		
		for(int linha = 0; linha < notas.length; linha++) {
			
		
			for(int coluna = 0; coluna < notas[linha].length; coluna++ ) {
				double vetor = notas[linha][coluna] ;
				
				vetorSoma = vetorSoma+vetor;
				
				}
			
			
		media = vetorSoma/4;
		
		
		vetorSoma = 0;
		mediaNota [linha] = media;
		
		
		
		}
		System.out.print("[");

		for (int index = 0; index < mediaNota.length; index++) {
		    System.out.printf("%.1f", mediaNota[index]);

		    if (index < mediaNota.length - 1) {
		        System.out.print(", ");
		    }
		}

		System.out.println("]");
		
		
	}

}
