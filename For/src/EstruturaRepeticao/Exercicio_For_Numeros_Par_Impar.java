// Algoritimo para mostrar apenas par e impar

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_For_Numeros_Par_Impar {
	
	public static void main(String[] args) {
		
		int numero;
		
		numero =Integer.parseInt( JOptionPane.showInputDialog(null, "Digite um número positivo maior que 1", "Leia com atenção!", JOptionPane.QUESTION_MESSAGE));
		
		for(int contador = 1; contador <= numero; contador++ ) {
			
			//% retorna o resto
			if(contador %2 == 1) {
				
				System.out.println(contador);
				
			}
			
		}
		
	}

}
