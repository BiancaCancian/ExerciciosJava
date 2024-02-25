// Imprimir os valores que constam em ambos os arrays

package ArrayJava;

import java.util.Arrays;
import java.util.HashSet;

public class Exercicio_Array_Ambos_Arrays {
	
	public static void main(String[] args) {
		
		String[] array1 = {"A","B", "C", "D", "E", "F", "B", "A"};
		String[] array2 = {"A","G", "H", "I", "C", "B", "A"};
		
		System.out.println("Array 1: " + Arrays.toString( array1));
		System.out.println("Array 1: " +  Arrays.toString( array2));
		
		//HasSet é uma coleção de itens onde cada item é único
		// e é encontrado no nosso pacote do java.untin
		HashSet<String> itensRepetidos = new HashSet<String>();
		
		for(int contadorArray1 = 0; contadorArray1 <= array1.length - 1; contadorArray1++) {
			
			for(int contadorArray2 = 0; contadorArray2 <= array2.length - 1; contadorArray2++) {
				
				if(array1[contadorArray1].equals(array2[contadorArray2])) {
					
					itensRepetidos.add(array1[contadorArray1]);
					
				}
				
			}
			
			
		}
		
		System.out.println("Itens: " + itensRepetidos);
		
	}

}
