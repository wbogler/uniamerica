package com.pessoas.views.componentes.padrao;

import javax.swing.*;
import java.awt.*;

public class Botao {

    public static JButton botaoPadrao(int positionX, int positionY, String mensagem){
        JButton botao = new JButton(mensagem);
        botao.setBounds(positionX, positionY, 300, 50);
        botao.setFont(new Font("Arial", Font.BOLD, 20));
        botao.setForeground(new Color(0xF5F5F6));
        botao.setBackground(new Color(10));
        return botao;
    }
}
