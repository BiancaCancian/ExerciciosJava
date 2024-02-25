// Exercicio login e senha

package ComandosDecisaoJava;

import java.util.Scanner;

public class Exercicio_IF_Login_senha {
	
	public static void main(String[] args) {
		
		Scanner objetoLogin = new Scanner(System.in);
		
		
		//login / nome
		System.out.println("Digite seu nome: ");
		String nome = objetoLogin.nextLine();
		
		
		System.out.println("Digite seu senha: ");
		String senha = objetoLogin.nextLine();
		
		if(nome.equals("Bianca") && senha.equals("fafa") ) {
			
			System.out.printf("Usuario %s logado com sucesso!", nome);
			
		}else {
			
			System.out.println("Usuario ou senha invalida!");
			
		}
		
		
	}

}
