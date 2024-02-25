//converter numero decimal em binario

package ExerciciosLogica;

public class Exercicio_7 {
	
	public static void decimalParaBinario(int num) {
		
		//criando um array de inteiros chamado binario com o tamanho de
		//40 elementos. Esta matriz será usada para armazenar os dígitos binários do número convertido.
		int[] binario = new int[40];
		int indice = 0;
		while(num > 0) {
			binario[indice++] = num % 2;
			num = num / 2;
		}
		System.out.println("O número em binario é: ");
		for(int numero = indice -1; numero >= 0; numero--) {
			System.out.println(binario[numero]);
		}
		
	}
	
	public static void main(String[] args) {
		
		int num = 15;
		decimalParaBinario(num);
		
	}

}
