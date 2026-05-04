package com.pessoas.utils;

public enum ServicoEnum {

    SERVICO_MANUTENCAO_GERAL("Manutencao_001", "Manutenção geral"),
    SERVICO_LIMPEZA_DETALHADA("Manutencao_002", "limpeza detalhada");


    private String chave;
    private String nomeServico;

    ServicoEnum(String chave, String nomeServico) {
        this.chave = chave;
        this.nomeServico = nomeServico;
    }

    public String getChave() {
        return chave;
    }

    public String getNomeServico() {
        return nomeServico;
    }
}
