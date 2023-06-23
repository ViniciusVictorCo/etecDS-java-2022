package GuiBanco;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import crud.Conexao;
import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Listar extends JFrame {

	private JPanel contentPane;
	private JTable table;
	Conexao bd = new Conexao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Listar frame = new Listar();
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
	public Listar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaContrato = new JLabel("Escala\u00E7\u00E3o do Vasco");
		lblListaContrato.setForeground(Color.WHITE);
		lblListaContrato.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblListaContrato.setBackground(Color.BLACK);
		lblListaContrato.setBounds(134, 11, 171, 37);
		contentPane.add(lblListaContrato);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home voltar = new Home();
				voltar .setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				String id = table.getValueAt(table.getSelectedRow(),0).toString();
				String nome = table.getValueAt(table.getSelectedRow(),1).toString();
				String posicao = table.getValueAt(table.getSelectedRow(),2).toString();
				String apelido = table.getValueAt(table.getSelectedRow(),3).toString();
				
				Atualizar atualizar = new Atualizar(id,nome,posicao,apelido);
				atualizar .setVisible(true);
				dispose();
			}
		});
		btnAtualizar.setBounds(47, 227, 89, 23);
		contentPane.add(btnAtualizar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 414, 170);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String id = "";
			id = table.getValueAt(table.getSelectedRow(),1).toString();
			int escolha = JOptionPane .showConfirmDialog(null, "Deseja mesmo deletar este jogador?");
			
			if (escolha == 0) {
				bd.deletarJogador(id);
				System.out.println(id);
				table.setModel(DbUtils.resultSetToTableModel(bd.listarJogador()));
			}
			}
		});
		btnDeletar.setBounds(146, 227, 89, 23);
		contentPane.add(btnDeletar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(223, 11, 395, 300);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Listar.class.getResource("/Imagem/Vasco.png")));
		
		bd.conectar();
		table.setModel(DbUtils.resultSetToTableModel(bd.listarJogador()));
	}
}
