package ArrayJava;

public class Array {
	
	public static void main(String[] args) {
		
		int n1, n2, n3, n4, n5;
		
		n1 = 10;
		n2 = 18;
		n3 = 31;
		n4 = 15;
		n5 = 56;
		
		System.out.println("Exemplo com variaveis");
		System.out.println("Numero 1: " + n1);
		System.out.println("Numero 2: " + n2);
		System.out.println("Numero 3: " + n3);
		System.out.println("Numero 4: " + n4);
		System.out.println("Numero 5: " + n5);
		
		
		/*
		 Array é semelhante a criação de varias variaveis
		 ele faz a mesma coisa / função
		 
		 [] - significa que estou criando um array
		 new - Significa que vou instanciar da classe int
		 */
		//array 5 posições
		int[ ] numeros = new int [5];
		
		numeros[0] = 19;
		numeros[1] = 15;
		numeros[2] = 14;
		numeros[3] = 13;
		numeros[4] = 15;
		
		System.out.println("\nImprimindo o array\n\n");
		System.out.println("Posição 0: " + numeros[0]);
		System.out.println("Posição 1: " + numeros[1]);
		System.out.println("Posição 2: " + numeros[2]);
		System.out.println("Posição 3: " + numeros[3]);
		System.out.println("Posição 4: " + numeros[4]);
		
		//------------------------------------------
		
		//criando array de letras e prenchendo os itens 
		//direto de dentro do array
		String[] letras = {"a", "b", "c", "d", "e"};
		
		System.out.println("\nImprimindo o array de letras\n\n");
		System.out.println("Posição 0: " + letras[0]);
		System.out.println("Posição 1: " + letras[1]);
		System.out.println("Posição 2: " + letras[2]);
		System.out.println("Posição 3: " + letras[3]);
		System.out.println("Posição 4: " + letras[4]);
		
		//------------------------------------------
		
		// usar for quando a lista de array for grande
		String[] animais = {"Ave", "Elefante", "Macaco", "Javali"};
		
		for(int posicao = 0; posicao < 4; posicao++ ) {
			
			System.out.println("Animal posição: " + posicao + " : " + animais[posicao]);
			
		}
		
	}
	
}
