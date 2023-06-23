package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;


import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class ScreenForms3  extends JFrame{
	
	JLabel lblDesc = new JLabel("Descrição:");
	JTextField txtDesc = new JTextField(1);
	
	JLabel lblEspe = new JLabel("Espécie:");
	JTextField txtEspe = new JTextField(1);
	
	JLabel lblUni = new JLabel("Unidade de entrada:");
	JTextField txtUni = new JTextField(1);
	
	JLabel lblSub = new JLabel("SubVisivel:");
	String[] SubVisivel = {"sim","não"};
	JComboBox SubVisivel1 = new JComboBox(SubVisivel);
	

	JLabel lblUniS = new JLabel("Unidade de saída:");
	JTextField txtUniS = new JTextField(1);
	
	JLabel lblQuant = new JLabel("Qt. Subdivisão:");
	JTextField txtQuant = new JTextField(1);
	
	public ScreenForms3() {
		
		setLayout(new FlowLayout());
		setLayout(new BorderLayout());
		setLayout(new GridLayout(0,2));
		setSize(500,500);
		setVisible(true);
		
		
		Color minhaCor = new Color(202, 212, 241);
		getContentPane().setBackground(minhaCor);
		
		Container c = getContentPane();
		setTitle("Cadastro Produto");
		
		c.add(lblDesc);
		c.add(txtDesc);
		
		c.add(lblEspe);
		c.add(txtEspe);
		
		c.add(lblUni);
		c.add(txtUni);
		
		c.add(lblSub);
		c.add(SubVisivel1);
		
		c.add(lblUniS);
		c.add(txtUniS);
		
		c.add(lblQuant);
		c.add(txtQuant);
		
		setVisible(true);
		
		pack();

		
		
	}
	
	
}
	

