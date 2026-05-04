package com.pessoas.servico;

import com.pessoas.Main;
import com.pessoas.entity.Chamado;
import com.pessoas.utils.ServicoEnum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DadosService {

    public int quantidadeChamados(List<Chamado> chamados){
        return chamados.size();
    }

    public Map<String, Integer> chamadosPorServico(List<Chamado> chamados){

        Map<String, Integer> dados = new HashMap<String, Integer>();

        for(ServicoEnum servico : ServicoEnum.values()){
            int contagem = 0;
            for(Chamado x : chamados){
                if(x.getServico().getNomeServico().equalsIgnoreCase(servico.getNomeServico())){
                    contagem += 1;
                }
            }
            dados.put(servico.getNomeServico(),contagem);
        }
        return dados;
    }
}
