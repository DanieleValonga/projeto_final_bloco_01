package ecommerce.model;

public class infoLivros {

    private String nomeLivro;
    private Double preco;
    private String genero;
    private long id;

    public infoLivros(String nomeLivro, Double preco, String genero, long id) {
        super();
        this.nomeLivro = nomeLivro;
        this.preco = preco;
        this.genero = genero;
        this.id = id;
    }

    protected String getNomeLivro() {
        return nomeLivro;
    }

    protected void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    protected Double getPreco() {
        return preco;
    }

    protected void setPreco(Double preco) {
        this.preco = preco;
    }

    protected String getGenero() {
        return genero;
    }

    protected void setGenero(String genero) {
        this.genero = genero;
    }

    protected long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }
}
