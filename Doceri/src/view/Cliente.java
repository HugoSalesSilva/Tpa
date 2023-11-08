package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import Controller.ClienteController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField CampoNome;
	private JFormattedTextField CampoCpf;
	private JFormattedTextField CampoDataNasc;
	private JTextField CampoId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public Cliente() throws ParseException {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 117, 50, 20);
		panel.add(lblNewLabel);
		
		CampoNome = new JTextField();
		
		CampoNome.setBorder(new LineBorder(Color.BLACK));
		CampoNome.setBounds(10, 148, 173, 20);
		panel.add(CampoNome);
		CampoNome.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCpf.setBounds(10, 179, 50, 20);
		panel.add(lblCpf);
		
		MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		CampoCpf = new JFormattedTextField(mascaraCpf);

		CampoCpf.setColumns(10);
		CampoCpf.setBorder(new LineBorder(Color.BLACK));
		CampoCpf.setBounds(10, 210, 173, 20);
		panel.add(CampoCpf);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDataDeNascimento.setBounds(10, 241, 133, 20);
		panel.add(lblDataDeNascimento);
		MaskFormatter mascaraData = new MaskFormatter("##/##/####");

		CampoDataNasc = new JFormattedTextField(mascaraData);
		CampoDataNasc.setColumns(10);
		CampoDataNasc.setBorder(new LineBorder(Color.BLACK));
		CampoDataNasc.setBounds(10, 272, 173, 20);
		panel.add(CampoDataNasc);
		
		JButton Salvar = new JButton("Salvar");
		Salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				boolean validaçao;
				ClienteController clienteController = new ClienteController();
				
				validaçao = clienteController.cadastraCliente(CampoNome.getText(), CampoCpf.getText(), CampoDataNasc.getText());
			
				if(validaçao==false) {
					                                                                                              
					JOptionPane.showMessageDialog(null, "Os campos estão errados", "Erro", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		Salvar.setBounds(299, 41, 89, 23);
		panel.add(Salvar);
		
		JButton Limpar = new JButton("Limpar");
		Limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CampoNome.setText("");
				CampoCpf.setText("");
				CampoDataNasc.setText("");
			}
		});
		Limpar.setBounds(299, 85, 89, 23);
		panel.add(Limpar);
		
		JLabel lblNewLabel_2 = new JLabel("Codigo do Cliente");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 28, 117, 20);
		panel.add(lblNewLabel_2);
		
		CampoId = new JTextField();
		CampoId.setEditable(false);
		CampoId.setColumns(10);
		CampoId.setBorder(new LineBorder(Color.BLACK));
		CampoId.setBounds(10, 53, 74, 20);
		panel.add(CampoId);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Cliente.class.getResource("/Images/932b76216b940cfa6d0587fb02edcd26.jpg")));
		lblNewLabel_1.setBounds(-46, -17, 470, 454);
		panel.add(lblNewLabel_1);
	}
}
