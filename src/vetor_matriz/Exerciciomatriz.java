package vetor_matriz;

import java.util.Scanner;

public class Exerciciomatriz {

	public static void main(String[] args) {
		

		
		     // Definindo o tamanho da matriz
		        int participantes = 10;
		        int bimestres = 4;

		        // Criando a matriz para armazenar as notas
		        double[][] notas = new double[participantes][bimestres];

		        // Criando o vetor para armazenar as médias
		        double[] medias = new double[participantes];

		        // Criando um Scanner para entrada de dados
		        Scanner scanner = new Scanner(System.in);

		        // Lendo as notas dos participantes
		        for (int i = 0; i < participantes; i++) {
		            System.out.println("Digite as notas do participante " + (i + 1) + ":");
		            for (int j = 0; j < bimestres; j++) {
		                System.out.print("Nota do bimestre " + (j + 1) + ": ");
		                notas[i][j] = scanner.nextDouble();
		            }
		        }

		        // Calculando as médias dos participantes
		        for (int i = 0; i < participantes; i++) {
		            double soma = 0;
		            for (int j = 0; j < bimestres; j++) {
		                soma += notas[i][j];
		            }
		            medias[i] = soma / bimestres;
		        }

		        // Exibindo as médias dos participantes
		        System.out.println("\nMédias dos participantes:");
		        for (int i = 0; i < participantes; i++) {
		            System.out.println("Participante " + (i + 1) + ": " + medias[i]);
		        }

		       
		        scanner.close();
		    }
		

}


