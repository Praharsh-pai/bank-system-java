package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;

public class Create_New_Account extends JFrame {

	public JPanel contentPane;
	public static Create_New_Account frame = new Create_New_Account();
	
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_1;
	
	//DB connection variable
		static Connection connection=null;
		static String databaseName="bank_mangement";
		static String url="jdbc:mysql://localhost:3306/"+databaseName;
		
		static String username="root";
		static String password="vasu@1991";
	
	//DataBaseFields
	public String Name;
	public String DOB;
	public String Nationality;
	public String Gender;
	public String Address;
	public String Mobile_number;
	public String Account_Number;
	public String Enter_Pin;
	public String Re_Enter_pin;
	public String Deposit;
	private JPasswordField passwordField;
	
	public JFrame f;


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
	
	void Insertion_In_Database()
	{
		
	}
	public Create_New_Account() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 578);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Create New Acount");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 10, 479, 102);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(233, 122, 168, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Enter  Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(57, 122, 96, 17);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Date of Birth");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(57, 186, 129, 17);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nationality");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(57, 246, 96, 17);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(233, 247, 168, 20);
		contentPane.add(textField_2);
	
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(57, 304, 96, 18);
		contentPane.add(lblNewLabel_2);
		
		JList list = new JList();
		list.setBounds(305, 273, 1, 1);
		contentPane.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(286, 300, -33, -15);
		contentPane.add(list_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Male");
		comboBox.addItem("Female");
		comboBox.addItem("UnKnown");
		comboBox.setBounds(233, 301, 168, 21);
		contentPane.add(comboBox);
		
		
		textField_3 = new JTextField();
		textField_3.setBounds(233, 369, 168, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		
		JLabel lblNewLabel_2_1 = new JLabel("Address");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(57, 369, 96, 18);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Mobile Number");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(57, 432, 129, 18);
		contentPane.add(lblNewLabel_2_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(233, 434, 168, 19);
		contentPane.add(textField_4);
	
		
		JLabel lblNewLabel_1_3 = new JLabel("Enter New  Account Number");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(449, 122, 217, 17);
		contentPane.add(lblNewLabel_1_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(685, 122, 176, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
	
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Enter PIN");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_1.setBounds(449, 186, 217, 17);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Enter Deposit Amount");
		lblNewLabel_1_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_3_1_1_1.setBounds(449, 246, 217, 17);
		contentPane.add(lblNewLabel_1_3_1_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(685, 247, 176, 19);
		contentPane.add(textField_8);
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Name=textField.getText().toString();
				Nationality=textField_2.getText().toString();
				Gender=comboBox.getSelectedItem().toString();
				Mobile_number=textField_4.getText().toString();
				Account_Number=textField_5.getText().toString();
				Address=textField_3.getText().toString();
				Deposit=textField_8.getText().toString();
				int x=Integer.parseInt(Deposit);
				if(x<0)
				{
					JOptionPane.showMessageDialog(f,"PLEASE Enter Valid Amount","Alert",JOptionPane.WARNING_MESSAGE);  
					textField_8.setText("0");	
				}
				
				DOB=textField_1.getText().toString();
				Enter_Pin= new String(passwordField.getPassword());
					
				//Class.forName("com.mysql.jdbc.Driver").newInstance();
				try{
					connection=DriverManager.getConnection(url, username, password);
				
				PreparedStatement ps=connection.prepareStatement("insert into bank_table values(?,?,?,?,?,?,?,?,?)");
				ps.setString(1, Account_Number);
				ps.setString(2, Name);
				ps.setString(3, DOB);
				ps.setString(4, Nationality);
				ps.setString(5, Gender);
				ps.setString(6, Address);
				ps.setString(7, Mobile_number);
				ps.setString(8, Enter_Pin);
				ps.setString(9, Deposit);
				
				
	
				int status=ps.executeUpdate();
				connection.close();
				
				if(status!=0)
				{
					System.out.println("Database was connected");
					System.out.println("Record was inserted");
				}
				else
				{
					System.out.println("No connection");
				}
				   JOptionPane.showMessageDialog(f,"Account Created SuccessFully!");  
			         frame.dispose();
					 Authentication1 mAuthentication1=new Authentication1();
					 mAuthentication1.frame.setVisible(true); 
				}catch(Exception e1){
					System.out.println(e1);
				}
				System.out.println(Name+" "+DOB+" "+Nationality+" "+Gender+" "+Address+" "+Mobile_number+" "+Account_Number+" "+Enter_Pin+" "+Deposit);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(612, 411, 116, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 frame.setVisible(false);
				 Authentication1 mAuthentication1=new Authentication1();
				 mAuthentication1.frame.setVisible(true);
			
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(623, 485, 96, 34);
		contentPane.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(233, 187, 168, 20);
		contentPane.add(textField_1);
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(685, 187, 176, 19);
		contentPane.add(passwordField);
	
		
		
		
		
		
	}
}
