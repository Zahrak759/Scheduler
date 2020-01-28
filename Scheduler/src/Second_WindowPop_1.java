import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Second_WindowPop_1 extends Gui_Manger{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	public static void DisplayWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second_WindowPop_1 window = new Second_WindowPop_1();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});	
	}	
	public Second_WindowPop_1() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 861, 466);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnAdd.setBounds(715, 367, 116, 39);
		frame.getContentPane().add(btnAdd);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblName.setBounds(12, 60, 133, 25);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(12, 88, 133, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblMinHour = new JLabel("Min Hrs:");
		lblMinHour.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMinHour.setBounds(187, 60, 133, 25);
		frame.getContentPane().add(lblMinHour);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(187, 88, 133, 39);
		frame.getContentPane().add(textField_1);
		
		JLabel lblMaxHrs = new JLabel("Max Hrs:");
		lblMaxHrs.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMaxHrs.setBounds(374, 60, 133, 25);
		frame.getContentPane().add(lblMaxHrs);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(374, 88, 133, 39);
		frame.getContentPane().add(textField_2);
	}
}
