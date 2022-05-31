package Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends JFrame {

	private JPanel contentPane;
	public ViewBalance mViewBalance;
	public WithDraw mWithDraw;
	private ChangePin mChangePin;
	private Create_New_Account c;
	private Transfer tranfer;
	public static Menu mframe = new Menu("");
	public Deposit deposit;
	
	static String Menu_Account_Number;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					mframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	


	/**
	 * Create the frame.
	 */
	public Menu(String menu_Account_Number) {
		
		Menu_Account_Number=menu_Account_Number;
		System.out.println(Menu_Account_Number);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 584);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(112, 128, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(10, 10, 138, 101);
		contentPane.add(lblNewLabel);
		
	
		JButton btnNewButton = new JButton("Profile");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	System.out.println(Menu_Account_Number);
				mframe.setVisible(false);
				Profile profile =new Profile(Menu_Account_Number);
				profile.pframe.setVisible(true);
				
			}
		});
	
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(97, 121, 171, 66);
		contentPane.add(btnNewButton);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mframe.setVisible(false);
				Deposit mDeposit=new Deposit();
				mDeposit.dframe.setVisible(true);			
			}
		});
		btnDeposit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDeposit.setBounds(97, 236, 171, 66);
		contentPane.add(btnDeposit);
		
		JButton btnNewButton_1_1 = new JButton("Transfer");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mframe.setVisible(false);
				Transfer mTransfer=new Transfer();
				mTransfer.tframe.setVisible(true);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(97, 355, 171, 66);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("WithDraw");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mframe.setVisible(false);
				WithDraw mWithDraw=new WithDraw();
				mWithDraw.wframe.setVisible(true);
				
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(560, 355, 171, 66);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_4 = new JButton("View Balance");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mframe.setVisible(false);
				ViewBalance mViewBalance=new ViewBalance();
				mViewBalance.vframe.setVisible(true);
				
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_4.setBounds(560, 121, 171, 66);
		contentPane.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Chane PIN");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mframe.setVisible(false);
				ChangePin mChangePin =new ChangePin();
				mChangePin.cframe.setVisible(true);
			
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_5.setBounds(560, 236, 171, 66);
		contentPane.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("Exit");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mframe.setVisible(false);
				Authentication1 authentication =new Authentication1();
				authentication.frame.setVisible(true);
				
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1_6.setBounds(333, 453, 171, 66);
		contentPane.add(btnNewButton_1_6);
	}

}
