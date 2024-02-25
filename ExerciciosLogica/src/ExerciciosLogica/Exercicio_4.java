//Pedindo senha e usuario com JOptionPane

package ExerciciosLogica;

import javax.swing.JOptionPane;

public class Exercicio_4 {
	
	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Digite o seu usuario: ");
		String senha = JOptionPane.showInputDialog("Digite sua senha");
		
		
		if(nome.equals("Bianca") && senha.equals("7887")) {
			
			JOptionPane.showMessageDialog(null, "Logado com sucesso!");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos!");
			
		}
		
		
	}

}
