package br.com.uniamerica.controle_projeto.services;

import br.com.uniamerica.controle_projeto.entities.VeiculosEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {

    List<VeiculosEntity> dataVeiculos = new ArrayList<>();

    public VeiculosEntity getVeiculoById(int id){
        return dataVeiculos.get(id-1);
    }

    public VeiculosEntity saveVeiculos(VeiculosEntity veiculosEntity){
        veiculosEntity.setId(Long.parseLong((dataVeiculos.size()+1)+""));
        dataVeiculos.add(veiculosEntity);
        return veiculosEntity;
    }

    public VeiculosEntity findByMarca(String marca) {
        for(VeiculosEntity x : dataVeiculos){
            if(x.getMarca().equalsIgnoreCase(marca)){
                return x;
            }
        }
        return new VeiculosEntity();
    }

    public void saveAll(List<VeiculosEntity> veiculos) {
        for(VeiculosEntity x : veiculos){
            saveVeiculos(x);
        }
    }

    public List<VeiculosEntity> getAllVeiculos(){
        return dataVeiculos;
    }
}
