import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JProgressBar;

public class feijon extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					feijon frame = new feijon();
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
	public feijon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 542);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
	setContentPane(contentPane);
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.GREEN);
	contentPane.add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("PASSE VALORANT DE GRA\u00C7A");
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel.setBounds(278, 79, 223, 68);
	panel.add(lblNewLabel);
	
	JButton btnNewButton = new JButton("PASSE FREE ACESSE J\u00C1");
	btnNewButton.setBounds(258, 342, 265, 23);
	panel.add(btnNewButton);
	
	textField = new JTextField();
	textField.setBounds(309, 158, 161, 23);
	panel.add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setBounds(309, 204, 161, 23);
	panel.add(textField_1);
	textField_1.setColumns(10);
	
	JLabel lblNewLabel_1 = new JLabel("EMAIL ");
	lblNewLabel_1.setBounds(309, 147, 46, 14);
	panel.add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("SENHA");
	lblNewLabel_2.setBounds(319, 192, 46, 14);
	panel.add(lblNewLabel_2);
	
	JCheckBox chckbxNewCheckBox = new JCheckBox("VOCE \u00C9 BURRO ? ");
	chckbxNewCheckBox.setBounds(331, 234, 124, 23);
	panel.add(chckbxNewCheckBox);
	
	JRadioButton rdbtnNewRadioButton = new JRadioButton("Quer ser roubado ai amigao ?");
	rdbtnNewRadioButton.setBounds(299, 270, 190, 23);
	panel.add(rdbtnNewRadioButton);
	
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Quer ser roubado mesmo em carai");
	rdbtnNewRadioButton_1.setBounds(299, 312, 190, 23);
	panel.add(rdbtnNewRadioButton_1);
	
	JProgressBar progressBar = new JProgressBar();
	progressBar.setStringPainted(true);
	progressBar.setMinimum(50);
	progressBar.setBounds(309, 392, 146, 14);
	panel.add(progressBar);
	}
}
