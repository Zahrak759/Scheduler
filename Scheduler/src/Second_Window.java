import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import java.awt.List;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;

public class Second_Window extends Gui_Manger{

	public static int Index;//tracking the last table added
	private JFrame frame;
	private JTable table;
	Button button = new Button("Add Employee");
	private static Gui_Manger gui_Manger = new Gui_Manger();

	public static void DisplayWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Second_Window window = new Second_Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Second_Window() {
		initialize();
	}

	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int height = (int) (screenSize.getHeight() / 2);
		int Width = (int) (screenSize.getWidth() /2);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 892,541);
				
		JLabel lblEmployeeList = new JLabel("Employee List");
		lblEmployeeList.setFont(new Font("Tahoma", Font.PLAIN, 35));
		
		Button button_1 = new Button("Generate Schedule");
		button_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		table.setGridColor(Color.black);

		table.setGridColor(Color.BLACK);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Name", "Minimum hrs", "Maximum Hrs", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
			}
		));
		scrollPane.setViewportView(table);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblEmployeeList, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
							.addGap(606))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
							.addGap(198)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(20)
									.addComponent(button, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
								.addComponent(button_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
					.addGap(10))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addComponent(lblEmployeeList, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
							.addGap(3))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 307, Short.MAX_VALUE)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
					.addGap(10))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		addEmployee();
	}

	//adds to Table
	public void addToTable() {
		
	    Object[] row = {null, null, null, null, null, null, null, null, null, null};
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.addRow(row);

	}

	public void addEmployee() 
	{
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				addToTable();
				gui_Manger.DisplaySecondPopup();
			}
		});
	}
	
}
