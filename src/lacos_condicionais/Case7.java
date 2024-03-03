package lacos_condicionais;

import java.util.Scanner;

public class Case7 {

	public static void main(String[] args) {
		float numero1,numero2;
		int operacao;
		Scanner leia = new Scanner(System.in);
		System.out.println("insira o primeiro valor");
		numero1 = leia.nextFloat();
		System.out.println("insira o segundo valor");
		numero2 = leia.nextFloat();
		System.out.println("insira 10,0a operacao");
		operacao = leia.nextInt();
		switch (operacao) {
		case 1:{
			System.out.println(numero1 +"+"+ numero2+"="+(numero1+numero2));
			break;
		}
		case 2:{
			System.out.println(numero1 +"-"+ numero2+"="+(numero1-numero2));
			break;
		}
		case 3:{
			System.out.println(numero1 +"x"+ numero2+"="+(numero1*numero2));
			break;
		}
		case 4:{
			System.out.println(numero1 +"/"+ numero2+"="+(numero1/numero2));
			break;
		}
		default:
		System.out.println("operacao invalida");
		}
			
		
			}
		}
		
				
			
				
					
				
			
		
		
	
		
	
		
	
		
			
				
			
		
			
	

		
		
			
		


