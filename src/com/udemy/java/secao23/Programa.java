package com.udemy.java.secao23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//Seção 23 - Aulas Extras
//Aula 02 - Criando uma aplicação desktop

public class Programa {

	public static void main(String[] args) {
		final String USER = "daniel";
		final String PASS = "teste123";
		
		//Criação da Tela
		JFrame frame = new JFrame("Geek University :: Acesso ao Sistema");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Definição do painel e agrupamento dos elementos dentro da tela
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		//Definição dos componentes que estarão no painel
		JLabel lblUsuario = new JLabel("Usuário: ");
		JTextField txtUsuario = new JTextField(20);
		txtUsuario.setToolTipText("Informe o seu usuário de acesso...");
		
		JLabel lblSenha = new JLabel("Senha: ");
		JPasswordField txtSenha = new JPasswordField(20);
		txtSenha.setToolTipText("Informe a sua senha de acesso...");
		
		JButton btnLogin = new JButton("Login");
		
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtUsuario.getText().equals(USER) && new String (txtSenha.getPassword()).equals(PASS)) {
					JOptionPane.showMessageDialog(frame, "Acesso autorizado!");
				}else {
					JOptionPane.showMessageDialog(frame, "Acesso negado!");
				}
			}
		});
		
		//Adição dos componentes no painel
		panel.add(lblUsuario);
		panel.add(txtUsuario);
		
		panel.add(lblSenha);
		panel.add(txtSenha);
		
		panel.add(btnLogin);
		
		//Adição do painel na tela
		frame.setContentPane(panel);
		//Empacotamento
		frame.pack();
		//Definição de tela como visível
		frame.setVisible(true);
		
	}
	
}
