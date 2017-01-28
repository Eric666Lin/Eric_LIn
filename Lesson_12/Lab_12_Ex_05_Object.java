public class Lab_12_Ex_05_Object
{
	private String firstName, lastName, avatar;
	private int userID;
	
	public Lab_12_Ex_05_Object(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public Lab_12_Ex_05_Object(String fN, String lN, String a)
	{
		firstName = fN;
		lastName = lN;
		avatar = a;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String toString()
	{
	   return "Customer Info...\nFirst Name: " + firstName +
							   "\nLast Name: " + lastName +
							   "\nAvatar: " + avatar +
							   "\nUser ID#: " + userID;
	}
}