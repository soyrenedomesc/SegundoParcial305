package github;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Rene {

	private JFrame frmHolaGit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rene window = new Rene();
					window.frmHolaGit.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Rene() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHolaGit = new JFrame();
		frmHolaGit.setTitle("HOLA GIT");
		frmHolaGit.setBounds(100, 100, 450, 300);
		frmHolaGit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHolaGit.setLocationRelativeTo(null);
		frmHolaGit.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOLA CECYTOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(10, 79, 396, 78);
		frmHolaGit.getContentPane().add(lblNewLabel);
	}
}
