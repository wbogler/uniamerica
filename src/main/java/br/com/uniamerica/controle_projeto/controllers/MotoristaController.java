package br.com.uniamerica.controle_projeto.controllers;

import br.com.uniamerica.controle_projeto.entities.MotoristaEntity;
import br.com.uniamerica.controle_projeto.entities.VeiculosEntity;
import br.com.uniamerica.controle_projeto.services.MotoristaService;
import br.com.uniamerica.controle_projeto.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/motorista")
public class MotoristaController {

    @Autowired
    private MotoristaService motoristaService;

    @PostMapping("/save")
    public MotoristaEntity saveVeiculo(@RequestBody MotoristaEntity motoristaEntity){
        return motoristaService.saveMotorista(motoristaEntity);
    }

    @GetMapping("findbyid/{id}")
    public MotoristaEntity findById(@PathVariable Long id){
        return motoristaService.findById(id);
    }

    @GetMapping("/findAll")
    public List<MotoristaEntity> findAll(){
        return motoristaService.findAll();
    }

}
