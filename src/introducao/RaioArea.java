package introducao;

import java.util.Scanner;

public class RaioArea {

	public static void main(String[] args) {
		double raio,pi,area;
        Scanner leia = new Scanner (System.in);
        System.out.println("insira o valor do raio: ");
        raio = leia.nextDouble();
        area = 3.14159 * (raio * raio);
        leia.close();
        System.out.printf("\n area do circulo: %.4f",area);
        		
	}

}
