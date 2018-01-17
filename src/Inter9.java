// QUESTION 8


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Component;

public class Inter9 extends JFrame {
	
	
	static int score;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inter9 frame = new Inter9();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**s
	 * Create the frame.
	 */
	public void CloseJframe(){
        super.dispose();
}
	public Inter9() {
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUESTION 8.");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(new Color(0, 102, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(233, 13, 544, 107);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Qui s’est déclaré “premier flic de France” ? ");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(83, 96, 668, 107);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("a.Manuel Valls");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseJframe();
				Inter10 In10 = new Inter10();
				In10.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton.setBounds(86, 219, 261, 152);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("b.Nicolas Sarkozy");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseJframe();
				Inter10 In10 = new Inter10();
				In10.setVisible(true);
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 24));
		button.setBounds(391, 219, 257, 152);
		contentPane.add(button);
		
		JButton button_1 = new JButton("c.Charles de Gaulle");	
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseJframe();
				Inter10 In10 = new Inter10();
				In10.setVisible(true);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		button_1.setBounds(83, 395, 264, 152);
		contentPane.add(button_1);
		
		JButton btnDgeorges = new JButton("d.Georges Clemenceau");
		btnDgeorges.setToolTipText("");
		btnDgeorges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 1;
				CloseJframe();
				Inter10 In10 = new Inter10();
				In10.setVisible(true);
			}
		});
		btnDgeorges.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnDgeorges.setBounds(391, 395, 257, 152);
		contentPane.add(btnDgeorges);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(459, 489, 56, 16);
		contentPane.add(lblNewLabel_2);
		
		
	}
}
