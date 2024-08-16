package br.com.uniamerica.controle_projeto.services;

import br.com.uniamerica.controle_projeto.entities.MotoristaEntity;
import br.com.uniamerica.controle_projeto.entities.VeiculosEntity;
import br.com.uniamerica.controle_projeto.repositories.MotoristaRepository;
import br.com.uniamerica.controle_projeto.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoristaService {

    @Autowired
    private MotoristaRepository motoristaRepository;

    public MotoristaEntity findById(Long id){

        return motoristaRepository.findById(id).orElseThrow();
    }

    public MotoristaEntity saveMotorista(MotoristaEntity  motoristaEntity){

        return motoristaRepository.save(motoristaEntity);
    }

    public List<MotoristaEntity> findAll() {
        return motoristaRepository.findAll();
    }

}
