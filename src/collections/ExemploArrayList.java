package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		// Criando a collection
		ArrayList<Double> notas = new ArrayList<Double>();
		Scanner leia = new Scanner (System.in);
		double numero;
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);
		
		
		System.out.println("\n Notas cadastradas: " + notas);
		
		System.out.println(" Digite o numero que deseja procurar:");
		numero= leia.nextDouble();
		
		System.out.println( " A posição da nota é:" + notas.indexOf(numero));
		
		leia.close();
	}
	

}
