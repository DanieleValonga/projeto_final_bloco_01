package ecommerce.model;

public class clientes extends cadastro{

    public clientes(String nome, String telefone, String email, String usuario, String senha, String nomeCartao, long digitosCartao) {
        super(nome, telefone, email, usuario, senha, nomeCartao, digitosCartao);
    }

    public void realizarCadastro() {
        System.out.println("\nNome completo: " + this.getNome());
        System.out.println("\nTelefone: " + this.getTelefone());
        System.out.println("\nE-mail: " + this.getEmail());
    }

    public void exibirCadastro() {
        System.out.println("\nUsuario: " + this.getUsuario());
        System.out.println("\nSenha: " + this.getSenha());
    }

    public void exibirCartao() {
        System.out.println("\nNome no Cartão: " + this.getNomeCartao());
        System.out.println("\nDígitos do Cartão: " + this.getDigitosCartao());
    }
}
