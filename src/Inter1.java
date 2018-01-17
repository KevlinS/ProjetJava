import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;

public class Inter1 extends JFrame {
	private JFrame frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inter1 frame = new Inter1();
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
	public void CloseJframe(){
        super.dispose();
}
	public Inter1() {

	

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kevlin\\Downloads\\shutterstock_112610096_quiz_web.jpg"));
		lblNewLabel.setBounds(69, 13, 670, 213);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bienvenue au QCM ");
		lblNewLabel_1.setForeground(new Color(51, 102, 255));
		lblNewLabel_1.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setBounds(272, 223, 316, 84);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dans ce qcm, vous devrez r\u00E9pondre \u00E0 10 question d'ordres g\u00E9n\u00E9rales.");
		lblNewLabel_2.setForeground(new Color(0, 102, 255));
		lblNewLabel_2.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(83, 286, 635, 58);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("COMMENCER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CloseJframe();
				Inter2 In2 = new Inter2();
				In2.setVisible(true);

			}
		});
		btnNewButton.setForeground(new Color(204, 0, 51));
		btnNewButton.setFont(new Font("Sitka Display", Font.BOLD, 22));
		btnNewButton.setBounds(76, 375, 628, 133);
		contentPane.add(btnNewButton);

	}
}
