package com.calculator.controller;

import com.calculator.entity.OperacaoEntity;
import com.calculator.repository.OperacaoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OperacoesControllerTest {

    @Autowired
    OperacoesController operacoesController;

    @MockBean
    OperacaoRepository operacaoRepository;

    @BeforeEach
    void setup(){

        Mockito.when(
                operacaoRepository.save(new OperacaoEntity(null, "soma"))
        ).thenReturn(null);
        Mockito.when(
                operacaoRepository.save(new OperacaoEntity(null, "subtracao"))
        ).thenReturn(null);
        Mockito.when(
                operacaoRepository.save(new OperacaoEntity(null, "divisao"))
        ).thenReturn(null);
        Mockito.when(
                operacaoRepository.save(new OperacaoEntity(null, "multiplicacao"))
        ).thenReturn(new OperacaoEntity(1L,"multiplicacao"));


    }

    @Test
    @DisplayName("funcao que testa o metodo de soma")
    void testSumMethod(){

        ResponseEntity<Float> data = operacoesController.sumData(20,20);
        Assertions.assertEquals(HttpStatus.OK,data.getStatusCode());
        Assertions.assertEquals(40,data.getBody());
    }

    @Test
    @DisplayName("Funcao que testa o metodo de multiplicacao")
    void multMethodTest(){

        ResponseEntity<Float> dado = operacoesController.multData(5,5);
        Assertions.assertEquals(HttpStatus.OK,dado.getStatusCode());
        Assertions.assertEquals(25,dado.getBody());
    }




}