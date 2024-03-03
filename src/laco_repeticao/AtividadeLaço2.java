package laco_repeticao;
import java.util.Scanner;
public class AtividadeLaço2 {

	public static void main(String[] args) {
		int num;
		int finalnumero=0;
		
		Scanner leia = new Scanner (System.in);
		
				do {
					System.out.println(" digite um numero inteiro ");
					num=leia.nextInt();
					if(num>0) {
					finalnumero+=num;
					}
					
				}while (num !=0);
				System.out.println(" a soma dos numeros positivos é "+ finalnumero);
	}

}
