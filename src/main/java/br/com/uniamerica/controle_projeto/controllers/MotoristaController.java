package br.com.uniamerica.controle_projeto.controllers;

import br.com.uniamerica.controle_projeto.entities.MotoristaEntity;
import br.com.uniamerica.controle_projeto.services.MotoristaService;
import com.sun.net.httpserver.HttpsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<MotoristaEntity> findById(@PathVariable Long id){

        try {
            return ResponseEntity.ok(motoristaService.findById(id));
        }catch (Exception e){
            System.err.println(e.getCause());
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/findAll")
    public ResponseEntity<List<MotoristaEntity>> findAll(){
        try{
            return ResponseEntity.ok(motoristaService.findAll());
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

}
