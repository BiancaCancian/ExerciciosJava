package Arquivos;

public class Matriz {
	
	public static void main(String[] args) {
		
		//[][] - matriz
		// [] - array
		//matriz é representada por linhas e colunas
		// primeiro indice é as linhas 
		// segundo indice é as colunas 
		//cada linha da matriz é um array
		// se tivir 8 linhas é 8 arrays
		int[][] numeros = new int [3][4];
		
		//populando a matriz
		// esse for percorre as linhas
		for( int linha = 0; linha < 3; linha++) {
			
			//percorre as colunas
			for( int coluna = 0; coluna < 4; coluna++) {
				
				//estou colocando o valor 5 em cada item da matriz
				numeros[linha][coluna] = 5;
				
				
				
			}
			
		}
		
		    //imprimindo a matriz
		    // esse for percorre as linhas
		    for( int linha = 0; linha < 3; linha++) {
		 	
			//percorre as colunas
			for( int coluna = 0; coluna < 4; coluna++) {
				
				//estou colocando o valor 5 em cada item da matriz
				System.out.print(numeros[linha][coluna] + "  "); 
				
		
			}
			
			System.out.println(" ");
			
		}
		    
		    //----------------//
		    
		    int linhas = 3;
		    int colunas = 4;
		    
		    String[][] matrizLetras = new String[linhas][colunas];
		    String[] array_1 = {"A", "B", "C", "D"};
		    String[] array_2 = {"E", "F", "G", "H"};
		    String[] array_3 = {"X", "P", "L", "M"};
		    
		    matrizLetras[0] = array_1;
		    matrizLetras[1] = array_2;
		    matrizLetras[2] = array_3;
		    
		    //imprimindo a matriz
		    // esse for percorre as linhas
		    for( int linha = 0; linha < linhas; linha++) {
		 	
			//percorre as colunas
			for( int coluna = 0; coluna < colunas; coluna++) {
				
				//estou colocando o valor 5 em cada item da matriz
				System.out.print(matrizLetras[linha][coluna] + "  "); 
				
		
			}
			
			System.out.println(" ");
			
		}
		
		
	}

}
