package Telas;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class ScreenForms2 extends JFrame { //subclasse de JFrame
	
	JLabel lblCodigo = new JLabel("Codigo:");
	JTextField txtCodigo  = new JTextField(10);
	
	JLabel lblProfissao = new JLabel("Atividade/ProfissÃ£o:");
	JTextField txtProfissao = new JTextField(30);
	
	JLabel lblPJPF = new JLabel("PJ/PF:");
	String [] PJPF = {"PJ" , "PF"};
	JComboBox cboPJPF = new JComboBox(PJPF);
	
	JLabel lblCep = new JLabel("CEP:");
	JTextField txtCep = new JTextField(15);
	JButton btnBuscarCep = new JButton("Buscar CEP");
	
	JLabel lblNome = new JLabel("Nome:");
	JTextField txtNome = new JTextField(30);
	
	JLabel lblEstado = new JLabel("Estadp:");
	String [] Estado = {"AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"};
	JComboBox cboEstado = new JComboBox(Estado);
	
	JLabel lblCpfCnpj = new JLabel("CPF/CNPJ:");
	JTextField txtCpfCnpj  = new JTextField(11);
	
	JLabel lblCidade = new JLabel("Cidade:");
	JTextField txtCidade = new JTextField(30);
	
	JLabel lblDocumento = new JLabel("Ins. Est./RG:");
	JTextField txtDocumento = new JTextField(30);
	
	JLabel lblRua = new JLabel("Rua:");
	JTextField txtRua = new JTextField(30);
	
	JLabel lblTelefone1 = new JLabel("Telefone 1:");
	JTextField txtTelefone1 = new JTextField(12);
	
	JLabel lblNumComplemento = new JLabel("NÂ° e Complemento:");
	JTextField txtNumComplemento = new JTextField(30);
	
	JLabel lblTelefone2 = new JLabel("Telefone 2:");
	JTextField txtTelefone2 = new JTextField(12);
	
	JLabel lblBairro = new JLabel("Bairro:");
	JTextField txtBairro = new JTextField(12);
	
	JLabel lblEmail = new JLabel("E-mail:");
	JTextField txtEmail = new JTextField(50);
	
	JLabel lblContato = new JLabel("Site/Instagram:");
	JTextField txtContato = new JTextField(50);
	
	JLabel lblObservacoes = new JLabel("Observações:");
	JTextField txtObservacoes = new JTextField(150);
	
	JButton btnGravar = new JButton("Gravar");
	JButton btnFechar = new JButton("Fechar");
	
	public ScreenForms2() {
		//FlowLayout. Ocorre quando os componentes GUI sao colocados no conteiner da esquerda para a direta na ordem que foi colocado
				setLayout(new FlowLayout());
				
				Color minhaCor = new Color(202, 212, 241);
				getContentPane().setBackground(minhaCor);


		//os componentes sera apresentados na tela nessa ordem
				Container c = getContentPane();
				setSize(1200,1200);
				setLayout(new GridLayout(0, 4));
				setTitle("Cadastro de Forencedor");
				c.add(lblCodigo);
				c.add(txtCodigo);
				c.add(lblProfissao);
				c.add(txtProfissao);
				c.add(lblPJPF);
				c.add(cboPJPF);
				c.add(lblCep);
				c.add(txtCep);
				//
				c.add(lblNome);
				c.add(txtNome);
				c.add(lblEstado);
				c.add(cboEstado);
				c.add(lblCpfCnpj);
				c.add(txtCpfCnpj);
				c.add(lblCidade);
				c.add(txtCidade);
				c.add(lblDocumento);
				c.add(txtDocumento);
				c.add(lblRua);
				c.add(txtRua);
				c.add(lblTelefone1);
				c.add(txtTelefone1);
				c.add(lblNumComplemento);
				c.add(txtNumComplemento);
				c.add(lblTelefone2);
				c.add(txtTelefone2);
				c.add(lblBairro);
				c.add(txtBairro);
				c.add(lblEmail);
				c.add(txtEmail);
				c.add(lblContato);
				c.add(txtContato);
				c.add(lblObservacoes);
				c.add(txtObservacoes);
				c.add(btnGravar);
				c.add(btnFechar);
				c.add(btnBuscarCep);
				setVisible(true);
				pack();
	}
}
