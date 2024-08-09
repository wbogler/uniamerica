package br.com.uniamerica.controle_projeto.services;

import br.com.uniamerica.controle_projeto.entities.ProprietarioEntity;
import br.com.uniamerica.controle_projeto.entities.VeiculosEntity;
import br.com.uniamerica.controle_projeto.repositories.ProprietarioRepository;
import br.com.uniamerica.controle_projeto.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProprietarioService {

    @Autowired
    private ProprietarioRepository proprietarioRepository;

    public ProprietarioEntity findById(Long id){
        return proprietarioRepository.findById(id).orElseThrow();
    }

    public ProprietarioEntity saveProprietario(ProprietarioEntity proprietarioEntity){
        return proprietarioRepository.save(proprietarioEntity);
    }

}
