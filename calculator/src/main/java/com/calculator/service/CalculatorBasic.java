package com.calculator.service;

import com.calculator.entity.OperacaoEntity;
import com.calculator.repository.OperacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorBasic {

    @Autowired
    private OperacaoRepository operacaoRepository;

    public float sum(float num1, float num2){
        operacaoRepository.save(new OperacaoEntity(null, "soma"));
        return num1+num2;
    }

    public float mult(float num1, float num2){
        var data = operacaoRepository.save(new OperacaoEntity(null, "multiplicacao"));
        if(data.getId()!=null){
            return num1*num2;
        }
        return 0;
    }

    public List<OperacaoEntity> findAll(){
        return operacaoRepository.findAll();
    }

}
