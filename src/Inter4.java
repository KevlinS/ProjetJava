
// QUESTION 3

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;

public class Inter4 extends JFrame {

	static int score;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inter4 frame = new Inter4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void CloseJframe(){
        super.dispose();
}
	/**
	 * Create the frame.
	 */
	public Inter4() {
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUESTION 3.");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(new Color(0, 102, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(233, 13, 544, 107);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Où se trouve le Big Ben ?");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(83, 96, 668, 107);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("a. Au Royaume-Uni");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 1;
				CloseJframe();
				Inter5 In5 = new Inter5();
				In5.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton.setBounds(86, 219, 235, 152);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("b.En Espagne");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseJframe();
				Inter5 In5 = new Inter5();
				In5.setVisible(true);
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 24));
		button.setBounds(391, 219, 235, 152);
		contentPane.add(button);
		
		JButton button_1 = new JButton("c.En Allemagne");	
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseJframe();
				Inter5 In5 = new Inter5();
				In5.setVisible(true);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		button_1.setBounds(83, 395, 235, 152);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("d.En France");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseJframe();
				Inter5 In5 = new Inter5();
				In5.setVisible(true);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		button_2.setBounds(391, 395, 235, 152);
		contentPane.add(button_2);
		
		//Inter2 In2 = new Inter2();
		//JLabel lblNewLabel = new JLabel("Your score : "+In2.score);
		//lblNewLabel.setBounds(86, 54, 261, 106);
		//contentPane.add(lblNewLabel);
	}

}
