package ComandosDecisaoJava;

import javax.swing.JOptionPane;

public class IF_ElSE_ELSE_OU_E {
	
	public static void main(String[] args) {
		
		/*
		 || - OU
		 && - E
		 */
		
		/*
		String fruta;
		
		//ctrl + barra espaço - importou
		fruta = JOptionPane.showInputDialog("Digite o nome da fruta: ");
		
		//if - se
		
		if(fruta.equals("Maça") || fruta.equals("Banana") ) {
			
			JOptionPane.showMessageDialog(null, "A fruta é " + fruta);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "A fruta é invalida ");
			
			
		}*/
		
		// && - e
		
		String fruta_1, fruta_2;
		
		
		//recebendo o nome das frutas e armazenando nas variave
		fruta_1 = JOptionPane.showInputDialog("Digite o nome da primeira fruta");
		fruta_2 = JOptionPane.showInputDialog("Digite o nome da segunda fruta");
		
		if(fruta_1.equals("Maça")&& fruta_2.equals("Banana")) {
			
			JOptionPane.showMessageDialog(null, "Fruta 1: " + fruta_1);
			JOptionPane.showMessageDialog(null, "Fruta 2: " + fruta_2);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Não é maçã ou banana " );
			
		}
		
		
	}

}
