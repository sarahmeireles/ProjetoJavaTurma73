package introducao;

import java.util.Scanner;

class SalarioBruto {

	public static void main(String[] args) {
		float Salariobruto;
		float Adicionalnoturno;
		float Horasextras;
		float descontos;
		float Salarioliquido;
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite sálario bruto:");
		Salariobruto=leia.nextFloat();
		System.out.print("Digite adicional noturno:");
		Adicionalnoturno=leia.nextFloat();
		System.out.print("Digite horas extras:");
		Horasextras=leia.nextFloat();
		System.out.print("Digite descontos:");
		descontos=leia.nextFloat();
		Salarioliquido=(Salariobruto+Adicionalnoturno+(Horasextras*5)-descontos );
		System.out.print("Salarioliquido:" + Salarioliquido);
		
		
		

	}

}
