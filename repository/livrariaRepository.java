package ecommerce.repository;

import ecommerce.model.cadastro;
import ecommerce.model.infoLivros;

public interface livrariaRepository {

    public void realizarCadastro(cadastro clientes);
    public void exibirCartao(cadastro clientes);
    public void exibirCadastro(cadastro clientes);
    public void exibirLivros(infoLivros livros);
    public void exibirCarrinho(infoLivros livros);
}
