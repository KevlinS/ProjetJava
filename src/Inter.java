import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Inter {

	private JFrame frame;
	private JLabel lblMessage; 
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inter window = new Inter();
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
	public Inter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("QCM");
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(67, 144, -181, 276);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("OK");
		btnNewButton_1.addActionListener(new ActionListener() {
		
			
			public void actionPerformed(ActionEvent e) {
	
				frame.dispose();
				Inter1 In = new Inter1();
				In.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(51, 0, 102));
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton_1.setBounds(155, 88, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		lblMessage = new JLabel("CLICK \"OK\" POUR COMMENCER DU QCM");
		lblMessage.setBounds(99, 42, 290, 51);
		frame.getContentPane().add(lblMessage);
		
		JLabel lblBienvenue = new JLabel("BIENVENUE");
		lblBienvenue.setBounds(175, 13, 214, 36);
		frame.getContentPane().add(lblBienvenue);
	}
}
