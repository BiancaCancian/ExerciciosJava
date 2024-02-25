// Imprimir todos os valores duplicados

package ArrayJava;

public class Exercicio_Array_Valores_Duplicados {
	
	public static void main(String[] args) {
		
		int[] arrayNumeros = {5, 10, 10, 21, 24, 21, 9, 31};
		
		for(int contador_x = 0; contador_x < arrayNumeros.length - 1; contador_x++) {
			
			for(int contador_y = contador_x + 1; contador_y < arrayNumeros.length; contador_y++ ) {
				
				if( (arrayNumeros[contador_x] == arrayNumeros[contador_y] && (contador_x != contador_y)) ) {
					
					System.out.println("Item duplicado: " + arrayNumeros[contador_y]);	
					
				}
				
							
			}
			
		}
		
	}

}
