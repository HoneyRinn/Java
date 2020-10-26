import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmSquareEquation extends JFrame {

	private JPanel contentPane;
	private JTextField text_a;
	private JTextField text_b;
	private JTextField text_c;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSquareEquation frame = new frmSquareEquation();
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
	public frmSquareEquation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTaskName = new JLabel("\u041A\u0432\u0430\u0434\u0440\u0430\u0442\u043D\u043E\u0435 \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		lblTaskName.setBounds(151, 11, 136, 14);
		contentPane.add(lblTaskName);
		
		text_a = new JTextField();
		text_a.setBounds(67, 65, 55, 20);
		contentPane.add(text_a);
		text_a.setColumns(10);
		
		JLabel lbl_a = new JLabel("x2 +");
		lbl_a.setBounds(132, 68, 33, 14);
		contentPane.add(lbl_a);
		
		text_b = new JTextField();
		text_b.setBounds(162, 65, 55, 20);
		contentPane.add(text_b);
		text_b.setColumns(10);
		
		JLabel lbl_b = new JLabel("x +");
		lbl_b.setBounds(227, 68, 33, 14);
		contentPane.add(lbl_b);
		
		text_c = new JTextField();
		text_c.setBounds(251, 65, 55, 20);
		contentPane.add(text_c);
		text_c.setColumns(10);
		
		JLabel lblRightPart = new JLabel("= 0");
		lblRightPart.setBounds(316, 68, 33, 14);
		contentPane.add(lblRightPart);
		
		JLabel lblSolution = new JLabel("");
		lblSolution.setBounds(10, 193, 414, 28);
		contentPane.add(lblSolution);
		
		JLabel label = new JLabel("\u0420\u0435\u0448\u0435\u043D\u0438\u0435");
		label.setBounds(200, 168, 87, 14);
		contentPane.add(label);
		
		JButton btnSolve = new JButton("\u0420\u0435\u0448\u0438\u0442\u044C \u0443\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a, b, c;
				try{
				a = Double.parseDouble(text_a.getText());
				}
				catch(NumberFormatException nfe){
				a = 0.0;
				text_a.setText("0.0");
				}
				try{
					b = Double.parseDouble(text_b.getText());
					}
					catch(NumberFormatException nfe){
					b = 0.0;
					text_b.setText("0.0");
					}
					try{
					c = Double.parseDouble(text_c.getText());
					}
					catch(NumberFormatException nfe){
					c = 0.0;
					text_c.setText("0.0");
					}
					double D = b * b - 4 * a * c;
					double x1, x2;
					String Sol = "";
					if(D < 0.0)
					Sol = "Действительных корней нет";
					else if(D > 0 && a != 0.){
					x1 = (-b + Math.sqrt(D)) / (2. * a);
					x2 = (-b - Math.sqrt(D)) / (2. * a);
					Sol = "Корни: x1 = " + x1 + ", x2 = " + x2;
					}
					else if(D == 0 && a != 0.0){
					x1 = -b / (2. * a);
					Sol = "Корень x = " + x1;
					}
					else if(a == 0 && b != 0.){
					x1 = -c / b;
					Sol = "Корень x = " + x1;
					}
					lblSolution.setText(Sol);
			}
		});
		btnSolve.setBounds(105, 134, 211, 23);
		contentPane.add(btnSolve);
	}
}
