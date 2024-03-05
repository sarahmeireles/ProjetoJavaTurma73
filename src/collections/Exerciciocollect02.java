package collections;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Exerciciocollect02 {

	           public static void main(String[] args) {
		        Queue<String> filaClientes = new LinkedList<>();
		        Scanner scanner = new Scanner(System.in);

		        int opcao;
		        do {
		            System.out.println("\nMenu:");
		            System.out.println("1: Adicionar um novo Cliente na fila");
		            System.out.println("2: Listar todos os Clientes na fila");
		            System.out.println("3: Chamar (retirar) uma pessoa da fila");
		            System.out.println("0: Finalizar o programa");
		            System.out.print("Escolha uma opção: ");
		            opcao = scanner.nextInt();
		            scanner.nextLine(); // Limpar o buffer do scanner

		            switch (opcao) {
		                case 1:
		                    System.out.print("Digite o nome do Cliente: ");
		                    String nomeCliente = scanner.nextLine();
		                    filaClientes.offer(nomeCliente); // Adiciona o cliente na fila
		                    System.out.println("Cliente adicionado à fila.");
		                    break;
		                case 2:
		                    if (filaClientes.isEmpty()) {
		                        System.out.println("A fila está vazia.");
		                    } else {
		                        System.out.println("Clientes na fila:");
		                        for (String cliente : filaClientes) {
		                            System.out.println(cliente);
		                        }
		                    }
		                    break;
		                case 3:
		                    if (filaClientes.isEmpty()) {
		                        System.out.println("A fila está vazia.");
		                    } else {
		                        String clienteChamado = filaClientes.poll(); // Retira o cliente da fila
		                        System.out.println("Cliente " + clienteChamado + " chamado e retirado da fila.");
		                    }
		                    break;
		                case 0:
		                    System.out.println("Programa finalizado.");
		                    break;
		                default:
		                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
		            }
		        } while (opcao != 0);

		        scanner.close();
		    }
		}

	
