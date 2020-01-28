import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class First_WindowPop_1 extends Gui_Manger{

	private static JFrame frame;
	private JTextField textField;
	private static JButton btnCreate = new JButton("Create");
	private Gui_Manger Gui_manger = new Gui_Manger();
	
	public static void DisplayWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First_WindowPop_1 window = new First_WindowPop_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}	

	public First_WindowPop_1() {
		initialize();
	}

	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int) (screenSize.getHeight() / 2);
		int Width = (int) (screenSize.getWidth() /2);
		
		frame = new JFrame();
		frame.setBounds(Width/2, height/2, 600,350);
		frame.getContentPane().setLayout(null);
		
		JLabel lblScheduleName = new JLabel("Schedule Name");
		lblScheduleName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblScheduleName.setBounds(173, 64, 222, 37);
		frame.getContentPane().add(lblScheduleName);
		
		btnCreate.setFont(new Font("Tahoma", Font.PLAIN, 30));

		btnCreate.setBounds(219, 235, 142, 55);
		frame.getContentPane().add(btnCreate);
		
		textField = new JTextField();
		textField.setBounds(187, 145, 200, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		CreateButton();	
	}

	private void CreateButton()//action 
	{
		btnCreate.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				//Create Button
				Gui_manger.DisplaySecondWindow();	
			}
		});	
	}

	public static void Close_Windows() {
		frame.setVisible(false);
	}
	
}
