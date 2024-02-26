package introducao;

import java.util.Scanner;

public class ExercicioSalario {

	public static void main(String[] args) {
		float Salario;
		float Abono;
		float Novosalario;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite salario: ");
		Salario=leia.nextFloat();
		System.out.println("Digite Abono: ");
		Abono=leia.nextFloat();
		Novosalario=(Salario+Abono);
		System.out.println("Novosalario:" + Novosalario);
		
		
		
		

	}

}
