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

public class FazerReclamacao extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldApelido;
	private JLabel lblReclamacao;
	private JTextField textFieldReclamacao;
	private JButton btnEnviar;
	private JButton btnVoltar;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FazerReclamacao frame = new FazerReclamacao();
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
	public FazerReclamacao() {
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblApelido = new JLabel("Apelido:");
		lblApelido.setForeground(new Color(0, 0, 0));
		lblApelido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblApelido.setBounds(49, 47, 89, 45);
		contentPane.add(lblApelido);
		
		textFieldApelido = new JTextField();
		textFieldApelido.setForeground(new Color(255, 255, 255));
		textFieldApelido.setBackground(new Color(0, 0, 0));
		textFieldApelido.setBounds(135, 63, 255, 20);
		contentPane.add(textFieldApelido);
		textFieldApelido.setColumns(10);
		
		lblReclamacao = new JLabel("Reclama\u00E7\u00E3o:");
		lblReclamacao.setForeground(new Color(0, 0, 0));
		lblReclamacao.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblReclamacao.setBounds(49, 94, 166, 45);
		contentPane.add(lblReclamacao);
		
		textFieldReclamacao = new JTextField();
		textFieldReclamacao.setForeground(new Color(255, 255, 255));
		textFieldReclamacao.setBackground(new Color(0, 0, 0));
		textFieldReclamacao.setColumns(10);
		textFieldReclamacao.setBounds(180, 103, 210, 83);
		contentPane.add(textFieldReclamacao);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnviar.setBackground(new Color(255, 181, 106));
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Conexao Inserir = new Conexao();
				Inserir.conectar();
				Inserir.inserirReclamacao(textFieldApelido.getText(),textFieldReclamacao.getText());
				
				textFieldApelido.setText("");
				textFieldReclamacao.setText("");
				
			}			
		});
		
		btnEnviar.setBounds(79, 215, 106, 23);
		contentPane.add(btnEnviar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltar.setBackground(new Color(255, 181, 106));
		btnVoltar.setBounds(231, 215, 89, 23);
		contentPane.add(btnVoltar);
			btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home voltar = new Home();
				voltar .setVisible(true);
				dispose();
			}
		});
		
		lblNewLabel = new JLabel("Cantinho do desabafo");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(125, 18, 235, 34);
		contentPane.add(lblNewLabel);
	}
}
