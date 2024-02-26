package introducao;

import java.util.Scanner;

public class EntradaSaida {
// variaveis
	public static void main(String[] args) {
	String nome = "";
	int idade;
	
	// entrada de dados 
	Scanner leia = new Scanner(System.in);
	System.out.print("escreva seu nome:");
    nome=leia.next();
    System.out.print("escreva sua idade:");
   idade=leia.nextInt();
		   

	
	// concatenação: juntar um texto com 1 ou mais variaveis/constantes 
	
	// saida de dados 
	System.out.println(" Bom dia ," + nome);
	System.out.println(" A sua idade é," + idade + " anos.");
	

	

	}

}
