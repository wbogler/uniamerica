package com.pessoas.servico;

import com.pessoas.entity.Chamado;
import com.pessoas.entity.PessoaEntity;
import com.pessoas.exception.PessoaExisteException;

import java.util.List;
import java.util.UUID;

public class PessoaService {

    public List<PessoaEntity> salvarPessoa(List<PessoaEntity> pessoas,PessoaEntity pessoaEntity){
        if(!pessoas.contains(pessoaEntity)){
            pessoas.add(pessoaEntity);
            return pessoas;
        }
        else {
            throw new PessoaExisteException("Pessoa já cadastrada");
        }
    }

    public List<PessoaEntity> registrarFuncionario(List<PessoaEntity> funcinarios, PessoaEntity funcionario){
        return salvarPessoa(funcinarios,funcionario);
    }


}
