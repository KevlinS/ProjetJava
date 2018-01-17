

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.ImageIcon;

public class ScoreTotal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreTotal frame = new ScoreTotal();
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
	public ScoreTotal() {
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Inter2 In2 = new Inter2();
		Inter3 In3 = new Inter3();
		Inter4 In4 = new Inter4();
		Inter5 In5 = new Inter5();
		Inter6 In6 = new Inter6();
		Inter7 In7 = new Inter7();
		Inter8 In8 = new Inter8();
		Inter9 In9 = new Inter9();
		Inter10 In10 = new Inter10();
		Inter11 In11 = new Inter11();
		JLabel lblNewLabel = new JLabel("YOUR SCORE : "+(In2.score+In3.score+In4.score+In5.score+In6.score+In7.score+In8.score+In9.score+In10.score+In11.score)+"/10");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBounds(111, 325, 533, 211);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\kevlin\\Downloads\\short-quiz-philippine-history-11-638.jpg"));
		lblNewLabel_1.setBounds(59, 63, 650, 508);
		contentPane.add(lblNewLabel_1);
	}
}
