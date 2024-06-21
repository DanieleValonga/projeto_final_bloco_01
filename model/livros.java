package ecommerce.model;

public class livros extends infoLivros{

    public livros(String nomeLivro, Double preco, int quantidade, int quantidadeEstoque, String genero, long id) {
        super(nomeLivro, preco, quantidade, quantidadeEstoque, genero, id);
    }

    public void exibirGestaoLivro() {
        System.out.println("\nID do livro: " + this.getId());
        System.out.println("\nNome do livro: " + infoLivros.getNomeLivro());
        System.out.println("\nGênero do livro: " + this.getGenero());
        System.out.println("\nPreço do livro: " + this.getPreco());
        System.out.println("\nQuantidade: " + this.getQuantidade());
        System.out.println("\nQuantidade em estoque: " + this.getQuantidadeEstoque());
    }

    public void exibirCarrinho() {
        System.out.println("\nId do livro: " + this.getId());
        System.out.println("\nNome do livro: " + infoLivros.getNomeLivro());
        System.out.println("\nGênero do livro: " + this.getGenero());
        System.out.println("\nPreço do livro: " + this.getPreco());
        System.out.println("\nQuantidade: " + this.getQuantidade());
        System.out.println("\nQuantidade em estoque: " + this.getQuantidade());
    }

    public void exibirCheckout() {
        System.out.println("\nID do livro: " + this.getId());
        System.out.println("\nNome do livro: " + infoLivros.getNomeLivro());
        System.out.println("\nGênero: " + this.getGenero());
        System.out.println("\nPreço do livro: " + this.getPreco());
        System.out.println("\nQuantidade em estoque: " + this.getQuantidade());
        System.out.println("\nValor total: R$ " + this.getQuantidade()*this.getPreco());
        System.out.println("\nProsseguir para pagamento.");
    }

    public void exibirPedidos() {
        System.out.println("\nID do livro: " + this.getId());
        System.out.println("\nNome do livro: " + infoLivros.getNomeLivro());
        System.out.println("\nGênero do livro: " + this.getGenero());
        System.out.println("\nPreço do livro: " + this.getPreco());
        System.out.println("\nQuantidade em estoque: " + this.getQuantidade());
        System.out.println("\nValor total: R$ " + this.getQuantidade());
        System.out.println("\nProsseguir para pagamento.");
    }
}
