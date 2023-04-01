package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	JFrame lframe;
	private JTextField t1;
	private JPasswordField p1;
	JLabel lb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.lframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		lframe = new JFrame();
		lframe.setBounds(100, 100, 450, 300);
		lframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("login");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(176, 11, 57, 17);
		lframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(93, 86, 70, 14);
		lframe.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(203, 84, 86, 20);
		lframe.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(93, 141, 86, 14);
		lframe.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Un=t1.getText();
				String pass=p1.getText();
				if(Un.equals("Abhi") && pass.equals("1234"))
				{
					JOptionPane.showMessageDialog(btnNewButton, "login Done!");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Invalid!");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(157, 200, 89, 23);
		lframe.getContentPane().add(btnNewButton);
		
		p1 = new JPasswordField();
		p1.setBounds(203, 139, 86, 20);
		lframe.getContentPane().add(p1);
		
		 lb1 = new JLabel("");
		lb1.setBounds(119, 48, 184, 14);
		lframe.getContentPane().add(lb1);
	}

}
