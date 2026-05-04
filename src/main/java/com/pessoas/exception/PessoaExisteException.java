package com.pessoas.exception;

public class PessoaExisteException extends RuntimeException{

    public PessoaExisteException(String msg){
        super(msg);
    }
}
