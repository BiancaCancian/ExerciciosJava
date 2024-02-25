/*
 
 Crie um algoritmo que solicite ao usuário 
 o nome e a senha e na sequência, verifique 
 se o nome é Bianca e se a senha é 0101 e se for, 
 exiba a mensagem Logado com sucesso!
 
 */

package ExerciciosLogica;

import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main(String[] args) {
		
		
		//abrindo uma caixa no console de pergunta para o usuario
		Scanner scanner = new Scanner(System.in);
		
		//solicitar o nome e senha
		System.out.println("Digite o nome: ");
		//criando a variavel nome do tipo string
		//recebendo o scanner nextline para quebra de linha
		String nome = scanner.nextLine();
		
		System.out.println("Digite a senha: ");
		String senha = scanner.nextLine();
		
		
		//verificar se o nome é Bianca e a senha é 0101
		if(nome.equals("Bianca") && senha.equals("0101")) {
			System.out.println("Logado com sucesso!");
		}else {
			System.out.println("Nome ou senha invalidos, tente novamente!");
		}
		
		scanner.close();
		
	}

}
