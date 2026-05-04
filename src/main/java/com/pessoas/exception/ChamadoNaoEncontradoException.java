package com.pessoas.exception;

public class ChamadoNaoEncontradoException extends RuntimeException{

    public ChamadoNaoEncontradoException(){
        super("Chamado não encontrado");
    }
}
