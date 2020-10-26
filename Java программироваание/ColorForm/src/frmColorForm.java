import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmColorForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmColorForm frame = new frmColorForm();
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
	public frmColorForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel lblNameColor = new JLabel("");
		lblNameColor.setBounds(149, 148, 139, 14);
		contentPane.add(lblNameColor);
		
		JButton btnChangeColor = new JButton("\u0418\u0437\u043C\u0435\u043D\u0438\u0442\u044C \u0446\u0432\u0435\u0442 \u0444\u043E\u043C\u044B");
		btnChangeColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(contentPane.getBackground()==Color.RED) {
					contentPane.setBackground(Color.GREEN);
					lblNameColor.setText("Земелный");
				}
				else {
					contentPane.setBackground(Color.RED);
					lblNameColor.setText("Красный");
				}
			}
		});
		btnChangeColor.setBounds(107, 59, 229, 23);
		contentPane.add(btnChangeColor);
	}
}
