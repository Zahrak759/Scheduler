
public class Employee {//is anyone alive

	private String Name;
	private String Email;
	private int Number;
	
	public boolean[]Availability = new boolean[7]; //representing 7 days
	
	public Employee(String name, String email, int number, boolean[] availability) 
	{
		Name = name;
		Email = email;
		Number = number;
		Availability = availability;
	}

	public void SetAvalibility() 
	{
		
	}
}
