package laco_repeticao;
import java.util.Scanner;
public class Atividadelaco3 {

	public static void main(String[] args) {
	
		int idade,num1=0,num2=0,num3=0;
		Scanner leia = new Scanner (System.in);
		System.out.println(" Digite sua idade: ");
		idade =leia.nextInt();
		
		while (idade > 0) {
			if (idade <21) {
				num1++;
			}else if (idade>50) {
				num2++;
			}else {
				num3++;
			}
			System.out.println(" Digite sua idade: ");
			idade =leia.nextInt();
		}
		System.out.println(" \ntotal de pessoas menores de 21: "+num1);
		System.out.println(" \ntotal de pessoas menores de 21: "+num2);
		System.out.println(" \ntotal de pessoas menores de 21: "+num3);
	}

}
