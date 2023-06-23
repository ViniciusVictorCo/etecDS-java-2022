package Telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.*;

public class ScreenForms4 extends JFrame{
	
	JLabel lblCod = new JLabel("Código:");
	JTextField txtCod = new JTextField(1);
	JLabel lblNome = new JLabel("Nome:");
	JTextField txtNome = new JTextField(20);
	JLabel lblEndereco = new JLabel("Endereço:");
	JTextField txtEndereco = new JTextField(20);
	JLabel lblBairro = new JLabel("Bairro:");
	JTextField txtBairro = new JTextField(20);
	JLabel lblCidade = new JLabel("Cidade:");
	JTextField txtCidade = new JTextField(20);
	JLabel lblCep = new JLabel("CEP:");
	JTextField txtCep = new JTextField(10);
	JLabel lblTelefone = new JLabel("Telefone:");
	JTextField txtTelefone = new JTextField(12);
	JLabel lblObs = new JLabel("Obs:");
	JTextField txtObs = new JTextField(120);
	JLabel lblEstado = new JLabel("Estado:");
	JButton btnNovo = new JButton("Novo");
	JButton btnAlterar = new JButton("Alterar");
	JButton btnExcluir = new JButton("Excluir");
	JButton btnSalvar = new JButton("Salvar");
	JButton btnRelatorio = new JButton("Relatório");
	JButton btnRetorna = new JButton("Retorna");
	String [] estados = {"cboEstados","AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};
	JComboBox cboEstado = new JComboBox(estados);
	
	public ScreenForms4() { 
		// Flowlayout. ocorre quando os componentes GUI são colocados em um conteiner da esquerda pra direita na ordems em que são adicionados no conteiner 
		setLayout(new FlowLayout());
		setLayout(new BorderLayout());
		setLayout(new GridLayout(0,2));

		Color minhaCor = new Color(202, 212, 241);
		getContentPane().setBackground(minhaCor);
		// os componentes serão apresentados nessa ordem
		// serve como a janela mãe (desktop) das demais janelas. Um objeto JDesktopPane pode conter diversos JInternalFrame.
		Container c = getContentPane();
		setTitle("Cadastro de Clientes");
		c.add(lblCod);
		c.add(txtCod);
		c.add(lblNome);
		c.add(txtNome);
		c.add(lblEndereco);
		c.add(txtEndereco);
		c.add(lblBairro);
		c.add(txtBairro);
		c.add(lblCidade);
		c.add(txtCidade);
		c.add(lblCep);
		c.add(txtCep);
		c.add(lblTelefone);
		c.add(txtTelefone);
		c.add(lblTelefone);
		c.add(txtTelefone);
		c.add(lblObs);
		c.add(txtObs);
		c.add(lblEstado);
		c.add(cboEstado);
		c.add(btnNovo);
		c.add(btnAlterar);
		c.add(btnExcluir);
		c.add(btnSalvar);
		c.add(btnRelatorio);
		c.add(btnRetorna);

		setVisible(true);
		pack();

	}
}
