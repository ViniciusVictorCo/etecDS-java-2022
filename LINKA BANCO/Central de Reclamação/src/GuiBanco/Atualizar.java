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
	private JButton btnAtualizar;
	private JButton btnVoltar;
	private JLabel lblAtualizarGigante;
	private JTextField editApelido;
	private JTextField editReclamacao;
	private JTextField editId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atualizar frame = new Atualizar(null,null,null);
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
	public Atualizar(String setId, String setApelido, String setReclamacao) {
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAtualizar.setBackground(new Color(255, 186, 117));
		btnAtualizar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Conexao bd = new Conexao();
				bd.conectar();
				String id = editId.getText();
				String apelido = editApelido.getText();
				String reclamacao = editReclamacao.getText();
				
				JOptionPane.showMessageDialog(null, "Atualizacao realizada com sucesso!");
				bd.atualizarContato(id, apelido, reclamacao);
				
				VerReclamacao listar = new VerReclamacao();
				listar.setVisible(true);
				
				dispose();
			}
		});
		
		btnAtualizar.setBounds(161, 215, 106, 23);
		contentPane.add(btnAtualizar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltar.setBackground(new Color(255, 186, 117));
		btnVoltar.setBounds(313, 215, 89, 23);
		contentPane.add(btnVoltar);
			btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VerReclamacao listar = new VerReclamacao();
				listar .setVisible(true);
				dispose();
			}
		});
		
		lblAtualizarGigante = new JLabel("Atualizar sua Reclama\u00E7\u00E3o");
		lblAtualizarGigante.setForeground(new Color(0, 0, 0));
		lblAtualizarGigante.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblAtualizarGigante.setBounds(103, 0, 235, 34);
		contentPane.add(lblAtualizarGigante);
		
		JLabel lblApelido = new JLabel("Apelido:");
		lblApelido.setForeground(Color.BLACK);
		lblApelido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblApelido.setBounds(49, 65, 89, 45);
		contentPane.add(lblApelido);
		
		editApelido = new JTextField();
		editApelido.setForeground(Color.WHITE);
		editApelido.setColumns(10);
		editApelido.setBackground(Color.BLACK);
		editApelido.setText(setApelido);
		editApelido.setBounds(135, 81, 255, 20);
		contentPane.add(editApelido);
		
		JLabel lblReclamacao = new JLabel("Reclama\u00E7\u00E3o:");
		lblReclamacao.setForeground(Color.BLACK);
		lblReclamacao.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblReclamacao.setBounds(49, 112, 166, 45);
		contentPane.add(lblReclamacao);
		
		editReclamacao = new JTextField();
		editReclamacao.setForeground(Color.WHITE);
		editReclamacao.setColumns(10);
		editReclamacao.setBackground(Color.BLACK);
		editReclamacao.setText(setReclamacao);
		editReclamacao.setBounds(180, 121, 210, 83);
		contentPane.add(editReclamacao);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setForeground(Color.BLACK);
		lblId.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblId.setBounds(49, 29, 41, 45);
		contentPane.add(lblId);
		
		editId = new JTextField();
		editId.setForeground(new Color(255, 255, 255));
		editId.setBackground(new Color(0, 0, 0));
		editId.setText(setId);
		editId.setColumns(10);
		editId.setBounds(83, 45, 307, 20);
		contentPane.add(editId);
		
	}
}
