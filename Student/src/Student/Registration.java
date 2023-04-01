package Student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RegistrationPage");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(138, 11, 142, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sno");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(46, 60, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(46, 93, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(46, 132, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Marks");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(46, 168, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setBounds(154, 57, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(154, 93, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(154, 129, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(154, 167, 86, 20);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l=new Login();
				l.lframe.setVisible(true);
				String s=t1.getText();
				int sno=Integer.parseInt(s);
				String name=t2.getText();
				String email=t3.getText();
				String m=t4.getText();
				float marks=Float.parseFloat(m);
				Connection con;
				try {
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","mrec");
					String q="insert into registration values('"+sno+"','"+name+"','"+email+"','"+marks+"')";
					Statement sta=con.createStatement();
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton, "RegistrationDone!");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(138, 215, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
