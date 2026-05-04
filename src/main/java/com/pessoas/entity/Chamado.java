package com.pessoas.entity;

import com.pessoas.utils.ServicoEnum;

import java.util.Objects;
import java.util.UUID;

public class Chamado {

    private UUID id;
    private ServicoEnum servico;
    private String complemento;
    private PessoaEntity demandante;
    private PessoaEntity funcionario;
    private PessoaEntity atribuido;

    public Chamado(){

    }

    public Chamado(UUID id, ServicoEnum servico, String complemento, PessoaEntity demandante, PessoaEntity funcionario, PessoaEntity atribuido) {
        this.id = id;
        this.servico = servico;
        this.complemento = complemento;
        this.demandante = demandante;
        this.funcionario = funcionario;
        this.atribuido = atribuido;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ServicoEnum getServico() {
        return servico;
    }

    public void setServico(ServicoEnum servico) {
        this.servico = servico;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public PessoaEntity getDemandante() {
        return demandante;
    }

    public void setDemandante(PessoaEntity demandante) {
        this.demandante = demandante;
    }

    public PessoaEntity getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(PessoaEntity funcionario) {
        this.funcionario = funcionario;
    }

    public PessoaEntity getAtribuido() {
        return atribuido;
    }

    public void setAtribuido(PessoaEntity atribuido) {
        this.atribuido = atribuido;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chamado chamado = (Chamado) o;
        return Objects.equals(id, chamado.id) && servico == chamado.servico && Objects.equals(complemento, chamado.complemento) && Objects.equals(demandante, chamado.demandante) && Objects.equals(funcionario, chamado.funcionario) && Objects.equals(atribuido, chamado.atribuido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, servico, complemento, demandante, funcionario, atribuido);
    }
}
