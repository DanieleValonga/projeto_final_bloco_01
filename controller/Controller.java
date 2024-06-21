package ecommerce.controller;

import java.util.ArrayList;
import java.util.List;
import ecommerce.exceptions.produtoNaoEncontradoException;
import ecommerce.model.Cadastro;
import ecommerce.model.clientes;
import ecommerce.model.infoLivros;
import ecommerce.model.livros;
import ecommerce.repository.livrariaRepository;

public class Controller implements livrariaRepository {

    private List<livros> listaLivros = new ArrayList<>();
    private List<clientes> listaClientes = new ArrayList<>();
    private List<livros> listaCarrinho = new ArrayList<>();

    @Override
    public void realizarCadastro(Cadastro cliente) {
        listaClientes.add((clientes) cliente);
        System.out.println("\nCadastro realizado!");
    }

    @Override
    public void exibirCartao(Cadastro cliente) {
        ((clientes) cliente).exibirCartao();
    }

    @Override
    public void exibirCadastro(Cadastro cliente) {
        ((clientes) cliente).exibirCadastro();
    }

    @Override
    public void exibirGestaoLivro(infoLivros livros) {
        for (livros p : listaLivros) {
            p.exibirGestaoLivro();
        }
    }

    @Override
    public void exibirCarrinho(infoLivros livros) {
        if (listaCarrinho.isEmpty()) {
            System.out.println("\nCarrinho vazio.");
        } else {
            for (livros p : listaCarrinho) {
                p.exibirCarrinho();
            }
        }
    }

    @Override
    public void exibirCheckout() {
        float total = 0;
        if (listaCarrinho.isEmpty()) {
            System.out.println("Carrinho vazio. Nada a pagar.");
            return;
        }

        for (livros p : listaCarrinho) {
            float subtotal = (float) (p.getPreco() * p.getQuantidade());
            System.out.println("\nLivro: " + infoLivros.getNomeLivro() + ", Quantidade: " + p.getQuantidade() + ", subtotal: R$" + subtotal);
            total += subtotal;  // Corrigido para adicionar ao total
        }
        System.out.println("\nTotal da compra: R$" + total);

        realizarPagamento();
    }

    @Override
    public void listarLivros() {
        if (listaLivros.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            for (livros p : listaLivros) {
                System.out.println("ID: " + p.getId());
                System.out.println("Nome: " + infoLivros.getNomeLivro());
                System.out.println("Preço: R$" + p.getPreco());
                System.out.println("Quantidade : " + p.getQuantidadeEstoque());
                System.out.println("Genero: " + p.getGenero());
                System.out.println("********************************************");
            }
        }
    }

    public void adicionarCarrinho(livros livro, int quantidade) throws produtoNaoEncontradoException {
        if (livro == null) {
            throw new produtoNaoEncontradoException("Produto inválido. Não foi possível adicionar ao carrinho.");
        }

        livros livroExistente = buscarLivroPorId(livro.getId());
        if (livroExistente != null) {
            boolean encontrado = false;
            for (livros p : listaCarrinho) {
                if (p.getId() == livro.getId()) {
                    p.setQuantidade(p.getQuantidade() + quantidade);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                livros novoLivro = new livros(
                    infoLivros.getNomeLivro(),
                    livro.getPreco(),
                    livro.getQuantidade(),
                    livro.getQuantidadeEstoque(),
                    livro.getGenero(),
                    livro.getId()
                );
                listaCarrinho.add(novoLivro);
            }
        } else {
            throw new produtoNaoEncontradoException("Livro não encontrado na lista de livros.");
        }
    }

    public livros buscarLivroPorId(long id) {
        for (livros livro : listaLivros) {
            if (livro.getId() == id) {
                return livro;
            }
        }
        return null;
    }

    public clientes buscarClientePorUsuarioSenha(String usuario, String senha) {
        for (clientes cliente : listaClientes) {
            if (cliente.getUsuario().equals(usuario) && cliente.getSenha().equals(senha)) {
                return cliente;
            }
        }
        return null;
    }

    public void realizarPagamento() {
        float total = calcularTotalCarrinho();
        if (total > 0) {
            System.out.println("Total a pagar: R$" + total);
            System.out.println("Pagamento realizado com sucesso!");
            limparCarrinho();
        } else {
            System.out.println("Carrinho vazio. Nada a pagar.");
        }
    }

    private float calcularTotalCarrinho() {
        float total = 0;
        for (livros p : listaCarrinho) {
            float subtotal = (float) (p.getPreco() * p.getQuantidade());
            total += subtotal;
        }
        return total;
    }

    private void limparCarrinho() {
        listaCarrinho.clear();
        System.out.println("Carrinho limpo após o pagamento.");
    }

    public void adicionarLivro(livros livro) {
        listaLivros.add(livro);
    }

    @Override
    public clientes buscarClientesPorUsuarioSenha(String usuario, String senha) {
        throw new UnsupportedOperationException("Unimplemented method 'buscarClientesPorUsuarioSenha'");
    }

    @Override
    public livros buscarProdutosPorId(long id) {
        throw new UnsupportedOperationException("Unimplemented method 'buscarProdutosPorId'");
    }

    public List<livros> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(List<livros> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public List<clientes> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<clientes> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<livros> getListaCarrinho() {
        return listaCarrinho;
    }

    public void setListaCarrinho(List<livros> listaCarrinho) {
        this.listaCarrinho = listaCarrinho;
    }
}