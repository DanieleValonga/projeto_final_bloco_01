package ecommerce;

import java.util.Scanner;

import ecommerce.model.clientes;
import ecommerce.model.livros;
import ecommerce.util.cores;

public class menu {

	public static void main(String[] args) {

        clientes c1 = new clientes("Daniele", "987654231", "dani@gmail.com", "dani123", "123danizinha", "Dani SV", 98372676);
        c1.realizarCadastro();
        c1.exibirCartao();
        c1.exibirCadastro();

        livros l1 = new livros("Alto da Compadecida", 44.92, "Ação", 4362);
        l1.exibirLivros();
        l1.exibirCarrinho();

		Scanner read = new Scanner (System.in);

		int op;

		while (true) {
			System.out.println(cores.TEXT_PURPLE_BOLD);
			System.out.println("\nBem vinde ao Refúgio Literário, o seu cantinho da leitura para explorar novos mundos!");
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
            System.out.println("\n5. Sair");

            System.out.print("\nEscolha uma opção: ");
            op = read.nextInt();



            if (op == 5) {
            	System.out.println(cores.TEXT_PURPLE_BOLD + "\nObrigada por visitar Refúgio Literário, espero que volte sempre!");
                sobre();
				read.close();
				System.exit(0);
            }

            System.out.println(cores.TEXT_RESET);

            switch (op) {
			case 1:
				System.out.println("\n\n\tCadastro");
                c1.realizarCadastro();
                System.out.println("\n\n\tDados do Cartão");
                c1.exibirCartao();
				break;

			case 2:
				System.out.println("\n\n\tLogin");
                c1.exibirCadastro();
				break;

			case 3:
				System.out.println("\n\n\tLivros");
                l1.exibirLivros();
                break;

			case 4:
				System.out.println("\n\n\tCarrinho de compras");
                l1.exibirCarrinho();
                break;

			default:
				System.out.println(cores.TEXT_RED_BOLD + "\nOops, opção Inválida!");
                break;
			}

		}


	}

    private static void sobre() {
        System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("\nProjeto Desenvolvido por: Daniele Santos Valonga");
        System.out.println("\nGeneration Brasil - generation@generation.org");
        System.out.println("\nhttps://github.com/DanieleValonga");
        System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
    }

}