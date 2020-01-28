import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Choice;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class First_Window extends Gui_Manger{

	private static Gui_Manger gui_Manger = new Gui_Manger();
	
	static JFrame frame;
	private static JButton btnNewSchedule = new JButton("New Schedule");

	public static void DisplayWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First_Window window = new First_Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});	
	}
	
	/**
	 * Create the application.
	 */
	public First_Window() {
		initialize();
	}

	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int) (screenSize.getHeight() / 2);
		int Width = (int) (screenSize.getWidth() /2);
		
		frame = new JFrame();
		frame.setBounds(Width/2, height/2, 877,489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnNewSchedule.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		Choice choice = new Choice();
		
		JLabel lblSelectSchedule = new JLabel("  Select Schedule");
		lblSelectSchedule.setFont(new Font("Tahoma", Font.PLAIN, 25));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(202)
					.addComponent(btnNewSchedule, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
					.addGap(154)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSelectSchedule, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
						.addComponent(choice, GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
					.addGap(75))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(260)
					.addComponent(btnNewSchedule, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(231)
					.addComponent(lblSelectSchedule, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(choice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		frame.getContentPane().setLayout(groupLayout);
	
	
		New_Schedule();
	}

	public static void Close_Windows() {
		frame.setVisible(false);
	}
	
	private static void New_Schedule() //Action
	{
		btnNewSchedule.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				gui_Manger.FirstWindowPopUp();
			}
		});
	}
}
