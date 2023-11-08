package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Controller.ClienteController;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class CadastraCliente extends JFrame {

	private JPanel contentPane;
	private JTextField CampoNome;
	private JTextField CampoEmail;
	private JFormattedTextField CampoTelefone;
	private JFormattedTextField CampoData;
	private JFormattedTextField CampoCep;
	private JFormattedTextField CampoCPF;
	private JTextField CampoNumlog;
	private JTextField CampoCidade;
	private JTextField CampoUF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastraCliente frame = new CadastraCliente();
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
	public CadastraCliente() throws ParseException {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CadastraCliente.class.getResource("/images/livrariaIcon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 422);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(186, 85, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 50, 204));
		panel.setBounds(10, 11, 574, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LIVRARIA FURADA");
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(356, 11, 208, 28);
		panel.add(lblNewLabel_1);
		
		CampoNome = new JTextField();
		CampoNome.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		CampoNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CampoNome.setBounds(32, 51, 121, 20);
		panel.add(CampoNome);
		CampoNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nome:");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(32, 26, 105, 20);
		panel.add(lblNewLabel_2);
		
		CampoEmail = new JTextField();
		CampoEmail.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		CampoEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CampoEmail.setColumns(10);
		CampoEmail.setBounds(32, 101, 121, 20);
		panel.add(CampoEmail);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(32, 82, 105, 20);
		panel.add(lblNewLabel_2_1);


		JLabel lblNewLabel_2_1_1 = new JLabel("Telefone:");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2_1_1.setBounds(32, 132, 105, 20);
		panel.add(lblNewLabel_2_1_1);
		MaskFormatter mascaraTelefone = new MaskFormatter("(##)#####-####");
		CampoTelefone = new JFormattedTextField(mascaraTelefone);
		CampoTelefone.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		CampoTelefone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CampoTelefone.setColumns(10);
		CampoTelefone.setBounds(32, 156, 121, 20);
		panel.add(CampoTelefone);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Data de Nascimento:");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2_1_1_1.setBounds(32, 187, 154, 20);
		panel.add(lblNewLabel_2_1_1_1);
		MaskFormatter mascaraData = new MaskFormatter("##/##/##");
		CampoData = new JFormattedTextField(mascaraData);
		CampoData.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		CampoData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CampoData.setColumns(10);
		CampoData.setBounds(32, 206, 121, 20);
		panel.add(CampoData);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("CEP:");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2_1_1_1_1.setBounds(32, 234, 154, 20);
		panel.add(lblNewLabel_2_1_1_1_1);
		MaskFormatter mascaraCep = new MaskFormatter("#####-###");
		CampoCep = new JFormattedTextField(mascaraCep);
		CampoCep.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		CampoCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CampoCep.setColumns(10);
		CampoCep.setBounds(32, 253, 121, 20);
		panel.add(CampoCep);
		MaskFormatter mascaraCpf = new MaskFormatter("###.###.###-##");
		CampoCPF = new JFormattedTextField(mascaraCpf);
		CampoCPF.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		CampoCPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CampoCPF.setColumns(10);
		CampoCPF.setBounds(32, 304, 121, 20);
		panel.add(CampoCPF);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("CPF:");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2_1_1_1_1_1.setBounds(32, 284, 154, 20);
		panel.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Numero Logradouro:");
		lblNewLabel_2_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(192, 26, 154, 20);
		panel.add(lblNewLabel_2_1_1_1_1_1_1);
		
		CampoNumlog = new JTextField();
		CampoNumlog.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		CampoNumlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CampoNumlog.setColumns(10);
		CampoNumlog.setBounds(192, 51, 121, 20);
		panel.add(CampoNumlog);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("Cidade:");
		lblNewLabel_2_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(192, 82, 154, 20);
		panel.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		CampoCidade = new JTextField();
		CampoCidade.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		CampoCidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CampoCidade.setColumns(10);
		CampoCidade.setBounds(192, 101, 121, 20);
		panel.add(CampoCidade);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("UF:");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(192, 137, 154, 20);
		panel.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		CampoUF = new JTextField();
		CampoUF.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		CampoUF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		CampoUF.setColumns(10);
		CampoUF.setBounds(192, 156, 121, 20);
		panel.add(CampoUF);
		
		JButton Salvar = new JButton("Salvar");
		Salvar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Salvar.setForeground(new Color(0, 0, 0));
		Salvar.setBackground(new Color(250, 235, 215));
		Salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean validaçao;
				ClienteController clienteController = new ClienteController();
				
				validaçao = clienteController.cadastraCliente(CampoNome.getText(), CampoCPF.getText(), CampoData.getText(), CampoNumlog.getText(), CampoUF.getText(), CampoCidade.getText(), CampoCep.getText(), CampoTelefone.getText(), CampoEmail.getText());
			
				 
				
				if(validaçao==false) {
					                                                                                              
					JOptionPane.showMessageDialog(null, "Os campos estão errados", "Erro", JOptionPane.WARNING_MESSAGE);
				}
							
				
			}
		});
		Salvar.setBounds(207, 205, 89, 23);
		panel.add(Salvar);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(250, 235, 215));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CampoNome.setText("");
				CampoCPF.setText("");
				CampoData.setText("");
				CampoNumlog.setText("");
				CampoUF.setText("");
				CampoCidade.setText("");
				CampoCep.setText("");
				CampoTelefone.setText("");
				CampoEmail.setText("");
			}
		});
		btnNewButton_1.setBounds(207, 252, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnLogar = new JButton("Pagina");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login Login;
				try {
					Login = new login();
					Login.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			
				
				CadastraCliente.this.dispose();
			}
		});
		btnLogar.setForeground(Color.BLACK);
		btnLogar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnLogar.setBackground(new Color(250, 235, 215));
		btnLogar.setBounds(207, 303, 89, 23);
		panel.add(btnLogar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CadastraCliente.class.getResource("/images/livraria.png")));
		lblNewLabel.setBounds(10, 11, 554, 339);
		panel.add(lblNewLabel);
	}
}
