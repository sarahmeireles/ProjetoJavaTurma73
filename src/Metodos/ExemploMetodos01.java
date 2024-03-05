package Metodos;

public class ExemploMetodos01 {

	public static void main(String[] args) {
	 int resultado=somar(2,5);
	 System.out.println("O resultado é:" + resultado);
	 
	 System.out.println("O segundo resultado é:"+somar(8,3));

	mensagem();
	saudacao("oi,sei lá");
	saudacao("bom dia");
	}

	// valor1+ valor2 =resultado
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	// sem retorno
	public static void mensagem() {
		System.out.println("Olá, turma 73!");
	}
	public static void saudacao(String mensagem) {
		System.out.println(mensagem);
	}
}

