package ecommerce.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ecommerce.model.cadastro;
import ecommerce.model.infoLivros;
import ecommerce.model.livros;
import ecommerce.repository.livrariaRepository;

public class Controller implements livrariaRepository {

    private List<cadastro> clientes;
    private Map<Long, infoLivros> catalogoLivros;

    public Controller() {
        this.clientes = new ArrayList<>();
        this.catalogoLivros = new HashMap<>();
    }

    @Override
    public void realizarCadastro(cadastro clientes) {
        this.clientes.add(clientes);
        System.out.println("\nCadastro realizado com sucesso para o cliente: " + clientes.getNome());
    }

    @Override
    public void exibirCartao(cadastro clientes) {
        System.out.println("\nInformação do cartão do cliente " + clientes.getNome() + ":");
    }

    @Override
    public void exibirCadastro(cadastro clientes) {
        // Implementação para exibir detalhes do cadastro do cliente
        System.out.println("Detalhes do cadastro do cliente " + clientes.getNome() + ":");
        // Simulação de exibição de detalhes do cadastro
    }

    @Override
    public void exibirLivros(infoLivros livro) {
        livros livroExibir = (livros) livro;
        livroExibir.exibirLivros();
    }

    @Override
    public void exibirCarrinho(infoLivros livro) {
        livros livroExibir = (livros) livro;
        livroExibir.exibirCarrinho();
    }

    // Método para adicionar livros ao catálogo
    public void adicionarLivro(infoLivros livro) {
        this.catalogoLivros.put(livro.getId(), livro);
        System.out.println("Livro adicionado ao catálogo com sucesso: " + livro.getNomeLivro());
    }

    // Método para remover livros do catálogo
    public void removerLivro(long id) throws LivroNaoEncontradoException {
        if (!this.catalogoLivros.containsKey(id)) {
            throw new LivroNaoEncontradoException("Livro com ID " + id + " não encontrado no catálogo.");
        }
        this.catalogoLivros.remove(id);
        System.out.println("Livro removido do catálogo com sucesso.");
    }

    // Método para listar todos os livros no catálogo
    public void listarLivros() {
        System.out.println("Lista de livros no catálogo:");
        for (infoLivros livro : this.catalogoLivros.values()) {
            livros livroExibir = (livros) livro;
            livroExibir.exibirLivros(); // Exibe informações básicas do livro
        }
    }

    // Método para buscar um livro pelo ID no catálogo
    public infoLivros buscarLivro(long id) throws LivroNaoEncontradoException {
        if (!this.catalogoLivros.containsKey(id)) {
            throw new LivroNaoEncontradoException("Livro com ID " + id + " não encontrado no catálogo.");
        }
        return this.catalogoLivros.get(id);
    }
}

