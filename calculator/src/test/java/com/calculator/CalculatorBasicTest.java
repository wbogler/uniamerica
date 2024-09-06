package com.calculator;

import com.calculator.entity.OperacaoEntity;
import com.calculator.repository.OperacaoRepository;
import com.calculator.service.CalculatorBasic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class CalculatorBasicTest {

    @Autowired
    CalculatorBasic calculatorBasic;

    @MockBean
    OperacaoRepository operacaoRepository;

    @Test
    @DisplayName("Teste da função para somar dois numeros")
    void sumFunctionTest(){
        Assertions.assertEquals(42, calculatorBasic.sum(24, 18));
        Assertions.assertNotEquals(29, calculatorBasic.sum(24, 18));
    }

    @Test
    @DisplayName(("Testa funcao que retorna tudo"))
    void returnAllTest(){
        List<OperacaoEntity> data = new ArrayList<>();
        data.add(new OperacaoEntity(1L, "soma"));
        data.add(new OperacaoEntity(2L, "soma"));
        data.add(new OperacaoEntity(3L, "subtracao"));

        Mockito.when(operacaoRepository.findAll())
                .thenReturn(data);
        var retornoTestUnitario = calculatorBasic.findAll();
        Assertions.assertNotEquals(2,retornoTestUnitario.size());
    }

}
