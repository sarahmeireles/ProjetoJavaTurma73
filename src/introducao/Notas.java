package introducao;
import java.util.Scanner;
public class Notas {

	public static void main(String[] args) {
		int valor;
		int notascem,notascinquenta,notasvinte,notasdez,notascinco,notasdois,notasum;
		
		Scanner leia = new Scanner (System.in);
		System.out.println("insira um valor: ");
		valor= leia.nextInt();
		System.out.println(" ");
		//
		notascem =valor/100;
		valor = valor % 100;
		notascinquenta =valor/50;
		valor = valor % 50;
		notasvinte =valor/20;
		valor = valor % 20;
		notasdez =valor/10;
		valor = valor % 10;
		notascinco =valor/5;
		valor = valor % 5;
		notasdois =valor/2;
		valor = valor % 2;
		notasum =valor/1;
		valor = valor % 1;
		//saida de dados
		System.out.printf("% notas de 100,00%n", notascem);
		System.out.printf("% notas de 50,00%n", notascinquenta);
		System.out.printf("% notas de 20,00%n", notasvinte);
		System.out.printf("% notas de 10,00%n", notasdez);
		System.out.printf("% notas de 5,00%n", notascinco);
		System.out.printf("% notas de 2,00%n", notasdois);
		System.out.printf("% notas de 1,00%n", notasum);
		
		leia.close();
	}

}
