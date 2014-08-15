import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Socis1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Socis1 frame = new Socis1();
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
	public Socis1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Num Soci");
		lblNewLabel.setBounds(92, 67, 57, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomSoci = new JLabel("Nom Soci");
		lblNomSoci.setBounds(92, 118, 57, 14);
		contentPane.add(lblNomSoci);
		
		textField = new JTextField();
		textField.setBounds(174, 64, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
	}
}
