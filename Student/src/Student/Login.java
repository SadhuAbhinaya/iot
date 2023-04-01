package Student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Login {

	JFrame lframe;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
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
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(171, 11, 76, 30);
		lframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sno");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(32, 62, 46, 14);
		lframe.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(117, 61, 86, 20);
		lframe.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lb1 = new JLabel("Name");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb1.setBounds(32, 134, 171, 20);
		lframe.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("Marks");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb2.setBounds(32, 176, 89, 14);
		lframe.getContentPane().add(lb2);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=t1.getText();
				int sno=Integer.parseInt(s);
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","mrec");
					String q="select name,marks from registration where sno=?";
					PreparedStatement ps=con.prepareStatement(q);
					ps.setInt(1, sno);
					ResultSet rs=ps.executeQuery();
					rs.next();
					lb1.setText("Name:"+rs.getString(1));
					lb2.setText("Marks:"+rs.getInt(2));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(171, 102, 86, 20);
		lframe.getContentPane().add(btnNewButton);
	}

}
