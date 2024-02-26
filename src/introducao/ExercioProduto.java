package introducao;
import java.util.Scanner;
public class ExercioProduto {

	public static void main(String[] args) {
		float n1,n2,n3,n4;
		float diferenca;
		Scanner leia = new Scanner (System.in);
		System.out.print(" Digite primeiro numero:");
        n1=leia.nextFloat();
        System.out.print(" Digite segundo numero:");
        n2=leia.nextFloat();
        System.out.print(" Digite terceiro numero:");
        n3=leia.nextFloat();
        System.out.print(" Digite quarto numero:");
        n4=leia.nextFloat();
        diferenca=(n1*n2)-(n3*n4);
        System.out.print("diferenca:" + diferenca);
	}

}
