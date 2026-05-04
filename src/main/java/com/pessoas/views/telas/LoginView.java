package com.pessoas.views.telas;

import javax.swing.*;

public class LoginView {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setName("Login");
        frame.setSize(300, 270);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel usuarioTexto = new JLabel("Login");
        usuarioTexto.setBounds(20, 20, 100, 25);

        JTextField usuario = new JTextField("Seu login aqui");
        usuario.setBounds(20, 45, 240, 25);

        JLabel senhaTexto = new JLabel("Senha");
        senhaTexto.setBounds(20, 80, 100, 25);

        JTextField senha = new JPasswordField("senha");
        senha.setBounds(20, 105, 240, 25);

        JButton botaoLogin = new JButton("Entrar");
        botaoLogin.setBounds(90, 150, 100, 30);

        frame.add(usuarioTexto);
        frame.add(usuario);
        frame.add(senhaTexto);
        frame.add(senha);
        frame.add(botaoLogin);

        frame.setVisible(true);
    }
}
