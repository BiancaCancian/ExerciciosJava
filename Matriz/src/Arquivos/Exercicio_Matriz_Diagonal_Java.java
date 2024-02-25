// Somar matriz 3x3

package Arquivos;

import java.util.Scanner;

public class Exercicio_Matriz_Diagonal_Java {
	
	public static void main(String[] args) {
		
		Scanner objetoNumero = new Scanner(System.in);
		
		int[][] numeros = new int[3][3];
		
		//for - para
		//percorre linha por linha
		//prenchendo os valores da matriz
		for(int linha = 0; linha < 3; linha++) {
			
			//percorre coluna por coluna
			for(int coluna = 0; coluna < 3; coluna++) {
				
				System.out.println("Digite um número na linha:  " + linha + " - coluna: " + coluna + ": ");
				numeros[linha][coluna] = objetoNumero.nextInt();
				
			}
			
		}
		
		int soma = 0;
		
		//Imprimindo os valores da matriz
		for(int linha = 0; linha < 3; linha++) {
					
					//percorre coluna por coluna
			for(int coluna = 0; coluna < 3; coluna++) {
						
				System.out.print(numeros[linha][coluna] + "  " );
				
				soma = numeros[0][0] + numeros[1][1] + numeros[2][2]; 
				
			}
			
			//pulo a linha
			System.out.println(" ");
					
		}
		
		    System.out.println("\nImprimir numeros diagonal");
		    System.out.print(numeros[0][0] + "  ");
		    System.out.print(numeros[1][1] + "  ");
		    System.out.print(numeros[2][2] + "  ");
		    System.out.print("Soma da diagonal: " + soma);
			
		
		
	}

}
