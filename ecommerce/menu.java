package ecommerce;

import java.util.Scanner;
import ecommerce.util.cores;

public class menu {

	public static void main(String[] args) {

		Scanner read = new Scanner (System.in);

		int op;

		while (true) {
			System.out.println(cores.TEXT_PURPLE_BOLD);
			System.out.println("\nBem vinde ao Refúgio Literário, o seu cantinho da leitura, onde os livros te levam para outros mundos!");
			System.out.println(cores.TEXT_BLACK);
			System.out.println("**************************************************");
			System.out.println(cores.TEXT_PURPLE_BOLD);
            System.out.println("\t\tOPÇÕES");
            System.out.println(cores.TEXT_BLACK);
            System.out.println("**************************************************");
            System.out.println("\n1. Cadastro");
            System.out.println("\n2. Login");
            System.out.println("\n3. Livros");
            System.out.println("\n4. Carrinho de compras");
            System.out.println("\n5. Visualizar carrinho");
            System.out.println("\n6. Sair");

            System.out.print("\nEscolha uma opção: ");
            op = read.nextInt();



            if (op == 6) {
            	System.out.println(cores.TEXT_PURPLE_BOLD + "\nObrigada por visitar Refúgio Literário, espero que volte sempre!");
				read.close();
				System.exit(0);
            }

            System.out.println(cores.TEXT_RESET);

            switch (op) {
			case 1:
				System.out.println("\nCadastro");
				break;

			case 2:
				System.out.println("\nLogin");
				break;

			case 3:
				System.out.println("\nLivros");
                break;

			case 4:
				System.out.println("\nCarrinho de compras");
                break;

			case 5:
				System.out.println("\nVisualizar Carrinho");
               	break;

			default:
				System.out.println(cores.TEXT_RED_BOLD + "\nOops, opção Inválida!");
                break;
			}

		}


	}

}