// Diferença entre dois números

package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Exercicio_IF_Diferenca_Entre_2_Numeros {
	
	public static void main(String[] args) {
		
		int numero1, numero2, diferenca;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(numero1 >= numero2) {
			
			diferenca = numero1 - numero2;
			
		}else {
			
			diferenca = numero2 - numero1;
			
		}
		
		System.out.println("------------Resposta Exercicio-----------");
		System.out.println("\n\nNúmero 1: " + numero1);
		System.out.println("Número 2: " + numero2);
		System.out.println("Diferenca: " + diferenca); 
		
	}

}
