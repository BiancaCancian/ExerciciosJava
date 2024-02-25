// exercicio maior e menor numero

package Estrutura_Repeticao;

import javax.swing.JOptionPane;

public class Exercicio_While_Maior_Menor {
	
	public static void main(String[] args) {
		
		int numeroDigitado, maior, menor;
		boolean primeiro = true;
		
		numeroDigitado =Integer.parseInt( JOptionPane.showInputDialog(null, "Digite um número: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
		
		menor = numeroDigitado;
		maior = numeroDigitado;
		
		//while - enquanto
		
		while(numeroDigitado >= 0) {
			
			numeroDigitado =Integer.parseInt( JOptionPane.showInputDialog(null, "Digite um número: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
			
			if(numeroDigitado > maior) {
				
				maior = numeroDigitado;
				
			}
               if(numeroDigitado < menor && numeroDigitado >= 0) {
				
				menor = numeroDigitado;
				
               }
		}
		
		System.out.println("Menor número: " + menor);
		System.out.println("Maior número: " + maior);
		
	}

}
