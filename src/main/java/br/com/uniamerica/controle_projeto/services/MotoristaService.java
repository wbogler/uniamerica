package br.com.uniamerica.controle_projeto.services;

import br.com.uniamerica.controle_projeto.entities.MotoristaEntity;
import br.com.uniamerica.controle_projeto.entities.ProprietarioEntity;
import br.com.uniamerica.controle_projeto.repositories.MotoristaRepository;
import br.com.uniamerica.controle_projeto.repositories.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoristaService {

    @Autowired
    private MotoristaRepository motoristaRepository;

    public MotoristaEntity findById(Long id){
        try {
            return motoristaRepository.findById(id).orElseThrow();
        }catch (Exception e){
            return new MotoristaEntity();
        }
    }

    public List<MotoristaEntity> findAll(){
        return motoristaRepository.findAll();
    }

    public MotoristaEntity saveMotorista(MotoristaEntity  motoristaEntity){

        return motoristaRepository.save(motoristaEntity);
    }

}
