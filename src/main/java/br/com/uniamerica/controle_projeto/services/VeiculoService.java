package br.com.uniamerica.controle_projeto.services;

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

    public VeiculosEntity getVeiculoById(Long id){
        return veiculoRepository.findById(id).get();
    }

    public VeiculosEntity saveVeiculos(VeiculosEntity veiculosEntity){
        return veiculoRepository.save(veiculosEntity);
    }

    public List<VeiculosEntity> findAllVeiculos() {
        return veiculoRepository.findAll();
    }

//    public VeiculosEntity findByMarca(String marca) {
//        for(VeiculosEntity x : dataVeiculos){
//            if(x.getMarca().equalsIgnoreCase(marca)){
//                return x;
//            }
//        }
//        return new VeiculosEntity();
//    }
//
//    public void saveAll(List<VeiculosEntity> veiculos) {
//        for(VeiculosEntity x : veiculos){
//            saveVeiculos(x);
//        }
//    }
//
//    public List<VeiculosEntity> getAllVeiculos(){
//        return dataVeiculos;
//    }
}
