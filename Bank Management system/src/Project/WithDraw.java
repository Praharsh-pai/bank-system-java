package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class WithDraw extends JFrame {

	private JPanel contentPane;
	public static 	WithDraw wframe = new WithDraw();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					wframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WithDraw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 589);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HDIC BANK");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(10, 26, 204, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Withdraw");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(313, 80, 155, 46);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(526, 7, 115, 24);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(670, 10, 195, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("ACCOUNT NO");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(530, 45, 130, 24);
		contentPane.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(670, 48, 195, 24);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("AMOUNT AVAILABLE");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(180, 200, 141, 24);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(446, 203, 195, 24);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("ENTER WITHDRAWABLE AMOUNT");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(180, 269, 236, 24);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(446, 269, 195, 24);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("TOTAL AMOUNT REMAIN");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1_1.setBounds(180, 337, 256, 24);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(446, 340, 195, 24);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Withdraw");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(689, 396, 108, 46);
		contentPane.add(btnNewButton);
		
		JButton btnBackToMenu = new JButton("Back to Menu");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wframe.setVisible(false);
				Menu mMenu=new Menu("");
				mMenu.mframe.setVisible(true);
				
			}
		});
		btnBackToMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBackToMenu.setBounds(670, 468, 155, 46);
		contentPane.add(btnBackToMenu);
		
		JButton btnNewButton_1 = new JButton("CONFIRM");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(498, 396, 98, 31);
		contentPane.add(btnNewButton_1);
	}

}
