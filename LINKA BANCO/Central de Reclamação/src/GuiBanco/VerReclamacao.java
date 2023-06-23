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

public class VerReclamacao extends JFrame {

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
					VerReclamacao frame = new VerReclamacao();
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
	public VerReclamacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaContrato = new JLabel("Voc\u00EA n\u00E3o \u00E9 o unico que reclama da sua vida!!!");
		lblListaContrato.setForeground(new Color(0, 0, 0));
		lblListaContrato.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblListaContrato.setBackground(Color.BLACK);
		lblListaContrato.setBounds(23, 11, 384, 37);
		contentPane.add(lblListaContrato);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVoltar.setBackground(new Color(255, 182, 108));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home voltar = new Home();
				voltar .setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(594, 227, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAtualizar.setBackground(new Color(255, 182, 108));
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				String id = table.getValueAt(table.getSelectedRow(),0).toString();
				String apelido = table.getValueAt(table.getSelectedRow(),1).toString();
				String reclamacao = table.getValueAt(table.getSelectedRow(),2).toString();
				
				Atualizar atualizar = new Atualizar(id,apelido,reclamacao);
				atualizar .setVisible(true);
				dispose();
			}
		});
		btnAtualizar.setBounds(10, 227, 89, 23);
		contentPane.add(btnAtualizar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 673, 170);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDeletar.setForeground(new Color(0, 0, 0));
		btnDeletar.setBackground(new Color(255, 182, 108));
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String id = "";
			id = table.getValueAt(table.getSelectedRow(),0).toString();
			int escolha = JOptionPane .showConfirmDialog(null, "Deseja mesmo deletar esta humilde reclamação?");
			
			if (escolha == 0) {
				bd.deletarJogador(id);
				System.out.println(id);
				table.setModel(DbUtils.resultSetToTableModel(bd.listarReclamacao()));
			}
			}
		});
		btnDeletar.setBounds(109, 227, 89, 23);
		contentPane.add(btnDeletar);
		
		bd.conectar();
		table.setModel(DbUtils.resultSetToTableModel(bd.listarReclamacao()));
	}

}
