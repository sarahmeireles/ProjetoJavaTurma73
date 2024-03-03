package introducao;
import java.util.Scanner;
public class horasFabrica {

	public static void main(String[] args) {
		int valor,horas,minutos,segundos;
		Scanner leia = new Scanner(System.in);
		System.out.println("insira o valor em segundos");
		valor= leia.nextInt();
		horas= valor /3600;
		valor= valor %3600;
		minutos=valor/60;
		valor=valor%60;
		segundos=valor;
		leia.close();
		System.out.println("\n valor formatado:" + horas +":" + minutos+":"+segundos);
		
		
		
		

	}

}
