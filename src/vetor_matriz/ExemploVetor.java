package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		String cachorros[] = new String[3];
		
		Scanner leia = new Scanner(System.in);
		int indice;
		// 0["laika"] 1["sandy"] 2["spike"]
		// Guarda os nomes 
		for (indice= 0; indice < 3; indice++) {
			// atalho sysout ctrl+espaço
			System.out.println(" Digite o " + (indice + 1) + "° nome:");
			cachorros[indice] = leia.nextLine();
			}
		// lista os nomes saida
		for (indice = 0; indice <3; indice++) {
			System.out.println("cachorros[" + indice + "]:" + cachorros[indice]);
			
		}
	}

	
}
