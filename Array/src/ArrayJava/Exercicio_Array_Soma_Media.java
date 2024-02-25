// Array que soma todos os numeros e calcula a media

package ArrayJava;

public class Exercicio_Array_Soma_Media {
	
	public static void main(String[] args) {
		
		double[] numeros = new double[] {5, 12, 15, 78, 45, 23};
		
		double somaItensArray = 0;
		
		for(int posicao = 0; posicao < numeros.length; posicao++) {
			
			somaItensArray = somaItensArray + numeros[posicao];
			
		}
		
		//Soma itens dividido pela quantidade dos itens
		double media = somaItensArray / numeros.length;
		System.out.println("Soma: " + somaItensArray);
		System.out.println("Total Itens: " + numeros.length);
		System.out.println("Media: " + media);
		
	}

}
