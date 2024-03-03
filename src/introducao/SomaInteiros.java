package introducao;

import java.util.Scanner;

public class SomaInteiros {

	public static void main(String[] args) {
		float a;
		float b;
		float soma;
		float diferenca;
		 float multiplicacao;
		float divisao;
		Scanner leia = new Scanner (System.in);
		System.out.println("Digite primeiro número: ");
		a= leia.nextFloat();
		System.out.println("Digite segundo número: ");
		b= leia.nextFloat();
		soma=(a+b);
		System.out.println("soma dos números é: " + soma);
		diferenca=(a + -b);
		System.out.println("diferença dos números é: " + diferenca);
		multiplicacao= (a*b);
		System.out.println("multiplicação dos números é: " + multiplicacao);
		divisao= (a/b);
		System.out.println("divisão dos números é: " + divisao);
		
		leia.close();
		
	
	}

}
