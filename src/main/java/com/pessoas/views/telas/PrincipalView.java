package com.pessoas.views.telas;

import javax.swing.*;
import java.awt.*;

public class PrincipalView extends JFrame {

    public PrincipalView(){

        //Window Config
        setName("Abertura de Chamados - Principal");
        setSize(1000,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        setLayout(new BorderLayout());

        JPanel menuEsquerdo = MenuView.menuEsquerdo();


        JOptionPane.showConfirmDialog(this, "Bem vindo", "Titulo", JOptionPane.INFORMATION_MESSAGE);
        add(menuEsquerdo,BorderLayout.WEST);

        setVisible(true);



    }

}
