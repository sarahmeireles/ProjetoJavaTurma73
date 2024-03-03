package lacos_condicionais;

import java.util.Scanner;

public class DoacaoSangue {

	public static void main(String[] args) {
		int idade;
		String nome = "";
		boolean doacao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		nome = leia.nextLine();
		System.out.println("Digite sua idade:");
        idade = leia.nextInt();
        System.out.print("É sua primeira doação? (true/false)");
        doacao=leia.nextBoolean();
        if (idade>= 18 && idade <= 69) {
        	if (idade >= 60 && idade <= 69 && doacao) {
        		System.out.println(" Desculpe,"  + nome +", você não esta apto.");
        	}else {
        		System.out.println( nome+ " Você esta apto.");
        	}
        }
	}

}
