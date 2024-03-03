package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
	
		int idade;
		boolean carteiraM;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println(" Digite sua idade:");
		idade = leia.nextInt();
		System.out.println("Você tem carteira de habilitação? (true/false)");
		carteiraM =leia.nextBoolean();
		if (idade >= 18 && carteiraM == true) {
			System.out.println("pode dirigir!");
			
		}else {
			System.out.println("Não pode dirigir: (");
		} 
		
		//exemplo2//
		//media pra passa de ano é 6
		// entre 5 é exame menor reprovado
		
	/*	 float nota1,nota2,media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" Digite a primeira nota: ");
	    nota1 = leia.nextFloat();
		System.out.println(" Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		media = (nota1+nota2)/2;
		
		if (media>=6) {
			System.out.println("Parabéns,aprovado: ");
			
		}
		else if (media <=5) {
			System.out.println(" Está de exame: ");
		}
		else {
			System.out.println(" Está reprovado: ");
		} */
		
	}

}
