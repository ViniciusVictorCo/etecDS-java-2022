package GuiBanco;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import crud.Conexao;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JLabel lblApelido;
	private JTextField textFieldApelido;
	private JLabel lblPosicao;
	private JTextField textFieldposicao;
	private JButton btnCadastar;
	private JButton btnVoltar;
	private JLabel lblNewLabel;
	private JLabel lblVasco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cadastro() {
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.WHITE);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNome.setBounds(130, 56, 77, 45);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(197, 69, 227, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		lblApelido = new JLabel("Apelido:");
		lblApelido.setForeground(Color.WHITE);
		lblApelido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblApelido.setBounds(130, 100, 89, 45);
		contentPane.add(lblApelido);
		
		textFieldApelido = new JTextField();
		textFieldApelido.setColumns(10);
		textFieldApelido.setBounds(214, 113, 210, 20);
		contentPane.add(textFieldApelido);
		
		lblPosicao = new JLabel("Posi\u00E7\u00E3o:");
		lblPosicao.setForeground(Color.WHITE);
		lblPosicao.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPosicao.setBounds(130, 147, 94, 45);
		contentPane.add(lblPosicao);
		
		textFieldposicao = new JTextField();
		textFieldposicao.setColumns(10);
		textFieldposicao.setBounds(214, 159, 196, 20);
		contentPane.add(textFieldposicao);
		
		btnCadastar = new JButton("Cadastrar");
		btnCadastar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Conexao Inserir = new Conexao();
				Inserir.conectar();
				Inserir.inserirJogador(textFieldNome.getText(), textFieldApelido.getText(), textFieldposicao.getText());
				
				textFieldNome.setText("");
				textFieldApelido.setText("");
				textFieldposicao.setText("");
				
			}			
		});
		
		btnCadastar.setBounds(161, 215, 106, 23);
		contentPane.add(btnCadastar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(313, 215, 89, 23);
		contentPane.add(btnVoltar);
			btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home voltar = new Home();
				voltar .setVisible(true);
				dispose();
			}
		});
		
		lblNewLabel = new JLabel("Contrato para o Gigante");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(167, 11, 235, 34);
		contentPane.add(lblNewLabel);
		
		lblVasco = new JLabel("");
		lblVasco.setIcon(new ImageIcon(Cadastro.class.getResource("/Imagem/VascoTitulo.png")));
		lblVasco.setBounds(-11, 156, 148, 146);
		contentPane.add(lblVasco);
	}
}
