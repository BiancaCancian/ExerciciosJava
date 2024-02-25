package ArrayJava;

import java.util.Arrays;

public class Array_Aula_2 {
	
	public static void main(String[] args) {
		
		//final é uma constante que vai fixar fixo e pode ser usado em diversar partes
		final int tamanho = 3;
		
		int [] precos = new int[tamanho];
		
		precos[0] = 19;
		precos[1] = 22;
		precos[2] = 65;
		
		System.out.println("Imprimindo array de preços ");
		
		//length é um atributo do array que vai retornar o tamanho do array
		for(int posicao = 0; posicao < precos.length; posicao++) {
			
			System.out.println("Preco: " + posicao + " : " + precos[posicao]);
			
			
		}
		
		//-----------------------
		
		String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H"};
		
		System.out.println("\n\n>>>>> For array letras <<<<<");
		
		//for utilizado como uma opção para ler os itens do array
		for(String l:letras) {
			
			System.out.println(l);
			
		}
		
		
		//-----------------------
		
		 int [] numeros = {22, 54, 654, 345, 3, 23, 23};
				
		 System.out.println("\n\n>>>>> For array numeros <<<<<");
				
		//for utilizado como uma opção para ler os itens do array
		for(int linhas:numeros) {
					
		    System.out.println(linhas);
					
				}
		
		//--------------------
		
		
		//fill - prenche os arrays com um valor pré determinado
		Arrays.fill(numeros, 5);
		
		System.out.println("\n\n>>>>> For array fill <<<<<");
		
		//for utilizado como uma opção para ler os itens do array
		for(int linhas:numeros) {
					
		    System.out.println(linhas);
					
				}
				
		
		//--------------------
		
		
		//fill - prenche os arrays com um valor pré determinado
		Arrays.fill(letras, "B");
				
		System.out.println("\n\n>>>>> For array Letras fill <<<<<");
				
		//for utilizado como uma opção para ler os itens do array
		for(String linhas: letras) {
							
		   System.out.println(linhas);
							
						}
		
	}

}
