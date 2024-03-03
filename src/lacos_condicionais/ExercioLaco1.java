package lacos_condicionais;

import java.util.Scanner;

public class ExercioLaco1 {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		System.out.println(" Digite valor  de A: ");
		a= leia.nextInt();
		System.out.println(" Digite valor de B: ");
        b= leia.nextInt();
        System.out.println(" Digite valor de C: ");
		c= leia.nextInt();
		
		
		
		if ( a + b > c) {
			System.out.println("A soma  de A + B é maior que C: ");
		}
		else if (a + b < c ) {
			System.out.println(" A soma de A + B é menor que C: ");
		}
		else {
			System.out.println(" A soma de A + B é igual a C: ");
		}

	}

}
