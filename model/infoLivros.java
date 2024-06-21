package ecommerce.model;

public class infoLivros {

    private static String nomeLivro;
    private Double preco;
    private int quantidade;
    private int quantidadeEstoque;
    private String genero;
    private long id;

    public infoLivros(String nomeLivro, Double preco, int quantidade, int quantidadeEstoque, String genero, long id) {
        super();
        infoLivros.nomeLivro = nomeLivro;
        this.preco = preco;
        this.genero = genero;
        this.id = id;
        this.quantidade = quantidade;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public static String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        infoLivros.nomeLivro = nomeLivro;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
