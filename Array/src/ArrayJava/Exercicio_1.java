package ArrayJava;

public class Exercicio_1 {
	public static int somaArray(int[] array) {
		
		int soma = 0;
		for(int num : array) {
			soma += num;
		}
		
		return soma;
		
	}
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		System.out.println("Soma dos elementos: " + somaArray(array));
		
	}

}
