package laco_repeticao;
import java.util.Scanner;
public class Atividadelaco {

	public static void main(String[] args) {
		int primeiro,segundo,multiplo;
	
		Scanner leia = new Scanner(System.in);
		System.out.println(" Digite o primeiro  numero: ");
		primeiro= leia.nextInt();
		System.out.println(" Digite o ultimo numero: ");
		segundo= leia.nextInt();
		
		if (primeiro>=segundo) {
			System.out.println(" intervalo inválido. O primeiro número deve ser menor que o segundo ");
			return;
		}
		System.out.println(" no intervalo entre " + primeiro +" e " + segundo+":");
		for(multiplo=primeiro;multiplo<=segundo;multiplo++) {
			if(multiplo%3==0&&multiplo%5==0) {
				System.out.println( multiplo+" é multiplo de 3 e 5 " );
			}
		}
	}

}
