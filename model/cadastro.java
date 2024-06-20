package ecommerce.model;

public class cadastro {

    private String nome;
    private String telefone;
    private String email;
    private String usuario;
    private String senha;
    private String nomeCartao;
    private long digitosCartao;

    protected cadastro(String nome, String telefone, String email, String usuario, String senha, String nomeCartao, long digitosCartao) {
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.nomeCartao = nomeCartao;
        this.digitosCartao = digitosCartao;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getTelefone() {
        return telefone;
    }

    protected void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String getUsuario() {
        return usuario;
    }

    protected void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    protected String getSenha() {
        return senha;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    protected String getNomeCartao() {
        return nomeCartao;
    }

    protected void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    protected long getDigitosCartao() {
        return digitosCartao;
    }

    protected void setDigitosCartao(long digitosCartao) {
        this.digitosCartao = digitosCartao;
    }
}
