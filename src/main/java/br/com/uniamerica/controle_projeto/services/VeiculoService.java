package br.com.uniamerica.controle_projeto.services;

import br.com.uniamerica.controle_projeto.entities.MotoristaEntity;
import br.com.uniamerica.controle_projeto.entities.VeiculosEntity;
import br.com.uniamerica.controle_projeto.repositories.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public VeiculosEntity findById(Long id){

        return veiculoRepository.findById(id).orElseThrow();
    }

    public VeiculosEntity saveVeiculos(VeiculosEntity  veiculosEntity){

        return veiculoRepository.save(veiculosEntity);
    }

    public List<VeiculosEntity> findAll() {
        return veiculoRepository.findAll();
    }

    public List<VeiculosEntity> findByMarca(String marca){
        return veiculoRepository.findByMarca(marca);
    }

    public int countMarca(String marca){
        return veiculoRepository.totalMarcas(marca);
    }
}
