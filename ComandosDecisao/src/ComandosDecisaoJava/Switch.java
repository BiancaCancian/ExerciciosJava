package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class Switch {
	
	public static void main(String[] args) {
		
		String fruta;
		
		//recebendo o nome da fruta e armazenando na variavel
		fruta = JOptionPane.showInputDialog("Digite o nome de uma fruta");
		
		//ele avalia o valor de uma variavel e dependendo
		//do resultado ele entra em um caso e executa a ação
		switch(fruta) {
		
		//caso
		case "Banana":
			
			System.out.println("Você digitou Banana!");
			
			//encerrar
			break;
			
        case "Laranja":
			
			System.out.println("Você digitou Laranja!");
			
			//encerrar
			break;
			
			
        case "Uva":
			
			System.out.println("Você digitou Uva!");
			
			//encerrar
			break;
			
		default:
			
			System.out.println("Você não digitou uma fruta valida!");
			
			break;
		
		
		}
		
	}

}
