package br.com.uniamerica.controle_projeto.controllers;

import br.com.uniamerica.controle_projeto.entities.VeiculosEntity;
import br.com.uniamerica.controle_projeto.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping("/{marca}/{modelo}")
    public VeiculosEntity saveVeiculo(@PathVariable String marca, @PathVariable String modelo){
        return veiculoService.saveVeiculos(new VeiculosEntity(null, marca,modelo));
    }

    @GetMapping("findbyid/{id}")
    public VeiculosEntity findById(@PathVariable Long id){
        return veiculoService.getVeiculoById(id);
    }

    @GetMapping("/findAll")
    public List<VeiculosEntity> findAll(){
        return veiculoService.findAllVeiculos();
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
