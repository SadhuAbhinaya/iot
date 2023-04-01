package Ecom;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class product {

	private JFrame frame;
    int i=0;
    int total_price=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					product window = new product();
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
	public product() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 643, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Flipcart ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(159, 21, 88, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\admim\\Pictures\\images.jpg"));
		lblNewLabel_1.setBounds(23, 56, 137, 136);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admim\\Pictures\\images (1).jpg"));
		lblNewLabel_2.setBounds(236, 56, 170, 136);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lb = new JLabel("cart :");
		lb.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb.setBounds(302, 21, 96, 21);
		frame.getContentPane().add(lb);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\admim\\Pictures\\images (3.jpg"));
		lblNewLabel_3.setBounds(442, 56, 115, 136);
		frame.getContentPane().add(lblNewLabel_3);
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "pdf", "paper", "kindel"}));
		c1.setBounds(74, 225, 73, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "pdf", "kindel", "paper"}));
		c2.setBounds(288, 242, 59, 22);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"select", "pdf", "kindel", "paper"}));
		c3.setBounds(468, 242, 67, 22);
		frame.getContentPane().add(c3);
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart :" +i);
				String t=(String) c1.getSelectedItem();
				if(t.equals("pdf"))
				{
					int c=120;
					JOptionPane.showMessageDialog(btnNewButton, "select item cost:"+c+"\n type:"+t);
				}
				else if(t.equals("paper"))
				{
					int c=100;
					JOptionPane.showMessageDialog(btnNewButton, "select item cost:"+c+"\n type:"+t);
				}
				else if(t.equals("kindel")) {
					int c=140;
					JOptionPane.showMessageDialog(btnNewButton, "select item cost:"+c+"\n type:"+t);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Invaid");
				}
				
			}
		});
		btnNewButton.setBounds(57, 258, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			int c;
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart :"+i);
				
				String t=(String) c2.getSelectedItem();
				if(t.equals("pdf"))
				{
					int c=120;
					JOptionPane.showMessageDialog(btnNewButton, "select item cost:"+c+"\n type:"+t);
				}
				else if(t.equals("paper"))
				{
					int c=100;
					JOptionPane.showMessageDialog(btnNewButton, "select item cost:"+c+"\n type:"+t);
				}
				else if(t.equals("kindel")) {
					int c=140;
					JOptionPane.showMessageDialog(btnNewButton, "select item cost:"+c+"\n type:"+t);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Invaid");
				}
				
			}
		});
		btnNewButton_1.setBounds(274, 275, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to cart ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("cart :"+i);
				int p=150;
				String t=(String) c3.getSelectedItem();
				//JOptionPane.showMessageDialog(btnNewButton, "cost:"+p+"\n type:" +t);
				if(t.equals("pdf"))
				{
					int c=120;
					JOptionPane.showMessageDialog(btnNewButton, "select item cost:"+c+"\n type:"+t);
				}
				else if(t.equals("paper"))
				{
					int c=100;
					JOptionPane.showMessageDialog(btnNewButton, "select item cost:"+c+"\n type:"+t);
				}
				else if(t.equals("kindel")) {
					int c=140;
					JOptionPane.showMessageDialog(btnNewButton, "select item cost:"+c+"\n type:"+t);
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Invaid");
				}
			}
		});
		btnNewButton_2.setBounds(467, 275, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(109, 225, 46, -9);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("130/-");
		lblNewLabel_5.setBounds(80, 203, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("140/-");
		lblNewLabel_6.setBounds(288, 217, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("150/-");
		lblNewLabel_7.setBounds(478, 217, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
	}
}
