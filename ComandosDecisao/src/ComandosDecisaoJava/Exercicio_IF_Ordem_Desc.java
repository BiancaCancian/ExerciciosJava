// Ordem desc

package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Exercicio_IF_Ordem_Desc {
	
	public static void main(String[] args) {
		
		int numero1, numero2;
		
		
		//Recebe os numeros e armazena nas variaveis
		numero1 =Integer.parseInt( JOptionPane.showInputDialog("Digite o primeiro número: "));
		numero2 =Integer.parseInt( JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(numero1 >= numero2) {
			
			System.out.println(numero1 + "\n" + numero2);
			
		}else {
			
			System.out.println(numero2 + "\n" + numero1);
			
			
		}
		
	}

}
