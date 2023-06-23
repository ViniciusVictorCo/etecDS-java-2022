package GuiBanco;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import crud.Conexao;
import javax.swing.JTextField;
import java.awt.Font;


public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 442);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 177, 100));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReclameAqui = new JLabel("");
		lblReclameAqui.setIcon(new ImageIcon(Home.class.getResource("/Imagem/RECLAMEAQUI.png")));
		lblReclameAqui.setBounds(44, 126, 480, 89);
		contentPane.add(lblReclameAqui);
		
		JButton btnFazerReclamacao = new JButton("Fazer Reclama\u00E7\u00E3o");
		btnFazerReclamacao.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnFazerReclamacao.setForeground(Color.BLACK);
		btnFazerReclamacao.setBackground(new Color(255, 181, 106));
		btnFazerReclamacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FazerReclamacao fazerreclamacao = new FazerReclamacao();
				fazerreclamacao .setVisible(true);
				dispose();
			}
		});
		btnFazerReclamacao.setBounds(78, 333, 151, 23);
		contentPane.add(btnFazerReclamacao);
		
		JButton btnVerReclamacao = new JButton("Ver Reclama\u00E7\u00E3o");
		btnVerReclamacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VerReclamacao verreclamacao = new VerReclamacao();
				verreclamacao .setVisible(true);
				dispose();
			}
		});
		btnVerReclamacao.setForeground(new Color(0, 0, 0));
		btnVerReclamacao.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVerReclamacao.setBackground(new Color(255, 181, 106));
		btnVerReclamacao.setBounds(355, 333, 151, 23);
		contentPane.add(btnVerReclamacao);
	}
}
