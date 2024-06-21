package ecommerce.model;

import java.util.ArrayList;
import java.util.List;

import ecommerce.repository.livrariaRepository;

public abstract class teste implements livrariaRepository {

    protected List <infoLivros> livros = new ArrayList<>();

    public List <infoLivros> listaLivros(){
        return livros;
    }
}
