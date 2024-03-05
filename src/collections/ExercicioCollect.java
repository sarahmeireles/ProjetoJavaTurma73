package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioCollect {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);
String collections;
		System.out.println(" Digite as Cores");
		
for (int i = 0;i<5;i++) {
	System.out.println("Cor " + (i + 1)+":");
	String cor = leia.nextLine();
	cores.add(cor);
}

System.out.println("Cores Adicionadas:");
for(String cor : cores) {
	System.out.println(cor);
}

Collections.sort(cores);
System.out.println("cores Adicionadas em Ordem Crescente:");
for(String cor : cores) {
	System.out.println(cor);
}

	}


	}


