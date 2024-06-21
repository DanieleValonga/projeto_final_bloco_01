package ecommerce;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import ecommerce.exceptions.produtoNaoEncontradoException;
import ecommerce.controller.Controller;
import ecommerce.model.Cadastro;
import ecommerce.model.clientes;
import ecommerce.model.livros;
import ecommerce.util.cores;

public class menu {

	public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Controller controller = new Controller();

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
            System.out.println("\n3. Gestão Livros");
            System.out.println("\n4. Carrinho de compras");
            System.out.println("\n5. Listar pedidos");
            System.out.println("\n6. checkout de comprar");
            System.out.println("\n7. Sair");

            System.out.print("\nEscolha uma opção: ");
            op = leia.nextInt();



            if (op == 7) {
            	System.out.println(cores.TEXT_PURPLE_BOLD + "\nObrigada por visitar Refúgio Literário, espero que volte sempre!");
                sobre();
				leia.close();
				System.exit(0);
            }

            System.out.println(cores.TEXT_RESET);

            switch (op) {
			case 1:
				System.out.println("\n\n\tCadastro");
                realizarCadastro(controller, leia);
				break;

			case 2:
				System.out.println("\n\n\tLogin");
                realizarLogin(controller, leia);
				break;

			case 3:
				System.out.println("\n\n\tGestão Livros");
                gestaoLivros(controller, leia);
                break;

			case 4:
				System.out.println("\n\n\tCarrinho de compras");
                mostrarOpcoesLivros(controller, leia);
                break;

            case 5:
                System.out.println("\n\n\tListar pedidos");
                controller.listarLivros();
                break;

            case 6:
                System.out.println("\n\n\tCheckout de compras");
                controller.exibirCheckout();
                break;

			default:
				System.out.println(cores.TEXT_RED_BOLD + "\nOops, opção Inválida!");
                break;
			}

		}


	}

    private static void realizarCadastro(Controller controller, Scanner leia) {
        leia.nextLine();
        System.out.println("Nome: ");
        String nome = leia.nextLine();
        System.out.println("Telefone: ");
        String telefone = leia.nextLine();
        System.out.println("E-mail: ");
        String email = leia.nextLine();
        System.out.println("Usuário: ");
        String usuario = leia.nextLine();
        System.out.println("Senha: ");
        String senha = leia.nextLine();
        System.out.println("Nome do Cartão: ");
        String nomeCartao = leia.nextLine();
        System.out.println("Dígitos do Cartão: ");
        long digitosCartao = leia.nextLong();

        Cadastro cadastro = new Cadastro(nome, telefone, email, usuario, senha, nomeCartao, digitosCartao);

        controller.realizarCadastro(cadastro);
    }

    private static void realizarLogin(Controller controller, Scanner leia) {
        leia.nextLine();
        System.out.println("Usuário: ");
        String usuario = leia.nextLine();
        System.out.println("Senha: ");
        String senha = leia.nextLine();

        clientes cliente = controller.buscarClientePorUsuarioSenha(usuario, senha);

        if (cliente != null) {
            System.out.println("\nLogin realizado com sucesso.");
            cliente.exibirCadastro();
        }else {
            System.out.println("\nUsuário ou senha incorretos.");
        }
    }

    private static void gestaoLivros(Controller controller, Scanner leia) {
        leia.nextLine();

        List<livros> livrosCadastrados = new ArrayList<>();

        while (true) {
            System.out.println("\nNome do livro (ou '0' para sair): ");
            String nomeLivro = leia.nextLine();
            if (nomeLivro.equals("o")) {
                break;
            }

            System.out.print("Preço: ");
            double preco = leia.nextDouble();
            System.out.print("Quantidade em Estoque: ");
            int quantidadeEstoque = leia.nextInt();
            leia.nextLine();
            System.out.print("Genero: ");
            String genero = leia.nextLine();
            System.out.print("ID: ");
            long id = leia.nextLong();
            leia.nextLine();

            livros novoLivro = new livros(nomeLivro, preco, 0, quantidadeEstoque, genero, id);
            livrosCadastrados.add(novoLivro);
        }

        for (livros p : livrosCadastrados) {
            controller.adicionarLivro(p);
        }
    }

    private static void mostrarOpcoesLivros(Controller controller, Scanner leia) {
        System.out.println("Livros disponíveis: ");
        controller.listarLivros();

        System.out.println("Digite o ID do produto que deseja adicionar ao carrinho: ");
        long idLivro = leia.nextLong();
        System.out.println("Digite a quantidade: ");
        int quantidade = leia.nextInt();

        try {
            livros livro = controller.buscarLivroPorId(idLivro);
            controller.adicionarCarrinho(livro, quantidade);
            System.out.println("Livro adicionado ao carrinho com sucesso!");
        } catch (produtoNaoEncontradoException e) {
            System.out.println("Erro: " + e.getMessage());
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