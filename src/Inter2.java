// QUESTION 1


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

public class Inter2 extends JFrame {
	
	
	static int score;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inter2 frame = new Inter2();
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
	public Inter2() {
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUESTION 1.");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(new Color(0, 102, 255));
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel.setBounds(233, 13, 544, 107);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C'est quoi la capitale de la France ? ");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setBounds(83, 96, 668, 107);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("a.Rennes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseJframe();
				Inter3 In3 = new Inter3();
				In3.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 24));
		btnNewButton.setBounds(86, 219, 235, 152);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("b.Nantes");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseJframe();
				Inter3 In3 = new Inter3();
				In3.setVisible(true);
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 24));
		button.setBounds(391, 219, 235, 152);
		contentPane.add(button);
		
		JButton button_1 = new JButton("c.Paris");	
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score = score + 1;
				CloseJframe();
				Inter3 In3 = new Inter3();
				In3.setVisible(true);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		button_1.setBounds(83, 395, 235, 152);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("d.Marseille");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseJframe();
				Inter3 In3 = new Inter3();
				In3.setVisible(true);
			}
		});
		button_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
		button_2.setBounds(391, 395, 235, 152);
		contentPane.add(button_2);
		
		
	}
	
}
