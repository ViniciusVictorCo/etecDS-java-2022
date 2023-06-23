package GuiBanco;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import crud.Conexao;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Atualizar extends JFrame {

	private JPanel contentPane;
	private JTextField editNome;
	private JLabel lblApelido;
	private JTextField editApelido;
	private JButton btnAtualizar;
	private JButton btnVoltar;
	private JLabel lblAtualizarGigante;
	private JLabel lblVasco;
	private JTextField editPosicao;
	private JTextField editId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atualizar frame = new Atualizar(null,null,null,null);
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
	public Atualizar(String setNome, String setId, String setPosicao, String setApelido) {
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
		lblNome.setBounds(130, 71, 77, 45);
		contentPane.add(lblNome);
		
		editNome = new JTextField();
		editNome.setBounds(197, 84, 227, 20);
		contentPane.add(editNome);
		editNome.setColumns(10);
		
		lblApelido = new JLabel("Apelido:");
		lblApelido.setForeground(Color.WHITE);
		lblApelido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblApelido.setBounds(130, 115, 89, 45);
		contentPane.add(lblApelido);
		
		editApelido = new JTextField();
		editApelido.setColumns(10);
		editApelido.setBounds(214, 128, 210, 20);
		contentPane.add(editApelido);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Conexao bd = new Conexao();
				bd.conectar();
				String id = editId.getText();
				String nome= editNome.getText();
				String apelido = editApelido.getText();
				String posicao = editPosicao.getText();
				
				JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso!");
				bd.atualizarContato(id, nome, apelido, posicao);
				
				
				Listar listar = new Listar();
				listar.setVisible(true);
				
				dispose();
			}
		});
		btnAtualizar.setBounds(161, 215, 106, 23);
		contentPane.add(btnAtualizar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(313, 215, 89, 23);
		contentPane.add(btnVoltar);
			btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Listar listar = new Listar();
				listar .setVisible(true);
				dispose();
			}
		});
		
		lblAtualizarGigante = new JLabel("Atualizar o Gigante");
		lblAtualizarGigante.setForeground(Color.WHITE);
		lblAtualizarGigante.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblAtualizarGigante.setBounds(167, 11, 235, 34);
		contentPane.add(lblAtualizarGigante);
		
		lblVasco = new JLabel("");
		lblVasco.setIcon(new ImageIcon(Cadastro.class.getResource("/Imagem/VascoTitulo.png")));
		lblVasco.setBounds(-11, 156, 148, 146);
		contentPane.add(lblVasco);
		
		JLabel lblPosicao = new JLabel("Posi\u00E7\u00E3o:");
		lblPosicao.setForeground(Color.WHITE);
		lblPosicao.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPosicao.setBounds(130, 159, 94, 45);
		contentPane.add(lblPosicao);
		
		editPosicao = new JTextField();
		editPosicao.setColumns(10);
		editPosicao.setBounds(214, 171, 196, 20);
		contentPane.add(editPosicao);
		
		
		editNome.setText(setNome);
		editPosicao.setText(setPosicao);
		editApelido.setText(setApelido);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblId.setBounds(130, 34, 77, 45);
		contentPane.add(lblId);
		
		editId = new JTextField();
		editId.setText("<dynamic>");
		editId.setColumns(10);
		editId.setBounds(197, 47, 227, 20);
		contentPane.add(editId);
		editId.enable(false);
		editId.setText(setId);
		
	}
}
