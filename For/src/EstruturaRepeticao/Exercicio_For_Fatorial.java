// Exercicio fatorial

package EstruturaRepeticao;

import javax.swing.JOptionPane;

public class Exercicio_For_Fatorial {
	
	public static void main(String[] args) {
		
		int numero, fatorial;
		
		numero =Integer.parseInt( JOptionPane.showInputDialog(null, "Digite um número inteiro positivo: ", "Leia com atenção", JOptionPane.QUESTION_MESSAGE));
		
		fatorial = 1;
		
		for(int contador = numero; contador >= 1; contador --) {
			
			fatorial = fatorial * contador;
			
		}
		
		System.out.println("O fatorial do " + numero + ": " + fatorial);
		
	}

}
