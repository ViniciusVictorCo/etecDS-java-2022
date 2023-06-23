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
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVasco = new JLabel("");
		lblVasco.setIcon(new ImageIcon(Home.class.getResource("/Imagem/VascoTitulo.png")));
		lblVasco.setBounds(125, 96, 307, 193);
		contentPane.add(lblVasco);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro cadastro = new Cadastro();
				cadastro .setVisible(true);
				dispose();
			}
		});
		btnCadastrar.setBounds(103, 333, 111, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Listar listar = new Listar();
				listar .setVisible(true);
				dispose();
			}
		});
		btnListar.setBounds(364, 333, 89, 23);
		contentPane.add(btnListar);
	}
}
