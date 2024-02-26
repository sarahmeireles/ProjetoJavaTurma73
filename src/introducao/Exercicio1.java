package introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		float n1,n2,n3,n4;
		float Media;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite Primeira Nota:");
		n1=leia.nextFloat();
		System.out.println("Digite Segunda Nota:");
		n2=leia.nextFloat();
		System.out.println("Digite Terceira Nota:");
		n3=leia.nextFloat();
		System.out.println("Digite Quarta Nota:");
		n4=leia.nextFloat();
		Media=(n1+n2+n3+n4)/4;
System.out.println("Media:" + Media );

	}

}
