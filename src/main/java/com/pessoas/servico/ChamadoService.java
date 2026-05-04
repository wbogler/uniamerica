package com.pessoas.servico;

import com.pessoas.entity.Chamado;
import com.pessoas.exception.ChamadoNaoEncontradoException;

import java.util.List;
import java.util.UUID;

public class ChamadoService {

    public Chamado localizarChamadoPorID(List<Chamado> chamados, UUID chamado){
        return chamados.stream().filter(x -> x.getId().equals(chamado))
                .findFirst()
                .orElseThrow(ChamadoNaoEncontradoException::new);
    }

    public List<Chamado> abrirChamado(List<Chamado> chamados, Chamado chamado){
        chamado.setId(UUID.randomUUID());
        chamados.add(chamado);
        return chamados;
    }


}
