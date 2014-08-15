/*
 * Classe que crearà la finestra principal i poc més
 */

import java.awt.BorderLayout;




import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	Accions subfinestra=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("hhhhh");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Principal frame = new Principal();
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
	public Principal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 422, 229);
		contentPane.add(tabbedPane);
		
		JPanel panel1 = new JPanel();
		tabbedPane.addTab("Socis", null, panel1, null);
		panel1.setLayout(null);
		
		JButton boto1 = new JButton("Agregar soci");
		boto1.setBounds(144, 22, 107, 23);
		panel1.add(boto1);
		boto1.addActionListener(this);
		
		
		
		JButton btnEliminarSoci = new JButton("Eliminar soci");
		btnEliminarSoci.setBounds(144, 84, 107, 23);
		panel1.add(btnEliminarSoci);
		
		JButton btnBuscarSoci = new JButton("Buscar soci");
		btnBuscarSoci.setBounds(144, 149, 107, 23);
		panel1.add(btnBuscarSoci);
		
		JPanel panel2 = new JPanel();
		tabbedPane.addTab("Comandes", null, panel2, null);
		panel2.setLayout(null);
		
		JButton btnAfergirComanda = new JButton("Afergir comanda");
		btnAfergirComanda.setBounds(144, 22, 140, 23);
		panel2.add(btnAfergirComanda);
		
		JButton btnEliminarComanda = new JButton("Eliminar comanda");
		btnEliminarComanda.setBounds(144, 84, 140, 23);
		panel2.add(btnEliminarComanda);
		
		JButton btnBuscarComanda = new JButton("Buscar comanda");
		btnBuscarComanda.setBounds(144, 149, 140, 23);
		panel2.add(btnBuscarComanda);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		new Socis1();
			
	}


	}

