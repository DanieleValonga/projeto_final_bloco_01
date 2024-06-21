package ecommerce.model;

public class Cadastro {

    private String nome;
    private String telefone;
    private String email;
    public String usuario;
    public String senha;
    private String nomeCartao;
    private long digitosCartao;

    public Cadastro(String nome, String telefone, String email, String usuario, String senha, String nomeCartao, long digitosCartao) {
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.nomeCartao = nomeCartao;
        this.digitosCartao = digitosCartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public long getDigitosCartao() {
        return digitosCartao;
    }

    public void setDigitosCartao(long digitosCartao) {
        this.digitosCartao = digitosCartao;
    }
}
