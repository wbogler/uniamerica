package com.pessoas.views.telas;

import com.pessoas.views.componentes.padrao.Botao;

import javax.swing.*;

public class MenuView {

    public static JPanel menuEsquerdo(){
        JPanel painelEsquerdo = new JPanel();

        JButton botao1 = Botao.botaoPadrao(100, 200,"Mensagem 1");
        JButton botao2 = Botao.botaoPadrao(100, 250,"Mensagem 2");

        painelEsquerdo.add(botao1);
        painelEsquerdo.add(botao2);

        return painelEsquerdo;
    }
}
