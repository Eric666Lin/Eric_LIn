import java.util.Scanner;
public class Lab_12_Ex_05_Runner
{
	static Scanner keyboard = new Scanner(System.in);
	private String firstName;
	private String lastName;
	private String avatar;
	private int userID;
	
	public Lab_12_Ex_05_Runner()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 1 + (int)(Math.random() * 1000000) ;
	}
	
	public Lab_12_Ex_05_Runner(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = 1 + (int)(Math.random() * 1000000) ;
	}
	
	public Lab_12_Ex_05_Runner(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = 1 + (int)(Math.random() * 1000000) ;
	}
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
								"\nLast Name: " + lastName +
								"\nAvatar: " + avatar +
								"\nUser ID#: " + userID;
	}
	
	public static void main(String[]args)
	{
		System.out.println("Please enter your first name.");
		String fN = keyboard.next();
		System.out.println("Please enter your last name.");
		String lN = keyboard.next();
		System.out.println("Would you like to use a public avatar? (y or n)");
		String decision = keyboard.next();
		if(decision == "n")
		{
			Lab_12_Ex_05_Runner Lab_12_Ex_05_Runner1 = new Lab_12_Ex_05_Runner(fN, lN);
			System.out.println("\n" + Lab_12_Ex_05_Runner1 + "\n");
		}
		else
		{
			System.out.println("Please enter your avatar.");
			String av = keyboard.next();
			Lab_12_Ex_05_Runner Lab_12_Ex_05_Runner1 = new Lab_12_Ex_05_Runner(fN, lN, av);
			System.out.println("\n" + Lab_12_Ex_05_Runner1 + "\n");
		}
	}

}