package ecommerce.model;

public class livros extends infoLivros{

    public livros(String nomeLivro, Double preco, String genero, long id) {
        super(nomeLivro, preco, genero, id);
    }

    public void exibirLivros() {
        System.out.println("\nID do livro: " + this.getId());
        System.out.println("\nNome do livro: " + this.getNomeLivro());
        System.out.println("\nGênero do livro: " + this.getGenero());
        System.out.println("\nPreço do produto: " + this.getPreco());
    }

    public void exibirCarrinho() {
        System.out.println("\nId do livro: " + this.getId());
        System.out.println("\nNome do livro: " + this.getNomeLivro());
        System.out.println("\nGênero do livro: " + this.getGenero());
        System.out.println("\nPreço do livro: " + this.getPreco());
    }
}
