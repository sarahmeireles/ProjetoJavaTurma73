package lacos_condicionais;

import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) {
	int quantidade,codigo;
	float valorTotal;
	
		Scanner leia= new Scanner(System.in);
	    System.out.print("cod do produto: ");
	    codigo= leia.nextInt();
	    switch (codigo) {
	    
	    case 1:
	    System.out.print("quantidade");
	    quantidade=leia.nextInt();
	    valorTotal=quantidade*10f;
	    System.out.println("produto: hot dog");
	    System.out.printf("valor total: %.2f",valorTotal);
	    break;
	    
	    case 2:
		    System.out.print("quantidade");
		    quantidade=leia.nextInt();
		    valorTotal=quantidade*15f;
		    System.out.println("produto: x salada");
		    System.out.println("valor total:" + valorTotal);
		    break;
		    
	    case 3:
	    	 System.out.print("quantidade");
			    quantidade=leia.nextInt();
			    valorTotal=quantidade*18f;
			    System.out.println("produto: x bacon");
			    System.out.println("valor total:" + valorTotal);
			    break;
	    case 4:
			    System.out.print("quantidade");
			    quantidade=leia.nextInt();
			    valorTotal=quantidade*12f;
			    System.out.println("produto: bauru");
			    System.out.println("valor total:" + valorTotal);
			    break;
			    
	    case 5:
		    System.out.print("quantidade");
		    quantidade=leia.nextInt();
		    valorTotal=quantidade*8f;
		    System.out.println("produto: refrigerante");
		    System.out.println("valor total:" + valorTotal);
		    break;
			    
	    case 6:
		    System.out.print("quantidade");
		    quantidade=leia.nextInt();
		    valorTotal=quantidade*13f;
		    System.out.println("produto: suco de laranja");
		    System.out.println("valor total:" + valorTotal);
		    break;
		    
		    	
	    }

	}

}
