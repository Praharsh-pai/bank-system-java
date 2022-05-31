package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Profile extends JFrame {

	public JPanel contentPane;
	public static Profile pframe= new Profile("");
	private Menu menu;
	private JTextField textField_6;
	Authentication1 authentication=new Authentication1();
	
	static String Profile_Account_Number;
	
	//DataBaseFields
		public  String Name;
		public String DOB;
		public String Nationality;
		public String Gender;
		public String Address;
		public String Mobile_number;
		public String Account_Number;
		public String Enter_Pin;
		public String Deposit;
	
		
		public JFrame f;
		private JTextField textField_1;
		
		private javax.swing.JLabel  lblNewLabel_2;

		

	/**
	 * Launch the application.
	 */
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					pframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Constructor

	/**
	 * Create the frame.
	 */
	void Database_Display(String account_Number)
	{
		//DataBase fetching data for specific Account number
		Connection con=null;
		PreparedStatement ps1=null;
		ResultSet Rs1=null;
		Statement St1=null;
		Profile_Account_Number=account_Number;
		
		String query="select * from bank_table where Account_Number='"+Profile_Account_Number+"' ";
		System.out.println(Profile_Account_Number);
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_mangement","root","vasu@1991");
			St1=con.createStatement();
			Rs1=St1.executeQuery(query);
			
			if(Rs1.next())
			{
				Name=Rs1.getString(2);			
				System.out.println(Name+"  1st");
				lblNewLabel_2.setText(Name);
				System.out.println(Name+"  2nd");
				
	
				DOB=Rs1.getString(3);
				Nationality=Rs1.getString(4);
				Gender=Rs1.getString(5);
				Address=Rs1.getString(6);
				Mobile_number=Rs1.getString(7);
				Enter_Pin=Rs1.getString(8);
				Deposit=Rs1.getString(9);	
			}
			
			
		//	lblNewLabel_2.setText("yowf whkjfe");
			
			
			System.out.println(Name+" "+DOB+" "+Nationality+" "+Gender+" "+Address+" "+Mobile_number+" "+Enter_Pin+" "+Deposit);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	
		
	}
	
	public void Calender()
	{
		Calendar ca =new GregorianCalendar();
		int day=ca.get(Calendar.DAY_OF_MONTH);
		int Month=ca.get(Calendar.MONTH);
		int Year=ca.get(Calendar.YEAR);
		textField_1.setText(day+"-"+Month+"-"+Year);
		textField_1.setEditable(false);
		
	}
	
	
	public Profile(String account_Number) {	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 582);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel lblNewLabel = new JLabel("HDIC BANK");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(10, 27, 204, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(74, 113, 109, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Date of Birth");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(74, 177, 140, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nationality");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(74, 243, 140, 25);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1.setBounds(74, 318, 140, 25);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Address");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1_1_1.setBounds(74, 396, 140, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Account No");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(516, 113, 109, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Account Type");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBounds(516, 177, 130, 25);
		contentPane.add(lblNewLabel_1_2_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(656, 177, 195, 25);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Mobile No");
		lblNewLabel_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_2_1_1_1.setBounds(516, 243, 130, 25);
		contentPane.add(lblNewLabel_1_2_1_1_1);
		
		JButton btnNewButton = new JButton("Delete Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(516, 416, 157, 32);
		contentPane.add(btnNewButton);
		
	
		
		

		
		
		JButton btnBackToMenu = new JButton("Back to Menu");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pframe.setVisible(false);
				Menu mMenu=new Menu("");
				mMenu.mframe.setVisible(true);
				System.out.println(Profile_Account_Number+"No account");
				
			}
		});
		btnBackToMenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBackToMenu.setBounds(516, 484, 157, 32);
		contentPane.add(btnBackToMenu);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(695, 27, 130, 25);
		contentPane.add(textField_1);
		

		JLabel lblNewLabel_3 = new JLabel("Date :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(636, 27, 70, 25);
		contentPane.add(lblNewLabel_3);
		
		 lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(222, 118, 174, 23);
		contentPane.add(lblNewLabel_2);
		
		
		Calender();
		Database_Display(account_Number);
		
		
			
				
		
	}
}
