package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.Border;

public class ScreenForms1 extends JFrame {
	
	JLabel lblUsu = new JLabel("Usuario:");
	JTextField txtUsu = new JTextField(20);
	
	JLabel lblSenha = new JLabel("Senha:");
	JTextField txtSenha = new JTextField(20);
	
	JButton btnEntrar = new JButton("Entrar");
	JButton btnCadas = new JButton("Cadastrar");
	

	public ScreenForms1() { 
		
		setLayout(new FlowLayout());
		setLayout(new BorderLayout());
		setLayout(new GridLayout(0,2));
		
		
		
		setSize(300,250);
		setVisible(true);
		
		Color minhaCor = new Color(202, 212, 241);
		getContentPane().setBackground(minhaCor);
		
		
		Container c = getContentPane();
		setTitle("Login");
		
		
		c.add(lblUsu);
		c.add(txtUsu);
		
		c.add(lblSenha);
		c.add(txtSenha);
		
		c.add(btnEntrar);
		c.add(btnCadas);
		
		pack();
	}

}
