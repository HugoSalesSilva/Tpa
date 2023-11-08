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
import Dao.ClienteDao;
import Model.ClienteModel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import javax.swing.JTable;

public class login extends JFrame {

	private JPanel contentPane;

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
	 * @throws SQLException 
	 * @throws ParseException 
	 */
	public login() throws SQLException  {
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
				
	
		List<ClienteModel> cliente = new ClienteDao().getLista();
		
		
		
		
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textPane.setEditable(false);
		textPane.setBounds(125, 92, 277, 183);
		panel.add(textPane);
		
		for(ClienteModel pro: cliente){
			System.out.println(pro.getNome()+" "+ pro.getCpf());
			textPane.setText(textPane.getText()+"id:"+pro.getId()+" Nome:"+ pro.getNome()+" Email:"+pro.getEmail()+" Telefone:"+pro.getTelefone()+" Cep:"+pro.getCep()+" \n"+"\n");
			
		}
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(CadastraCliente.class.getResource("/images/livraria.png")));
		lblNewLabel.setBounds(10, 11, 554, 339);
		panel.add(lblNewLabel);
	}
}
