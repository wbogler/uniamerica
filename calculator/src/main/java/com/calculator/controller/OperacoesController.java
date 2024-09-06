package com.calculator.controller;


import com.calculator.entity.OperacaoEntity;
import com.calculator.service.CalculatorBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basic")
public class OperacoesController {

    @Autowired
    private CalculatorBasic calculatorBasic;

    @GetMapping("/sum")
    public ResponseEntity<Float> sumData(@RequestParam float num1,
                                         @RequestParam float num2){

        return ResponseEntity.ok(calculatorBasic.sum(num1, num2));
    }

    @GetMapping("/mult")
    public ResponseEntity<Float> multData(@RequestParam float num1,
                                          @RequestParam float num2){
        return ResponseEntity.ok(
                calculatorBasic.mult(num1,num2)
        );
    }

    @GetMapping("/all")
    public ResponseEntity<List<OperacaoEntity>> findAll(){
        return ResponseEntity.ok(
                calculatorBasic.findAll()
        );
    }
}
