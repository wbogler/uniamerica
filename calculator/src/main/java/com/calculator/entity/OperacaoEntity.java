package com.calculator.entity;

import jakarta.persistence.*;

@Entity
@Table
public class OperacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String operacao;

    @Column
    private String num1;

    public OperacaoEntity(Long id, String operacao) {
        this.id = id;
        this.operacao = operacao;
    }

    public OperacaoEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
}
