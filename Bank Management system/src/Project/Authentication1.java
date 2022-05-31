package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.protocol.Resultset;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class Authentication1 extends JFrame {

	private JPanel contentPane;
	public static Authentication1 frame= new Authentication1();
	private JTextField textField;
   String current_Account_number;
	String Enterred_Pin;
	String Database_Pin;
	
	
	Connection con=null;
	PreparedStatement pst1=null;
	ResultSet Rs1=null;
	Statement st1=null;

	JFrame f1;
	
	
	private JPasswordField passwordField;
	
	String get_Acount_number()
	{
		return current_Account_number;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
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
	public Authentication1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 588);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HDIC BANK");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel.setBounds(266, 46, 363, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ACCOUNT NO.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(104, 220, 154, 28);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(275, 220, 216, 28);
		contentPane.add(textField);
		
		
		JLabel lblNewLabel_2 = new JLabel("ENTER YOUR PIN.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(104, 293, 162, 20);
		contentPane.add(lblNewLabel_2);
		
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				current_Account_number=textField.getText().toString();
				Enterred_Pin=new String(passwordField.getPassword());
				System.out.println(Enterred_Pin+"frist");
				String query="select * from bank_table where Account_Number='"+current_Account_number+"'";
				
				if(Enterred_Pin=="")
				{
					JOptionPane.showMessageDialog(f1,"Please Enter Pin","Alert",JOptionPane.WARNING_MESSAGE);  
					return;
				}
				
				try
				{
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_mangement","root", "vasu@1991");
					st1=con.createStatement();
					Rs1=st1.executeQuery(query);
					if(Rs1.next())
					{
						Database_Pin=Rs1.getString(8);
						System.out.println("Element found Succesfully");
						System.out.println(Database_Pin);
						System.out.println(Enterred_Pin+"eroor");
					}
					
					if(Integer.parseInt(Database_Pin)!=Integer.parseInt(Enterred_Pin))
					{
						JOptionPane.showMessageDialog(f1,"Invalid Pin","Alert",JOptionPane.WARNING_MESSAGE);  
						frame.dispose();
						frame.setVisible(true);
					}
					else
					{
						frame.dispose();
						Menu menu=new Menu(current_Account_number);
						menu.mframe.setVisible(true);
					}

				}
				catch (Exception e1) {
					// TODO: handle exception
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(314, 360, 126, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Create a New Account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.setVisible(false);
				 Create_New_Account mCreate_New_Account=new Create_New_Account();
				 mCreate_New_Account.frame.setVisible(true);
				 
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(274, 450, 204, 37);
		contentPane.add(btnNewButton_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(275, 287, 221, 28);
		contentPane.add(passwordField);
	}
}
