package ecommerce.exceptions;

import ecommerce.util.cores;

public class produtoNaoEncontradoException extends Exception {
    public produtoNaoEncontradoException(String message) {
        super(cores.TEXT_RED_BOLD+ "Ops, livro não encontrado, tente de novo");
    }
}
