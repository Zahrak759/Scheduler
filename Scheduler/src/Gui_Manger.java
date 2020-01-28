
public class Gui_Manger extends Main {


	public static void DisplayFirstWindow() {
		First_Window.DisplayWindow();
	}
	
	public static void FirstWindowPopUp() 
	{
		First_WindowPop_1.DisplayWindow();
	}
	
	public static void DisplaySecondWindow() 
	{
		Second_Window.DisplayWindow();
		First_Window.Close_Windows();
		First_WindowPop_1.Close_Windows();
	}	

	public static void DisplaySecondPopup() 
	{
		Second_WindowPop_1.DisplayWindow();
	}
	
}
