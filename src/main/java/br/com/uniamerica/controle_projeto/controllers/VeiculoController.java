package br.com.uniamerica.controle_projeto.controllers;

import br.com.uniamerica.controle_projeto.entities.VeiculosEntity;
import br.com.uniamerica.controle_projeto.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping("/saveveiculo")
    public VeiculosEntity saveVeiculo(@RequestBody VeiculosEntity veiculosEntity){
        return veiculoService.saveVeiculos(veiculosEntity);
    }

    @GetMapping("findbyid/{id}")
    public VeiculosEntity findById(@PathVariable Long id){
        return veiculoService.findById(id);
    }

    @GetMapping("/findAll")
    public List<VeiculosEntity> findAll(){
        return veiculoService.findAll();
    }

//    @GetMapping()
//    public VeiculosEntity findByMarca(@RequestParam String marca){
//        return veiculoService.findByMarca(marca);
//    }
//
//    @PostMapping("/saveAll")
//    public void saveAllCars(@RequestBody List<VeiculosEntity> veiculos){
//        veiculoService.saveAll(veiculos);
//    }
//
//    @GetMapping("/getAll")
//    public List<VeiculosEntity> getAllVeiculos(){
//        return veiculoService.getAllVeiculos();
//    }

}
